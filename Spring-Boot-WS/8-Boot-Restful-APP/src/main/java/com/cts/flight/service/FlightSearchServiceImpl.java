package com.cts.flight.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cts.flight.dao.FlightDao;
import com.cts.flight.entity.Fare;
import com.cts.flight.entity.Flight;
import com.cts.flight.model.SearchQuery;

@Service
public class FlightSearchServiceImpl {

	@Autowired
	private FlightDao flightDao;

	
	//Find Scheduled flights by Origin,Destination and FlightDate
	public List<Flight> findFlights(SearchQuery query) {

		List<Flight> flights = flightDao.findFlightByOriginAndDestinationAndFlightDate(query.getOrigin(),
				query.getDestination(), query.getFlightDate());

		flights = flights.stream().filter(flight -> flight.getInventory().getCount() >= query.getNumberofPassengers())
				.collect(Collectors.toList());

		return flights;

	}

	//Find Flight By Flight Schedule ID
	public Flight findFlightById(int id) {
		return flightDao.findById(id).orElse(null);
	}
	
	// find Flight By FlightNumber,origin,Destination and FLight Date
	public Flight findFlightByFlightNumberAndOriginAndDestinationAndFlightDate(SearchQuery query) {
		return flightDao.findByFlightNumberAndOriginAndDestinationAndFlightDate(query.getFlightNumber(), query.getOrigin(), query.getDestination(), query.getFlightDate());
	}
	
	
	// Find Fare of a given Scheduled Flight ID
	public Fare findFareByFlightId(int id) {
		return flightDao.findById(id).orElse(null).getFare();
	}
	
	//Find Fare of a Flight by FlightNumber,Origin, Destination and FlightDate
	public Fare getFareByQuery(SearchQuery query) {
		Flight flight= flightDao.findByFlightNumberAndOriginAndDestinationAndFlightDate(query.getFlightNumber(), query.getOrigin(), query.getDestination(), query.getFlightDate());
		return flight.getFare();
	}

}
