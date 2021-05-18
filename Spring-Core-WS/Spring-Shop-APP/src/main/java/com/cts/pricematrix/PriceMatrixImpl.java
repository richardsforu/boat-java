package com.cts.pricematrix;

import org.springframework.stereotype.Repository;

@Repository
public class PriceMatrixImpl {
	
	
	
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrixImpl object created....");
	}
	
	
	public double getItemPrice(String itemCode) {
		// code to fetch price of a given item code from database
		return 100.00;
	}

}
