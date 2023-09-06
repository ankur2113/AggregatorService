package com.reset.AggregatorService.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "service-bb", url = "http://localhost:6161/api/serviceBB")
public interface ServiceBBClient {
	
	@GetMapping("/dataBB")
	public ResponseEntity<String> getDataFromBB();
}
