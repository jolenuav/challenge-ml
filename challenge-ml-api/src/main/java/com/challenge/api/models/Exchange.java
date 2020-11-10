package com.challenge.api.models;

import java.io.Serializable;

public class Exchange implements Serializable {

	private static final long serialVersionUID = 3841555504161196578L;
	private String date;
	private String base;
	private Object rates;

	public Exchange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exchange(String date, String base, Object rates) {
		super();
		this.date = date;
		this.base = base;
		this.rates = rates;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Object getRates() {
		return rates;
	}

	public void setRates(Object rates) {
		this.rates = rates;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((rates == null) ? 0 : rates.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exchange other = (Exchange) obj;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (rates == null) {
			if (other.rates != null)
				return false;
		} else if (!rates.equals(other.rates))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Exchange [date=");
		builder.append(date);
		builder.append(", base=");
		builder.append(base);
		builder.append(", rates=");
		builder.append(rates);
		builder.append("]");
		return builder.toString();
	}

}
