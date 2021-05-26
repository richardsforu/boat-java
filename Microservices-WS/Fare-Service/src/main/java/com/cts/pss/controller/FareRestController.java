package com.cts.pss.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.entity.Fare;
import com.cts.pss.service.FareService;

@RestController
@RequestMapping("/api/pss/fare")
public class FareRestController {

	@Autowired
	private FareService fareService;

	@GetMapping("/{flightNumber}/{origin}/{destination}/{flightDate}")
	public Fare getFare(@PathVariable String flightNumber, @PathVariable String origin,
			@PathVariable String destination, @PathVariable @DateTimeFormat(iso = ISO.DATE) LocalDate flightDate) {
		return fareService.getFare(flightNumber, origin, destination, flightDate);
	}

	@GetMapping("/{id}")
	public Fare getFareByFlightId(@PathVariable int id) {
		return fareService.getFareByFlightId(id);
	}

}
