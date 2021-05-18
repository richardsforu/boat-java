package com.cts.pss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.pss.dao.PassengerDao;
import com.cts.pss.entity.Passenger;

@Controller
public class PassengerSearchController {
	
	
	@Autowired
	private PassengerDao passengerDao;
	
	@RequestMapping(value = "/")
	public String welcome(ModelMap map) {
		
		map.addAttribute("passengers", passengerDao.findAll());
		
		return "index";
	}
	
	@RequestMapping("/find")
	public String test(@RequestParam("passengerId")int passengerId,ModelMap map) {
		
		Passenger passenger= passengerDao.findById(passengerId).orElse(null);
		map.addAttribute("passengers", passengerDao.findAll());
		map.addAttribute("coPassengers", passenger.getCoPassengers());
		return "index";
	}

}
