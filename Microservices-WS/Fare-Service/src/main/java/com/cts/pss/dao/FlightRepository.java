package com.cts.pss.dao;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{
	
	Flight getFlightByFlightNumberAndOriginAndDestinationAndFlightDate(String flightNumber,String origin,String destination,LocalDate flightDate);

}
