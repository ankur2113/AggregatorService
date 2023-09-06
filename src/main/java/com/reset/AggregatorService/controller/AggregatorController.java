package com.reset.AggregatorService.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reset.AggregatorService.config.ServiceAAClient;
import com.reset.AggregatorService.config.ServiceBBClient;

@RestController
@RequestMapping("/api/aggregator")
public class AggregatorController {
	
	@Autowired
	private ServiceAAClient serviceAAClient;
	
	@Autowired
	private ServiceBBClient serviceBBClient;
	
	
	@GetMapping("/data")
    public ResponseEntity<Map<String, ResponseEntity<String>>> aggregateData() {
        Map<String, ResponseEntity<String>> aggregatedData = new HashMap<>();
        aggregatedData.put("service-aa", serviceAAClient.getDataFromAA());
        aggregatedData.put("service-bb", serviceBBClient.getDataFromBB());
        return ResponseEntity.ok(aggregatedData);
    }
	

}
