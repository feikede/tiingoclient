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

import org.joda.time.LocalDate;

import com.google.gson.reflect.TypeToken;

import de.feike.tiingoclient.ApiCallback;
import de.feike.tiingoclient.ApiClient;
import de.feike.tiingoclient.ApiException;
import de.feike.tiingoclient.ApiResponse;
import de.feike.tiingoclient.Configuration;
import de.feike.tiingoclient.Pair;
import de.feike.tiingoclient.ProgressRequestBody;
import de.feike.tiingoclient.ProgressResponseBody;
import de.feike.tiingoclient.model.Price;

public class QoutesApi {
	private ApiClient apiClient;

	public QoutesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public QoutesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/* Build call for dailySymbolPricesGet */
	private com.squareup.okhttp.Call dailySymbolPricesGetCall(String symbol, String authorization, LocalDate startDate,
			LocalDate endDate, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/daily/{symbol}/prices".replaceAll("\\{format\\}", "json")
				.replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		if (startDate != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
		if (endDate != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));

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

	private com.squareup.okhttp.Call dailySymbolPricesGetValidateBeforeCall(String symbol, String authorization,
			LocalDate startDate, LocalDate endDate, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		// verify the required parameter 'symbol' is set
		if (symbol == null) {
			throw new ApiException("Missing the required parameter 'symbol' when calling dailySymbolPricesGet(Async)");
		}

		// verify the required parameter 'authorization' is set
		if (authorization == null) {
			throw new ApiException(
					"Missing the required parameter 'authorization' when calling dailySymbolPricesGet(Async)");
		}

		com.squareup.okhttp.Call call = dailySymbolPricesGetCall(symbol, authorization, startDate, endDate,
				progressListener, progressRequestListener);
		return call;

	}

	/**
	 * quote data for a fund or stock
	 * 
	 * @param symbol
	 *            (required)
	 * @param authorization
	 *            Your auth from www.tiingo.com (required)
	 * @param startDate
	 *            Earliest date to request EOD qoutes for (optional)
	 * @param endDate
	 *            Last date to request EOD qoutes for (optional)
	 * @return List&lt;Price&gt;
	 * @throws ApiException
	 *             If fail to call the API, e.g. server error or cannot
	 *             deserialize the response body
	 */
	public List<Price> dailySymbolPricesGet(String symbol, String authorization, LocalDate startDate, LocalDate endDate)
			throws ApiException {
		ApiResponse<List<Price>> resp = dailySymbolPricesGetWithHttpInfo(symbol, authorization, startDate, endDate);
		return resp.getData();
	}

	/**
	 * quote data for a fund or stock
	 * 
	 * @param symbol
	 *            (required)
	 * @param authorization
	 *            Your auth from www.tiingo.com (required)
	 * @param startDate
	 *            Earliest date to request EOD qoutes for (optional)
	 * @param endDate
	 *            Last date to request EOD qoutes for (optional)
	 * @return ApiResponse&lt;List&lt;Price&gt;&gt;
	 * @throws ApiException
	 *             If fail to call the API, e.g. server error or cannot
	 *             deserialize the response body
	 */
	public ApiResponse<List<Price>> dailySymbolPricesGetWithHttpInfo(String symbol, String authorization,
			LocalDate startDate, LocalDate endDate) throws ApiException {
		com.squareup.okhttp.Call call = dailySymbolPricesGetValidateBeforeCall(symbol, authorization, startDate,
				endDate, null, null);
		Type localVarReturnType = new TypeToken<List<Price>>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * quote data for a fund or stock (asynchronously)
	 * 
	 * @param symbol
	 *            (required)
	 * @param authorization
	 *            Your auth from www.tiingo.com (required)
	 * @param startDate
	 *            Earliest date to request EOD qoutes for (optional)
	 * @param endDate
	 *            Last date to request EOD qoutes for (optional)
	 * @param callback
	 *            The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException
	 *             If fail to process the API call, e.g. serializing the request
	 *             body object
	 */
	public com.squareup.okhttp.Call dailySymbolPricesGetAsync(String symbol, String authorization, LocalDate startDate,
			LocalDate endDate, final ApiCallback<List<Price>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = dailySymbolPricesGetValidateBeforeCall(symbol, authorization, startDate,
				endDate, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<Price>>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}
}
