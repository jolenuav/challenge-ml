package com.challenge.api.resource;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.api.models.Country;
import com.challenge.api.models.DataGeneral;
import com.challenge.api.models.Exchange;
import com.challenge.api.models.IpCountry;
import com.challenge.api.service.DataCountryService;

@RestController
public class DataCountryResource {

	@Autowired
	DataCountryService service;

	@GetMapping(value = "/testIP/{ip}")
	public IpCountry getCountryByIp(@PathVariable String ip) {
		return service.testIpCountry(ip);
	}

	@GetMapping(value = "/country")
	public Country getCountryByCode(@RequestParam String code) {
		return service.getCountryByCode(code);
	}

	@GetMapping(value = "/exchange/USD")
	public Exchange convert(@RequestParam String symbols) {
		return service.convert(symbols);
	}

	@GetMapping(value = "/encode/{value}")
	public String encode(@PathVariable String value) {
		return Base64.getEncoder().encodeToString(value.getBytes());
	}

	@GetMapping(value = "/country/{ip}")
	public DataGeneral findCountryByIP(@PathVariable String ip) {
		return service.findCountryByIP(ip);
	}

}
