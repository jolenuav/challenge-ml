package com.challenge.api.models;

import java.io.Serializable;

public class Language implements Serializable {

	private static final long serialVersionUID = 2558226573080435221L;
	private String iso639_1;
	private String iso639_2;
	private String name;
	private String nativeName;

	public Language() {
	}

	public Language(String iso639_1, String iso639_2, String name, String nativeName) {
		this.iso639_1 = iso639_1;
		this.iso639_2 = iso639_2;
		this.name = name;
		this.nativeName = nativeName;
	}

	public String getIso639_1() {
		return iso639_1;
	}

	public void setIso639_1(String iso639_1) {
		this.iso639_1 = iso639_1;
	}

	public String getIso639_2() {
		return iso639_2;
	}

	public void setIso639_2(String iso639_2) {
		this.iso639_2 = iso639_2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNativeName() {
		return nativeName;
	}

	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iso639_1 == null) ? 0 : iso639_1.hashCode());
		result = prime * result + ((iso639_2 == null) ? 0 : iso639_2.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nativeName == null) ? 0 : nativeName.hashCode());
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
		Language other = (Language) obj;
		if (iso639_1 == null) {
			if (other.iso639_1 != null)
				return false;
		} else if (!iso639_1.equals(other.iso639_1))
			return false;
		if (iso639_2 == null) {
			if (other.iso639_2 != null)
				return false;
		} else if (!iso639_2.equals(other.iso639_2))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nativeName == null) {
			if (other.nativeName != null)
				return false;
		} else if (!nativeName.equals(other.nativeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Language [iso639_1=");
		builder.append(iso639_1);
		builder.append(", iso639_2=");
		builder.append(iso639_2);
		builder.append(", name=");
		builder.append(name);
		builder.append(", nativeName=");
		builder.append(nativeName);
		builder.append("]");
		return builder.toString();
	}

}
