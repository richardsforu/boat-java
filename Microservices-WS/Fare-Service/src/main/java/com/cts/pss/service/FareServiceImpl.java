package com.cts.pss.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.dao.FlightRepository;
import com.cts.pss.entity.Fare;

@Service
public class FareServiceImpl implements FareService {
	
	@Autowired
	private FlightRepository flightDao;
	
	// Find Flight by flightNumber,origin,destination and flying date
	@Override
	public Fare getFare(String flightNumber,String origin,String destination,LocalDate flightDate) {
		return flightDao.getFlightByFlightNumberAndOriginAndDestinationAndFlightDate(flightNumber, origin, destination, flightDate).getFare();
	}
	
	// find Fare By Flight ID
	@Override
	public Fare getFareByFlightId(int id) {
		return flightDao.findById(id).orElse(null).getFare();
				
	}
	
	
	

}
