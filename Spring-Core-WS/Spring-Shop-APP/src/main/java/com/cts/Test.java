package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.bill.BillingImpl;
import com.cts.config.AppConfig;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item1", "Item2" };
		
		
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);// ioc
		BillingImpl biller = ac.getBean(BillingImpl.class);
		

		double total = biller.getCartTotal(cart1);
		
		System.out.println("Cart1 Total is " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total is " + total);

	}

}
