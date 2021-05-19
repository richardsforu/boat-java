package com.cts.pss.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
public class PersonRestController {
	
	
	/*
	 * HTTP Status Response Codes
	 * ----------------------------
	 * 
	 * ---------------------------------------------
	 *  1x - 100 to 199 -> Information
	 *  2x - 200 to 299 -> success
	 *  3x - 300 to 399 -> Redirection
	 *  4x - 400 to 499 -> client error
	 *  5x - 500 to 599 -> server side error
	 *  --------------------------------------------
	 *  
	 *  HTTP request Methods
	 *  -------------------------------
	 *  
	 *  GET  -> default method from any browser
	 *  POST
	 *  PUT
	 *  PATCH
	 *  DELETE
	 * 
	 * 
	 * 
	 */
	

	@GetMapping
	public String f1() {
		return "GET Request method";
	}
	
	@GetMapping("/{id}")
	public String f12(@PathVariable int id) {
		return "GET Request method - f12 "+id;
	}

	@GetMapping("/byName/{name}")
	public String f13(@PathVariable String name) {
		return "GET Request method - f12 "+name;
	}
	

	@GetMapping("/v1")
	public String f11() {
		return "GET Request method V1";
	}
	
	@PostMapping
	public String f2() {
		return "POST Request method";
	}
	
	@PutMapping
	public String f3() {
		return "PUT Request method";
	}
	
	
	@PatchMapping
	public String f4() {
		return "PATCH Request method";
	}
	
	@DeleteMapping
	public String f5() {
		return "DELETE Request method";
	}
	
	

}
