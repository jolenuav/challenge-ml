package com.challenge.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.api.models.IpCountry;

@FeignClient(name = "ip-country-service", url = "https://api.ip2country.info")
public interface IpCountryClient {

	@GetMapping(value = "/ip?{ip}")
	public IpCountry getCountryByIp(@PathVariable String ip);
}
