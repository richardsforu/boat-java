package com;

public class Test {

	public static void main(String[] args) {
		
		//Bank b=new Bank();
		//b.lockerAccess();
		
		Customer cust=new Bank();
		Manager m=new Bank();
		Admin a=new Bank();
		Cleark c=new Bank();
		c.clerkOperations();
		
		a.lockerAccess();
		
		m.closeAccount();
		cust.withDraw();
		
		
		
		
		
		
		
		
	}

}
