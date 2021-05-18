package com.cts.pricematrix;

//Dependency
public class PriceMatrixImpl {
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrixImpl object created....");
	}
	
	/*
	 * How many types of Objects? 2 types
	 * ------------------------------------
	 *    -> dependency object: never depends on any other objects. works independently
	 *    -> dependent object: always depends on dependency objects.
	 */

	public double getItemPrice(String itemCode) {
		// code to fetch price of a given item code from database
		return 100.00;
	}

}
