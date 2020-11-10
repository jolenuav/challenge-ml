package com.challenge.api.models;

import java.io.Serializable;
import java.util.List;

public class RegionalBloc implements Serializable {

	private static final long serialVersionUID = -7518645821362969861L;
	private String acronym;
	private String name;
	private List<String> otherAcronyms;
	private List<String> otherNames;

	public RegionalBloc() {
	}

	public RegionalBloc(String acronym, String name, List<String> otherAcronyms, List<String> otherNames) {
		this.acronym = acronym;
		this.name = name;
		this.otherAcronyms = otherAcronyms;
		this.otherNames = otherNames;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getOtherAcronyms() {
		return otherAcronyms;
	}

	public void setOtherAcronyms(List<String> otherAcronyms) {
		this.otherAcronyms = otherAcronyms;
	}

	public List<String> getOtherNames() {
		return otherNames;
	}

	public void setOtherNames(List<String> otherNames) {
		this.otherNames = otherNames;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acronym == null) ? 0 : acronym.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((otherAcronyms == null) ? 0 : otherAcronyms.hashCode());
		result = prime * result + ((otherNames == null) ? 0 : otherNames.hashCode());
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
		RegionalBloc other = (RegionalBloc) obj;
		if (acronym == null) {
			if (other.acronym != null)
				return false;
		} else if (!acronym.equals(other.acronym))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (otherAcronyms == null) {
			if (other.otherAcronyms != null)
				return false;
		} else if (!otherAcronyms.equals(other.otherAcronyms))
			return false;
		if (otherNames == null) {
			if (other.otherNames != null)
				return false;
		} else if (!otherNames.equals(other.otherNames))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegionalBloc [acronym=");
		builder.append(acronym);
		builder.append(", name=");
		builder.append(name);
		builder.append(", otherAcronyms=");
		builder.append(otherAcronyms);
		builder.append(", otherNames=");
		builder.append(otherNames);
		builder.append("]");
		return builder.toString();
	}

}
