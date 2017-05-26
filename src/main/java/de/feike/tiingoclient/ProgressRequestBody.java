/*
 * Copyright (C) 2017 Rainer Feike
 * www.feike.de
 * 
 * tiingoclient - an API to the services at api.tiingo.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Some parts of the code were originally created by swagger-codegen
 * https://github.com/swagger-api/swagger-codegen.git
 * 
 */
package de.feike.tiingoclient;

import java.io.IOException;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;

import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

public class ProgressRequestBody extends RequestBody {

	public interface ProgressRequestListener {
		void onRequestProgress(long bytesWritten, long contentLength, boolean done);
	}

	private final RequestBody requestBody;

	private final ProgressRequestListener progressListener;

	private BufferedSink bufferedSink;

	public ProgressRequestBody(RequestBody requestBody, ProgressRequestListener progressListener) {
		this.requestBody = requestBody;
		this.progressListener = progressListener;
	}

	@Override
	public MediaType contentType() {
		return requestBody.contentType();
	}

	@Override
	public long contentLength() throws IOException {
		return requestBody.contentLength();
	}

	@Override
	public void writeTo(BufferedSink sink) throws IOException {
		if (bufferedSink == null) {
			bufferedSink = Okio.buffer(sink(sink));
		}

		requestBody.writeTo(bufferedSink);
		bufferedSink.flush();

	}

	private Sink sink(Sink sink) {
		return new ForwardingSink(sink) {

			long bytesWritten = 0L;
			long contentLength = 0L;

			@Override
			public void write(Buffer source, long byteCount) throws IOException {
				super.write(source, byteCount);
				if (contentLength == 0) {
					contentLength = contentLength();
				}

				bytesWritten += byteCount;
				progressListener.onRequestProgress(bytesWritten, contentLength, bytesWritten == contentLength);
			}
		};
	}
}
