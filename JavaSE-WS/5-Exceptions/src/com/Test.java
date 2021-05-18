package com;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args){

		HotelServiceImpl hs = new HotelServiceImpl();
		List<Hotel> hotels = hs.findByCity("PUNE");

		if (hotels.size() != 0) {
			hotels.forEach(hotel -> {
				System.out.println(hotel.getId());
				System.out.println(hotel.getName());
				System.out.println(hotel.getLocation());
				System.out.println("---------------------------");
			});
		} else {
			throw new NoSuchHotelFoundException("No Hotels Found");
		}

	}

}
