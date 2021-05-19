package com.cts.pss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.model.Animal;
import com.cts.pss.service.AnimalService;

@RestController
@RequestMapping("/api/animals")
public class AnimalRestController {

	@Autowired
	private AnimalService as;

	// with out filter, list all animals
	@GetMapping
	public List<Animal> listAllAnimals() {
		
		return as.findAll();
	}

	// find animal by ID:: Single Object return
	@GetMapping("/{animalId}")
	public Animal findById(@PathVariable Object animalId) {
		return as.findById(animalId);
	}

	// find animals by name
	@GetMapping("/name/{animalName}")
	public List<Animal> filterAnumalsByName(@PathVariable String animalName) {
		return as.findByName(animalName);
	}

	// find animals by age
	@GetMapping("/age/{animalAge}")
	public List<Animal> filterAnumalsByAge(@PathVariable int animalAge) {
		return as.findByAge(animalAge);
	}

	// find animals by type only
	@GetMapping("/type/{animalType}")
	public List<Animal> filterAnumalsByType(@PathVariable String animalType) {

		return as.findByType(animalType);
	}

	// find animals by type only
	@GetMapping("/country/{country}")
	public List<Animal> filterAnumalsByCountry(@PathVariable String country) {

		return as.findByCountry(country);
	}

}
