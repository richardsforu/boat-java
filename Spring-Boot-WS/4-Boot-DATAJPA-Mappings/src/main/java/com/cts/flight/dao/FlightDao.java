package com.cts.flight.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.flight.entity.Flight;
import com.cts.flight.entity.FlightInfo;

public interface FlightDao extends JpaRepository<Flight, Integer>{
	
	// using DSL // Domain specific language
	
	//  => use keywords like  find,list, fetch, update,delete etc
	//  => use 'By' work before any property/column name
	//  => use predefined operator names for conjuction of more than one column
	
	 // list all flights by given / specific date 
	
	
	 List<Flight> findByFlightDate(LocalDate flightDate);
	 /*
	  * Notes of DSL
	  * 1. Every property after 'By' work should belongs to entity class defined in the JpaRepository 
	  */
	 
	 // list all flights by origin name
	  List<Flight> findByOrigin(String origin);
	  List<Flight> findByDestination(String s1);
	
	  // find flights flying by origin and destination
	  
	  List<Flight> findByOriginAndDestination(String origin,String destination);
	
	
	  List<Flight> findByOriginAndDestinationAndFlightDate(String origin,String destination,LocalDate flightDate);
	  
	  
	  // Query methods
	  
	  @Query(value = "from Flight") // JQL
	  List<Flight> displayAllFlights();
	  
	  @Query(value = "from Flight f where f.flightInfo=3")
	  Flight getFlightNames();
	  
	  @Query(value = "from Flight f where f.origin= :origin and f.destination= :destination")
	  List<Flight> findFlightsByQuery(String origin,String destination);
	  
	  @Query(value = "from Flight f where f.origin= :s1 and f.destination= :s2")
	  List<Flight> findFlightsByQueryV1(@Param("s1")String ori,@Param("s2")String dest);
	  
	  @Query(value = "from Flight f where f.origin='Delhi' and f.destination='Chennai' and f.flightDate='2021-05-26' and f.fare.fare <=9000")
	  List<Flight> filterFlight();
	 
	  
	  
	  
	  
	  

}
