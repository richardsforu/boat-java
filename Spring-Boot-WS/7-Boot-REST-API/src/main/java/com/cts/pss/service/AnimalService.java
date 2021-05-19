package com.cts.pss.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.cts.pss.model.Animal;

@Service
public class AnimalService {

	private List<Animal> animals = new ArrayList<>();

	@Bean
	public void addAnimals() {

		Animal a1 = new Animal(UUID.randomUUID(), "Tommy", "Lab", 10, "India");
		Animal a2 = new Animal(UUID.randomUUID(), "Jimmy", "German Shepard", 9, "India");
		Animal a3 = new Animal(UUID.randomUUID(), "Teddy", "Lab", 2, "India");
		Animal a4 = new Animal(UUID.randomUUID(), "Blacky", "Pomerian", 7, "USA");
		Animal a5 = new Animal(UUID.randomUUID(), "Rosey", "Lab", 3, "USA");

		animals.add(a1);
		animals.add(a2);
		animals.add(a3);
		animals.add(a4);
		animals.add(a5);
	}

	// list all animals
	public List<Animal> findAll() {
		return animals;
	}

	// find animal by ID
	public Animal findById(Object id) {

		for (Animal animal : animals) {
			if (animal.getId()==id) {
				return animal;
			}
		}

		return null;
	}

	// find animals by name
	public List<Animal> findByName(String name) {
		return animals.stream().filter(animal -> animal.getName().equals(name)).collect(Collectors.toList());
	}

	// find animals by age
	public List<Animal> findByAge(int age) {
		return animals.stream().filter(animal -> animal.getAge() == age).collect(Collectors.toList());
	}

	// find animals by Type
	public List<Animal> findByType(String type) {
		return animals.stream().filter(animal -> animal.getType().equals(type)).collect(Collectors.toList());
	}

	// find animals by Country
	public List<Animal> findByCountry(String country) {
		return animals.stream().filter(animal -> animal.getCountry().equals(country)).collect(Collectors.toList());
	}

}
