package com.challenge.api.service;

import com.challenge.api.models.Country;
import com.challenge.api.models.DataGeneral;
import com.challenge.api.models.Exchange;
import com.challenge.api.models.IpCountry;

public interface DataCountryService {

	public IpCountry testIpCountry(String ip);
	public Country getCountryByCode(String code);
	public Exchange convert(String symbols);
	public DataGeneral findCountryByIP(String ip);
}
