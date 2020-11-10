package com.challenge.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.challenge.api.models.Exchange;

@FeignClient(name = "exchange-service", url = "http://data.fixer.io/api/")
public interface ExchangeClient {

	@GetMapping(value = "/latest")
	public Exchange convert(@RequestParam String access_key, @RequestParam String symbols);
}
