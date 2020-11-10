package com.challenge.api.models;

import java.io.Serializable;

public class IpCountry implements Serializable {

	private static final long serialVersionUID = -2863035615832397610L;
	private String countryCode;
	private String countryCode3;
	private String countryName;
	private String countryEmoji;

	public IpCountry() {
	}

	public IpCountry(String countryCode, String countryCode3, String countryName, String countryEmoji) {
		this.countryCode = countryCode;
		this.countryCode3 = countryCode3;
		this.countryName = countryName;
		this.countryEmoji = countryEmoji;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryCode3() {
		return countryCode3;
	}

	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryEmoji() {
		return countryEmoji;
	}

	public void setCountryEmoji(String countryEmoji) {
		this.countryEmoji = countryEmoji;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IpCountry [countryCode=");
		builder.append(countryCode);
		builder.append(", countryCode3=");
		builder.append(countryCode3);
		builder.append(", countryName=");
		builder.append(countryName);
		builder.append(", countryEmoji=");
		builder.append(countryEmoji);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + ((countryCode3 == null) ? 0 : countryCode3.hashCode());
		result = prime * result + ((countryEmoji == null) ? 0 : countryEmoji.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
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
		IpCountry other = (IpCountry) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (countryCode3 == null) {
			if (other.countryCode3 != null)
				return false;
		} else if (!countryCode3.equals(other.countryCode3))
			return false;
		if (countryEmoji == null) {
			if (other.countryEmoji != null)
				return false;
		} else if (!countryEmoji.equals(other.countryEmoji))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		return true;
	}

}
