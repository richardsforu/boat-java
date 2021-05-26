package com.cts.pss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.pss.model.Fare;

@RestController
@RequestMapping("/api/makemytrip/fare")
public class TestRestController {
	
	// Capture fare data from fare service
	
	@Autowired
	private RestTemplate rt; // JMS
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
	@GetMapping
	public Fare getFare() {
	 Fare fare=rt.getForObject("http://localhost:8081/api/pss/fare/57", Fare.class);
	 return fare;
	}

}
