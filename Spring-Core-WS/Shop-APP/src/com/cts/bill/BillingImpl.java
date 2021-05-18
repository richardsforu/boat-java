package com.cts.bill;

import com.cts.pricematrix.PriceMatrixImpl;

//Dependent
public class BillingImpl {
	
	/*
	 * 		Design Issues
	 * 	----------------------
	 * 
	 * 	-> Too many dependency object creations.
	 * 		-> memory / perfomence issues
	 * 		-> code maintanence is very difficult
	 * 
	 *   Why this issue happened?
	 *   ---------------------------
	 *   -> Dependent class itself creating dependency class object directly.
	 *   
	 *   What is the Solution?
	 *   -----------------------
	 *   -> Do don't create dependency class object in the dependent class
	 *   -> instead, use techniques like JNDI look up techniques
	 *   	-> JNDI location is tightly binded with dependent class object
	 *   
	 *  What is the best solution?
	 *  -----------------------------
	 *  -> do not create or look up, 
	 *      instead ask some one (container) to inject/pass dependency object to dependent object.
	 *      this is called IoC (Inversion of control) 
	 *      
	 *   How to implement IOC?
	 *   ------------------------
	 *   using dependency injection (DI) technique .
	 *   
	 *   What is Dependency Injection (DI) ?
	 *   ---------------------------------------]
	 *   -> Injecting/passing dependency object to the dependent object.
	 *   
	 *   How many ways DI can be implemented? : 2 ways
	 *   ----------------------------------------------
	 *   way 1: using setter based injection
	 *   way 2: using constructor based injection
	 *   
	 *    way 1: using setter based injection
	 *    ----------------------------------------
	 *    rules
	 *    --------
	 *    1. define dependency class reference at class level in dependent class.
	 *    2. create setter for the above defined reference variable.
	 *   
	 */
	
	
	private PriceMatrixImpl price; //dependency  class ref
	
	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}




	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
