package com.challenge.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.api.models.Country;

@FeignClient(name = "country-service", url = "https://restcountries.eu/rest/v2")
public interface CountryClient {

	@GetMapping(value = "/alpha/{code}")
	public Country getCountryByCode(@PathVariable String code);
}
