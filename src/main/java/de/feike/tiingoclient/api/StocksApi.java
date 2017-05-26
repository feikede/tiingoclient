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
package de.feike.tiingoclient.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import de.feike.tiingoclient.ApiCallback;
import de.feike.tiingoclient.ApiClient;
import de.feike.tiingoclient.ApiException;
import de.feike.tiingoclient.ApiResponse;
import de.feike.tiingoclient.Configuration;
import de.feike.tiingoclient.Pair;
import de.feike.tiingoclient.ProgressRequestBody;
import de.feike.tiingoclient.ProgressResponseBody;
import de.feike.tiingoclient.model.Meta;

public class StocksApi {
	private ApiClient apiClient;

	public StocksApi() {
		this(Configuration.getDefaultApiClient());
	}

	public StocksApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/* Build call for dailySymbolGet */
	private com.squareup.okhttp.Call dailySymbolGetCall(String symbol, String authorization,
			final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/daily/{symbol}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "symbol" + "\\}",
				apiClient.escapeString(symbol.toString()));

		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (authorization != null)
			localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
						throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
				localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private com.squareup.okhttp.Call dailySymbolGetValidateBeforeCall(String symbol, String authorization,
			final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		// verify the required parameter 'symbol' is set
		if (symbol == null) {
			throw new ApiException("Missing the required parameter 'symbol' when calling dailySymbolGet(Async)");
		}

		// verify the required parameter 'authorization' is set
		if (authorization == null) {
			throw new ApiException("Missing the required parameter 'authorization' when calling dailySymbolGet(Async)");
		}

		com.squareup.okhttp.Call call = dailySymbolGetCall(symbol, authorization, progressListener,
				progressRequestListener);
		return call;

	}

	/**
	 * To request meta data for a stock
	 * 
	 * @param symbol
	 *            (required)
	 * @param authorization
	 *            (required)
	 * @return Meta
	 * @throws ApiException
	 *             If fail to call the API, e.g. server error or cannot
	 *             deserialize the response body
	 */
	public Meta dailySymbolGet(String symbol, String authorization) throws ApiException {
		ApiResponse<Meta> resp = dailySymbolGetWithHttpInfo(symbol, authorization);
		return resp.getData();
	}

	/**
	 * To request meta data for a stock
	 * 
	 * @param symbol
	 *            (required)
	 * @param authorization
	 *            (required)
	 * @return ApiResponse&lt;Meta&gt;
	 * @throws ApiException
	 *             If fail to call the API, e.g. server error or cannot
	 *             deserialize the response body
	 */
	public ApiResponse<Meta> dailySymbolGetWithHttpInfo(String symbol, String authorization) throws ApiException {
		com.squareup.okhttp.Call call = dailySymbolGetValidateBeforeCall(symbol, authorization, null, null);
		Type localVarReturnType = new TypeToken<Meta>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * To request meta data for a stock (asynchronously)
	 * 
	 * @param symbol
	 *            (required)
	 * @param authorization
	 *            (required)
	 * @param callback
	 *            The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException
	 *             If fail to process the API call, e.g. serializing the request
	 *             body object
	 */
	public com.squareup.okhttp.Call dailySymbolGetAsync(String symbol, String authorization,
			final ApiCallback<Meta> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if (callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = dailySymbolGetValidateBeforeCall(symbol, authorization, progressListener,
				progressRequestListener);
		Type localVarReturnType = new TypeToken<Meta>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}
}
