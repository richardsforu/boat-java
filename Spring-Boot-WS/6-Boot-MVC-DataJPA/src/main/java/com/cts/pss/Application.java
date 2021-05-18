package com.cts.pss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.pss.dao.PassengerDao;
import com.cts.pss.entity.CoPassenger;
import com.cts.pss.entity.Passenger;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
	 
		
		ApplicationContext ac=SpringApplication.run(Application.class, args);
	  
		/*
		PassengerDao dao = ac.getBean(PassengerDao.class);
	  
	  Passenger passenger = dao.findById(99).orElse(null);
	  
	  System.out.println(passenger);
	  
	  for(CoPassenger cp: passenger.getCoPassengers()) {
		  System.out.println(cp);
	  }
	  
	  */
	  
	}

}
