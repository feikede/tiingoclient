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
package de.feike.tiingoclient.model;

import java.util.Objects;

import org.joda.time.LocalDate;

import com.google.gson.annotations.SerializedName;

/**
 * Meta
 */
public class Meta {
	@SerializedName("ticker")
	private String ticker = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("exchangeCode")
	private String exchangeCode = null;

	@SerializedName("startDate")
	private LocalDate startDate = null;

	@SerializedName("endDate")
	private LocalDate endDate = null;

	public Meta ticker(String ticker) {
		this.ticker = ticker;
		return this;
	}

	/**
	 * Ticker related to the asset
	 * 
	 * @return ticker
	 **/
	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public Meta description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Long text asset information
	 * 
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Meta name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Long-form descripton of the asset
	 * 
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Meta exchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
		return this;
	}

	/**
	 * What exchange the price data belongs to. If null it means the data is a
	 * mutual fund or a composite of different exchanges.
	 * 
	 * @return exchangeCode
	 **/
	public String getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public Meta startDate(LocalDate startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * Get startDate
	 * 
	 * @return startDate
	 **/
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public Meta endDate(LocalDate endDate) {
		this.endDate = endDate;
		return this;
	}

	/**
	 * Get endDate
	 * 
	 * @return endDate
	 **/
	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Meta meta = (Meta) o;
		return Objects.equals(this.ticker, meta.ticker) && Objects.equals(this.description, meta.description)
				&& Objects.equals(this.name, meta.name) && Objects.equals(this.exchangeCode, meta.exchangeCode)
				&& Objects.equals(this.startDate, meta.startDate) && Objects.equals(this.endDate, meta.endDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ticker, description, name, exchangeCode, startDate, endDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Meta {\n");

		sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    exchangeCode: ").append(toIndentedString(exchangeCode)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
