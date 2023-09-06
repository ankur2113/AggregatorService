package com.reset.AggregatorService.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-aa", url = "http://localhost:6061/api/serviceAA")
public interface ServiceAAClient {
	
	@GetMapping("/dataAA")
	public ResponseEntity<String> getDataFromAA();

}
