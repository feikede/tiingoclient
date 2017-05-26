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

import org.joda.time.DateTime;

import com.google.gson.annotations.SerializedName;

/**
 * Price
 */
public class Price {
	@SerializedName("open")
	private Float open = null;

	@SerializedName("high")
	private Float high = null;

	@SerializedName("low")
	private Float low = null;

	@SerializedName("close")
	private Float close = null;

	@SerializedName("volume")
	private Float volume = null;

	@SerializedName("adjOpen")
	private Float adjOpen = 0.0f;

	@SerializedName("adjHigh")
	private Float adjHigh = 0.0f;

	@SerializedName("adjLow")
	private Float adjLow = 0.0f;

	@SerializedName("adjClose")
	private Float adjClose = 0.0f;

	@SerializedName("adjVolume")
	private Float adjVolume = 0.0f;

	@SerializedName("date")
	private DateTime date = null;

	@SerializedName("divCash")
	private Float divCash = 0.0f;

	@SerializedName("splitFactor")
	private Float splitFactor = 1.0f;

	public Price open(Float open) {
		this.open = open;
		return this;
	}

	/**
	 * Get open
	 * 
	 * @return open
	 **/
	public Float getOpen() {
		return open;
	}

	public void setOpen(Float open) {
		this.open = open;
	}

	public Price high(Float high) {
		this.high = high;
		return this;
	}

	/**
	 * Get high
	 * 
	 * @return high
	 **/
	public Float getHigh() {
		return high;
	}

	public void setHigh(Float high) {
		this.high = high;
	}

	public Price low(Float low) {
		this.low = low;
		return this;
	}

	/**
	 * Get low
	 * 
	 * @return low
	 **/
	public Float getLow() {
		return low;
	}

	public void setLow(Float low) {
		this.low = low;
	}

	public Price close(Float close) {
		this.close = close;
		return this;
	}

	/**
	 * Get close
	 * 
	 * @return close
	 **/
	public Float getClose() {
		return close;
	}

	public void setClose(Float close) {
		this.close = close;
	}

	public Price volume(Float volume) {
		this.volume = volume;
		return this;
	}

	/**
	 * Get volume
	 * 
	 * @return volume
	 **/
	public Float getVolume() {
		return volume;
	}

	public void setVolume(Float volume) {
		this.volume = volume;
	}

	public Price adjOpen(Float adjOpen) {
		this.adjOpen = adjOpen;
		return this;
	}

	/**
	 * Get adjOpen
	 * 
	 * @return adjOpen
	 **/
	public Float getAdjOpen() {
		return adjOpen;
	}

	public void setAdjOpen(Float adjOpen) {
		this.adjOpen = adjOpen;
	}

	public Price adjHigh(Float adjHigh) {
		this.adjHigh = adjHigh;
		return this;
	}

	/**
	 * Get adjHigh
	 * 
	 * @return adjHigh
	 **/
	public Float getAdjHigh() {
		return adjHigh;
	}

	public void setAdjHigh(Float adjHigh) {
		this.adjHigh = adjHigh;
	}

	public Price adjLow(Float adjLow) {
		this.adjLow = adjLow;
		return this;
	}

	/**
	 * Get adjLow
	 * 
	 * @return adjLow
	 **/
	public Float getAdjLow() {
		return adjLow;
	}

	public void setAdjLow(Float adjLow) {
		this.adjLow = adjLow;
	}

	public Price adjClose(Float adjClose) {
		this.adjClose = adjClose;
		return this;
	}

	/**
	 * Get adjClose
	 * 
	 * @return adjClose
	 **/
	public Float getAdjClose() {
		return adjClose;
	}

	public void setAdjClose(Float adjClose) {
		this.adjClose = adjClose;
	}

	public Price adjVolume(Float adjVolume) {
		this.adjVolume = adjVolume;
		return this;
	}

	/**
	 * Get adjVolume
	 * 
	 * @return adjVolume
	 **/
	public Float getAdjVolume() {
		return adjVolume;
	}

	public void setAdjVolume(Float adjVolume) {
		this.adjVolume = adjVolume;
	}

	public Price date(DateTime date) {
		this.date = date;
		return this;
	}

	/**
	 * Get date
	 * 
	 * @return date
	 **/
	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	public Price divCash(Float divCash) {
		this.divCash = divCash;
		return this;
	}

	/**
	 * Get divCash
	 * 
	 * @return divCash
	 **/
	public Float getDivCash() {
		return divCash;
	}

	public void setDivCash(Float divCash) {
		this.divCash = divCash;
	}

	public Price splitFactor(Float splitFactor) {
		this.splitFactor = splitFactor;
		return this;
	}

	/**
	 * Get splitFactor
	 * 
	 * @return splitFactor
	 **/
	public Float getSplitFactor() {
		return splitFactor;
	}

	public void setSplitFactor(Float splitFactor) {
		this.splitFactor = splitFactor;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Price price = (Price) o;
		return Objects.equals(this.open, price.open) && Objects.equals(this.high, price.high)
				&& Objects.equals(this.low, price.low) && Objects.equals(this.close, price.close)
				&& Objects.equals(this.volume, price.volume) && Objects.equals(this.adjOpen, price.adjOpen)
				&& Objects.equals(this.adjHigh, price.adjHigh) && Objects.equals(this.adjLow, price.adjLow)
				&& Objects.equals(this.adjClose, price.adjClose) && Objects.equals(this.adjVolume, price.adjVolume)
				&& Objects.equals(this.date, price.date) && Objects.equals(this.divCash, price.divCash)
				&& Objects.equals(this.splitFactor, price.splitFactor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(open, high, low, close, volume, adjOpen, adjHigh, adjLow, adjClose, adjVolume, date,
				divCash, splitFactor);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Price {\n");

		sb.append("    open: ").append(toIndentedString(open)).append("\n");
		sb.append("    high: ").append(toIndentedString(high)).append("\n");
		sb.append("    low: ").append(toIndentedString(low)).append("\n");
		sb.append("    close: ").append(toIndentedString(close)).append("\n");
		sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
		sb.append("    adjOpen: ").append(toIndentedString(adjOpen)).append("\n");
		sb.append("    adjHigh: ").append(toIndentedString(adjHigh)).append("\n");
		sb.append("    adjLow: ").append(toIndentedString(adjLow)).append("\n");
		sb.append("    adjClose: ").append(toIndentedString(adjClose)).append("\n");
		sb.append("    adjVolume: ").append(toIndentedString(adjVolume)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    divCash: ").append(toIndentedString(divCash)).append("\n");
		sb.append("    splitFactor: ").append(toIndentedString(splitFactor)).append("\n");
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
