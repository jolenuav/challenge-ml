package com.challenge.api.models;

import java.util.List;

public class Country {
	private String name;
	private List<String> topLevelDomain;
	private String alpha2Code;
	private String alpha3Code;
	private List<String> callingCodes;
	private String capital;
	private List<String> altSpellings;
	private String region;
	private String subregion;
	private Integer population;
	private List<Double> latlng;
	private String demonym;
	private Double area;
	private Double gini;
	private List<String> timezones;
	private List<String> borders;
	private String nativeName;
	private String numericCode;
	private List<Currency> currencies;
	private List<Language> languages;
	private Translation translations;
	private String flag;
	private List<RegionalBloc> regionalBlocs;
	private String cioc;

	public Country() {
	}

	public Country(String name, List<String> topLevelDomain, String alpha2Code, String alpha3Code,
			List<String> callingCodes, String capital, List<String> altSpellings, String region, String subregion,
			Integer population, List<Double> latlng, String demonym, Double area, Double gini, List<String> timezones,
			List<String> borders, String nativeName, String numericCode, List<Currency> currencies,
			List<Language> languages, Translation translations, String flag, List<RegionalBloc> regionalBlocs,
			String cioc) {
		this.name = name;
		this.topLevelDomain = topLevelDomain;
		this.alpha2Code = alpha2Code;
		this.alpha3Code = alpha3Code;
		this.callingCodes = callingCodes;
		this.capital = capital;
		this.altSpellings = altSpellings;
		this.region = region;
		this.subregion = subregion;
		this.population = population;
		this.latlng = latlng;
		this.demonym = demonym;
		this.area = area;
		this.gini = gini;
		this.timezones = timezones;
		this.borders = borders;
		this.nativeName = nativeName;
		this.numericCode = numericCode;
		this.currencies = currencies;
		this.languages = languages;
		this.translations = translations;
		this.flag = flag;
		this.regionalBlocs = regionalBlocs;
		this.cioc = cioc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopLevelDomain() {
		return topLevelDomain;
	}

	public void setTopLevelDomain(List<String> topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
	}

	public String getAlpha2Code() {
		return alpha2Code;
	}

	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}

	public String getAlpha3Code() {
		return alpha3Code;
	}

	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}

	public List<String> getCallingCodes() {
		return callingCodes;
	}

	public void setCallingCodes(List<String> callingCodes) {
		this.callingCodes = callingCodes;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<String> getAltSpellings() {
		return altSpellings;
	}

	public void setAltSpellings(List<String> altSpellings) {
		this.altSpellings = altSpellings;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public List<Double> getLatlng() {
		return latlng;
	}

	public void setLatlng(List<Double> latlng) {
		this.latlng = latlng;
	}

	public String getDemonym() {
		return demonym;
	}

	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getGini() {
		return gini;
	}

	public void setGini(Double gini) {
		this.gini = gini;
	}

	public List<String> getTimezones() {
		return timezones;
	}

	public void setTimezones(List<String> timezones) {
		this.timezones = timezones;
	}

	public List<String> getBorders() {
		return borders;
	}

	public void setBorders(List<String> borders) {
		this.borders = borders;
	}

	public String getNativeName() {
		return nativeName;
	}

	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}

	public String getNumericCode() {
		return numericCode;
	}

	public void setNumericCode(String numericCode) {
		this.numericCode = numericCode;
	}

	public List<Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public Translation getTranslations() {
		return translations;
	}

	public void setTranslations(Translation translations) {
		this.translations = translations;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<RegionalBloc> getRegionalBlocs() {
		return regionalBlocs;
	}

	public void setRegionalBlocs(List<RegionalBloc> regionalBlocs) {
		this.regionalBlocs = regionalBlocs;
	}

	public String getCioc() {
		return cioc;
	}

	public void setCioc(String cioc) {
		this.cioc = cioc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alpha2Code == null) ? 0 : alpha2Code.hashCode());
		result = prime * result + ((alpha3Code == null) ? 0 : alpha3Code.hashCode());
		result = prime * result + ((altSpellings == null) ? 0 : altSpellings.hashCode());
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((borders == null) ? 0 : borders.hashCode());
		result = prime * result + ((callingCodes == null) ? 0 : callingCodes.hashCode());
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((cioc == null) ? 0 : cioc.hashCode());
		result = prime * result + ((currencies == null) ? 0 : currencies.hashCode());
		result = prime * result + ((demonym == null) ? 0 : demonym.hashCode());
		result = prime * result + ((flag == null) ? 0 : flag.hashCode());
		result = prime * result + ((gini == null) ? 0 : gini.hashCode());
		result = prime * result + ((languages == null) ? 0 : languages.hashCode());
		result = prime * result + ((latlng == null) ? 0 : latlng.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nativeName == null) ? 0 : nativeName.hashCode());
		result = prime * result + ((numericCode == null) ? 0 : numericCode.hashCode());
		result = prime * result + ((population == null) ? 0 : population.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((regionalBlocs == null) ? 0 : regionalBlocs.hashCode());
		result = prime * result + ((subregion == null) ? 0 : subregion.hashCode());
		result = prime * result + ((timezones == null) ? 0 : timezones.hashCode());
		result = prime * result + ((topLevelDomain == null) ? 0 : topLevelDomain.hashCode());
		result = prime * result + ((translations == null) ? 0 : translations.hashCode());
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
		Country other = (Country) obj;
		if (alpha2Code == null) {
			if (other.alpha2Code != null)
				return false;
		} else if (!alpha2Code.equals(other.alpha2Code))
			return false;
		if (alpha3Code == null) {
			if (other.alpha3Code != null)
				return false;
		} else if (!alpha3Code.equals(other.alpha3Code))
			return false;
		if (altSpellings == null) {
			if (other.altSpellings != null)
				return false;
		} else if (!altSpellings.equals(other.altSpellings))
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (borders == null) {
			if (other.borders != null)
				return false;
		} else if (!borders.equals(other.borders))
			return false;
		if (callingCodes == null) {
			if (other.callingCodes != null)
				return false;
		} else if (!callingCodes.equals(other.callingCodes))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (cioc == null) {
			if (other.cioc != null)
				return false;
		} else if (!cioc.equals(other.cioc))
			return false;
		if (currencies == null) {
			if (other.currencies != null)
				return false;
		} else if (!currencies.equals(other.currencies))
			return false;
		if (demonym == null) {
			if (other.demonym != null)
				return false;
		} else if (!demonym.equals(other.demonym))
			return false;
		if (flag == null) {
			if (other.flag != null)
				return false;
		} else if (!flag.equals(other.flag))
			return false;
		if (gini == null) {
			if (other.gini != null)
				return false;
		} else if (!gini.equals(other.gini))
			return false;
		if (languages == null) {
			if (other.languages != null)
				return false;
		} else if (!languages.equals(other.languages))
			return false;
		if (latlng == null) {
			if (other.latlng != null)
				return false;
		} else if (!latlng.equals(other.latlng))
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
		if (numericCode == null) {
			if (other.numericCode != null)
				return false;
		} else if (!numericCode.equals(other.numericCode))
			return false;
		if (population == null) {
			if (other.population != null)
				return false;
		} else if (!population.equals(other.population))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (regionalBlocs == null) {
			if (other.regionalBlocs != null)
				return false;
		} else if (!regionalBlocs.equals(other.regionalBlocs))
			return false;
		if (subregion == null) {
			if (other.subregion != null)
				return false;
		} else if (!subregion.equals(other.subregion))
			return false;
		if (timezones == null) {
			if (other.timezones != null)
				return false;
		} else if (!timezones.equals(other.timezones))
			return false;
		if (topLevelDomain == null) {
			if (other.topLevelDomain != null)
				return false;
		} else if (!topLevelDomain.equals(other.topLevelDomain))
			return false;
		if (translations == null) {
			if (other.translations != null)
				return false;
		} else if (!translations.equals(other.translations))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country [name=");
		builder.append(name);
		builder.append(", topLevelDomain=");
		builder.append(topLevelDomain);
		builder.append(", alpha2Code=");
		builder.append(alpha2Code);
		builder.append(", alpha3Code=");
		builder.append(alpha3Code);
		builder.append(", callingCodes=");
		builder.append(callingCodes);
		builder.append(", capital=");
		builder.append(capital);
		builder.append(", altSpellings=");
		builder.append(altSpellings);
		builder.append(", region=");
		builder.append(region);
		builder.append(", subregion=");
		builder.append(subregion);
		builder.append(", population=");
		builder.append(population);
		builder.append(", latlng=");
		builder.append(latlng);
		builder.append(", demonym=");
		builder.append(demonym);
		builder.append(", area=");
		builder.append(area);
		builder.append(", gini=");
		builder.append(gini);
		builder.append(", timezones=");
		builder.append(timezones);
		builder.append(", borders=");
		builder.append(borders);
		builder.append(", nativeName=");
		builder.append(nativeName);
		builder.append(", numericCode=");
		builder.append(numericCode);
		builder.append(", currencies=");
		builder.append(currencies);
		builder.append(", languages=");
		builder.append(languages);
		builder.append(", translations=");
		builder.append(translations);
		builder.append(", flag=");
		builder.append(flag);
		builder.append(", regionalBlocs=");
		builder.append(regionalBlocs);
		builder.append(", cioc=");
		builder.append(cioc);
		builder.append("]");
		return builder.toString();
	}

}
