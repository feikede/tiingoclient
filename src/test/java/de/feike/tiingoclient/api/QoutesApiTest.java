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

import java.util.List;

import org.joda.time.LocalDate;
import org.junit.Ignore;
import org.junit.Test;

import de.feike.tiingoclient.ApiException;
import de.feike.tiingoclient.model.Price;

/**
 * API tests for QoutesApi
 */
@Ignore
public class QoutesApiTest extends TestBase {

	private final QoutesApi api = new QoutesApi();

	/**
	 * quote data for a fund or stock
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void dailySymbolPricesGetTest() throws ApiException {

		LocalDate startDate = new LocalDate(2017, 5, 1);
		LocalDate endDate = new LocalDate(2017, 5, 24);
		List<Price> response = api.dailySymbolPricesGet("intc", this.getAuthorization(), startDate, endDate);
		System.out.println(response.get(0).toString());
		// TODO: test validations
	}

}
