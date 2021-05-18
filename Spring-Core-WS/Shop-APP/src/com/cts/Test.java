package com.cts;

import com.cts.bill.BillingImpl;
import com.cts.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item1", "Item2" };
		
		
		//------------------------------------------------
		PriceMatrixImpl price=new PriceMatrixImpl(); // dependency class

		BillingImpl biller = new BillingImpl(); // dependent class
		biller.setPrice(price); //injecting/passing dependency object (price) to the dependent class object (biller) : DI
		
		//-------------------------------------------------


		double total = biller.getCartTotal(cart1);
		
		System.out.println("Cart1 Total is " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total is " + total);

	}

}
