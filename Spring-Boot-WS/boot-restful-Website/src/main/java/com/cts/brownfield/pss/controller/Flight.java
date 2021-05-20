package com.cts.brownfield.pss.controller;

import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {

	private long id;

	private String flightNumber;
	private String origin;
	private String destination;
	private LocalDate flightDate;
	private LocalTime flightTime;
	private String duration;

	private Fare fare;
	private double flightFare;

	public Flight() {
		super();
	}

	public Flight(String flightNumber, String origin, String destination,  LocalDate flightDate,
			LocalTime flightTime, String duration,Fare fare) {
		
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
		this.fare = fare;

	}
	public Flight(long id,String flightNumber, String origin, String destination,  LocalDate flightDate,
			LocalTime flightTime, String duration,double flightFare) {
		this.id=id;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
		//this.fare = fare;
		this.flightFare=flightFare;

	}



	public LocalTime getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(LocalTime flightTime) {
		this.flightTime = flightTime;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	
	
	public double getFlightFare() {
		return flightFare;
	}

	public void setFlightFare(double flightFare) {
		this.flightFare = flightFare;
	}

	public Fare getFare() {
		return fare;
	}

	public void setFare(Fare fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNUmber=" + flightNumber + ", origin=" + origin + ", destination="
				+ destination + ", flightDate=" + flightDate + ", fares=" + fare + "]";
	}

}
