package com.cts.pss.service;

import java.time.LocalDate;

import com.cts.pss.entity.Fare;

public interface FareService {

	// Find Flight by flightNumber,origin,destination and flying date
	Fare getFare(String flightNumber, String origin, String destination, LocalDate flightDate);

	// find Fare By Flight ID
	Fare getFareByFlightId(int id);

}