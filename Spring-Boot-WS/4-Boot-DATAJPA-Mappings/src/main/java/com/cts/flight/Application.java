package com.cts.flight;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.flight.dao.FlightDao;
import com.cts.flight.entity.Flight;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);

		FlightDao flightDao = ac.getBean(FlightDao.class);

		// list all data of flight entity

		// flightDao.findAll().forEach(flight->{
		// System.out.println(flight);
		// });

		// list flights flying on date 2021-05-26 date only

		/*
		 * flightDao.findByFlightDate(LocalDate.of(2021, 05, 21)).forEach(flight->{
		 * System.out.println(flight); });
		 * 
		 */

		// list all flights by origin

//		flightDao.findByOrigin("Chennai").forEach(flight->{
//			System.out.println(flight);
//		});

//		flightDao.findByDestination("Hyderabad").forEach(flight->{
//			System.out.println(flight);
//		});

//		flightDao.findByOriginAndDestination("Delhi", "Chennai").forEach(flight->{
//			System.out.println(flight);
//		});

		/*
		flightDao.findByOriginAndDestinationAndFlightDate("Delhi", "Chennai", LocalDate.of(2021, 05, 26))
				.forEach(flight -> {
					System.out.println(flight);
					System.out.println(flight.getFare().getFareId());
					System.out.println(flight.getFare().getFare());
					System.out.println(flight.getInventory().getInvId());
					System.out.println(flight.getInventory().getCount());
					System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineName());

				});
				
			*/
		
		
		/*
		flightDao.displayAllFlights().forEach(flight->{
			System.out.println(flight);
			System.out.println(flight.getFare().getFareId());
			System.out.println(flight.getFare().getFare());
			System.out.println(flight.getInventory().getInvId());
			System.out.println(flight.getInventory().getCount());
			System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineName());
		});
		
		*/
		
		
		/*
		Flight flight = flightDao.getFlightNames();
		
		System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineName());
		System.out.println(flight.getFlightDate());
		System.out.println(flight.getOrigin());
		System.out.println(flight.getDestination());
		System.out.println(flight.getFare().getFare());
		
		*/
		
		//List<Flight> flights = flightDao.findFlightsByQueryV1("Delhi","Chennai");
		List<Flight> flights=flightDao.filterFlight();
		flights.forEach(flight->{
			System.out.println(flight);	
			System.out.println(flight.getFare().getFare());
		});
		
	}

}
