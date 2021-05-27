package com.cts.pss.controller;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
@Controller
public class TestController {
	
	
	@RabbitListener(queues = "TestQ1")
	public void m2(String s1) {
		System.out.println(">>>>>>>>>>>> APP2:: Receiver<<<<<<<<<<");
		System.out.println(s1);
		System.out.println("-----------------------------------------");
	}
	
	@RabbitListener(queues = "OrderQ")
	public void m3(Map<String, Object> orderDetails) {
		System.out.println(">>>>>>>>>>>> APP2:: Receiver<<<<<<<<<<");
		System.out.println("Order ID: "+orderDetails.get("ORDER_ID"));
		System.out.println("Ordered Date: "+orderDetails.get("ORDER_DATE"));
		System.out.println("User Name: "+orderDetails.get("USER"));
		System.out.println("Total : "+orderDetails.get("TOTAL"));


		System.out.println("-----------------------------------------");
	}
	
	

}
