package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HotelServiceImpl {
	
	Hotel h1 = new Hotel(1, "Abc", "CHN");
	Hotel h2 = new Hotel(2, "Xyz", "HYD");
	Hotel h3 = new Hotel(3, "Aaa", "GOA");
	Hotel h4 = new Hotel(4, "Bbb", "HYD");
	Hotel h5 = new Hotel(5, "Ccc", "HYD");

	List<Hotel> hotels = Arrays.asList(h1, h2, h3, h4, h5);

	public Hotel findHotelById(int id) {
		return null;
	}

	public List<Hotel> findByCity(String city) {
		
		return hotels.stream().filter(hotel->hotel.getLocation().equals(city)).collect(Collectors.toList());
	}
}
