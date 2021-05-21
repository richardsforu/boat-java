package com.cts.pss.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.entity.Fare;
import com.cts.pss.entity.Flight;
import com.cts.pss.model.SearchQuery;
import com.cts.pss.service.FlightSearchService;

@RestController
@RequestMapping("/api/pss")
public class PSSRestController {

	@Autowired
	private FlightSearchService searchService;

	@GetMapping("/{origin}/{destination}/{flightDate}/{travellers}")
	public List<Flight> listScheduledFlights(@PathVariable String origin, @PathVariable String destination,
			@PathVariable @DateTimeFormat(iso = ISO.DATE) LocalDate flightDate, @PathVariable int travellers) {
		return searchService.listScheduledFlights(origin, destination, flightDate,travellers);
				
	}
	
	@PostMapping
	public List<Flight> filterFlighs(@RequestBody SearchQuery query){

		return searchService.findFlights(query);
	}

	@PostMapping("/addFlight")
	public Flight scheduleFlight(@RequestBody Flight flight) {
		System.out.println(flight);
		return searchService.scheduleFlight(flight);
	}
	
	
	// get Flight fare By ID
	@GetMapping("/{flightId}")
	public Fare findFareByFlightId(@PathVariable int flightId){
		return searchService.findFareByFlightId(flightId);
	}
	
	// get Fare by Flight Number,Origin,Destination and Flying Date
	@PostMapping("/fare")
	public Fare getFareByQuery(@RequestBody SearchQuery query) {
		return searchService.getFareByQuery(query);
	}
	
	
	
	
	
	
}
