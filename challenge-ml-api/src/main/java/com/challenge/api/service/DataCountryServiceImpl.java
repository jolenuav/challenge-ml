package com.challenge.api.service;

import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.challenge.api.client.CountryClient;
import com.challenge.api.client.ExchangeClient;
import com.challenge.api.client.IpCountryClient;
import com.challenge.api.models.Country;
import com.challenge.api.models.Currency;
import com.challenge.api.models.DataGeneral;
import com.challenge.api.models.Exchange;
import com.challenge.api.models.IpCountry;

@Service
public class DataCountryServiceImpl implements DataCountryService {

	// Coordenadas de Buenos Aires según
	// https://www.geodatos.net/coordenadas/argentina/buenos-aires
	Double lat1 = -34.61315;
	Double lon1 = -58.37723;

	@Autowired
	IpCountryClient ipCountryClient;
	@Autowired
	CountryClient countryClient;
	@Autowired
	ExchangeClient exchangeClient;
	@Value("${service.exchange.api-key}")
	private String apiKey;

	@Override
	public IpCountry testIpCountry(String ip) {
		return ipCountryClient.getCountryByIp(ip);
	}

	@Override
	public Country getCountryByCode(String code) {
		return countryClient.getCountryByCode(code);
	}

	@Override
	public Exchange convert(String symbols) {
		return exchangeClient.convert(decode(apiKey), symbols);
	}

	@Override
	public DataGeneral findCountryByIP(String ip) {
		IpCountry ipCountry = ipCountryClient.getCountryByIp(ip);
		Country country = countryClient.getCountryByCode(ipCountry.getCountryCode());
		Currency currency = country.getCurrencies().get(0);
		String symbols = currency.getCode() + ",USD";
		Exchange exchange = exchangeClient.convert(decode(apiKey), symbols);
		double distance = calculateDistance(country.getLatlng().get(0), country.getLatlng().get(1));
		DataGeneral dataGeneral = new DataGeneral();
		dataGeneral.setCountryName(country.getName());
		dataGeneral.setCountryISO(country.getAlpha2Code());
		dataGeneral.setLanguages(country.getLanguages());
		dataGeneral.setHours(getHours(country.getTimezones()));
		dataGeneral.setCountryFlag(country.getFlag());
		dataGeneral.setDistanceBA(distance);
		dataGeneral.setCurrency(currency.getCode());
		dataGeneral.setRate(exchange.getRates());
		System.out.println(dataGeneral);
		return dataGeneral;
	}

	protected String decode(String value) {
		return new String(Base64.getDecoder().decode(value));
	}

	protected double calculateDistance(double lat2, double lon2) {
		// Radio medio de la tierra
		Double earthRadius = 6371.0;
		// RADIANTS
		double dlat = Math.toRadians(lat2 - lat1);
		double dlon = Math.toRadians(lon2 - lon1);
		double rlat1 = Math.toRadians(lat1);
		double rlat2 = Math.toRadians(lat2);
		// FORMULA
		// a = sin²(dlat/2) + cos lat1 ⋅ cos lat2 ⋅ sin²(dlon/2)
		// c = 2 ⋅ atan2( √a, √(1−a) )
		// d = R ⋅ c
		double a = Math.pow(Math.sin(dlat / 2), 2)
				+ Math.cos(rlat1) * Math.cos(rlat2) * Math.pow(Math.sin(dlon / 2), 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = earthRadius * c;
		return distance;
	}

	protected List<String> getHours(List<String> utcs) {
		List<String> list = new ArrayList<String>();
		for (String utc : utcs) {
			utc = utc.replace("UTC", "");
			if (Strings.isNotEmpty(utc.trim())) {
				ZoneOffset zoneOffset = ZoneOffset.of(utc);
				list.add(LocalTime.now(zoneOffset.normalized()).toString());
			}
		}
		if (list.isEmpty()) {
			return null;
		}
		return list;
	}

	public static void main(String[] args) {
		double lat1 = -34.61315;
		double lon1 = -58.37723;
		double lat2 = 8.0;
		double lon2 = -66.0;
		// Radio medio de la tierra
		Double earthRadius = 6371.0;
		// RADIANTS
		double dlat = Math.toRadians(lat2 - lat1);
		double dlon = Math.toRadians(lon2 - lon1);
		lat1 = Math.toRadians(lat1);
		lat2 = Math.toRadians(lat2);
		// FORMULA
		// a = sin²(dlat/2) + cos lat1 ⋅ cos lat2 ⋅ sin²(dlon/2)
		// c = 2 ⋅ atan2( √a, √(1−a) )
		// d = R ⋅ c
		double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = earthRadius * c;
		System.out.println(distance);
	}
}
