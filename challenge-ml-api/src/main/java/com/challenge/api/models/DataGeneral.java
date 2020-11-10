package com.challenge.api.models;

import java.io.Serializable;
import java.util.List;

public class DataGeneral implements Serializable {

	private static final long serialVersionUID = -1346231833837071854L;
	private String countryName;
	private String countryISO;
	private String countryFlag;
	private List<Language> languages;
	private List<String> hours;
	private Double distanceBA;
	private String currency;
	private Object rate;

	public DataGeneral() {
	}

	public DataGeneral(String countryName, String countryISO, String countryFlag, List<Language> languages,
			List<String> hours, Double distanceBA, String currency, Object rate) {
		this.countryName = countryName;
		this.countryISO = countryISO;
		this.countryFlag = countryFlag;
		this.languages = languages;
		this.hours = hours;
		this.distanceBA = distanceBA;
		this.currency = currency;
		this.rate = rate;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryISO() {
		return countryISO;
	}

	public void setCountryISO(String countryISO) {
		this.countryISO = countryISO;
	}

	public String getCountryFlag() {
		return countryFlag;
	}

	public void setCountryFlag(String countryFlag) {
		this.countryFlag = countryFlag;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public List<String> getHours() {
		return hours;
	}

	public void setHours(List<String> hours) {
		this.hours = hours;
	}

	public Double getDistanceBA() {
		return distanceBA;
	}

	public void setDistanceBA(Double distanceBA) {
		this.distanceBA = distanceBA;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Object getRate() {
		return rate;
	}

	public void setRate(Object rate) {
		this.rate = rate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryFlag == null) ? 0 : countryFlag.hashCode());
		result = prime * result + ((countryISO == null) ? 0 : countryISO.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((distanceBA == null) ? 0 : distanceBA.hashCode());
		result = prime * result + ((hours == null) ? 0 : hours.hashCode());
		result = prime * result + ((languages == null) ? 0 : languages.hashCode());
		result = prime * result + ((rate == null) ? 0 : rate.hashCode());
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
		DataGeneral other = (DataGeneral) obj;
		if (countryFlag == null) {
			if (other.countryFlag != null)
				return false;
		} else if (!countryFlag.equals(other.countryFlag))
			return false;
		if (countryISO == null) {
			if (other.countryISO != null)
				return false;
		} else if (!countryISO.equals(other.countryISO))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (distanceBA == null) {
			if (other.distanceBA != null)
				return false;
		} else if (!distanceBA.equals(other.distanceBA))
			return false;
		if (hours == null) {
			if (other.hours != null)
				return false;
		} else if (!hours.equals(other.hours))
			return false;
		if (languages == null) {
			if (other.languages != null)
				return false;
		} else if (!languages.equals(other.languages))
			return false;
		if (rate == null) {
			if (other.rate != null)
				return false;
		} else if (!rate.equals(other.rate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataGeneral [countryName=");
		builder.append(countryName);
		builder.append(", countryISO=");
		builder.append(countryISO);
		builder.append(", countryFlag=");
		builder.append(countryFlag);
		builder.append(", languages=");
		builder.append(languages);
		builder.append(", hours=");
		builder.append(hours);
		builder.append(", distanceBA=");
		builder.append(distanceBA);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", rate=");
		builder.append(rate);
		builder.append("]");
		return builder.toString();
	}

}
