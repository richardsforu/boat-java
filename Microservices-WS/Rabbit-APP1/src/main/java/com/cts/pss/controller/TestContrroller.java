package com.cts.pss.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class TestContrroller {
	
	@Autowired
	private RabbitTemplate rt;
	
	@Bean
	public Queue q1() {
		return new Queue("TestQ1",false);
	}
	
	@Bean
	public Queue q2() {
		return new Queue("OrderQ",false);
	}
	
	@Bean
	public void m1() {
		
		Map<String, Object> data=new HashMap<>();
		
		data.put("ORDER_ID", "Abc20122272");
		data.put("ORDER_DATE", LocalDateTime.now());
		data.put("USER", "praveen@gmail.com");
		data.put("TOTAL",654322);
		
		
		rt.convertAndSend("OrderQ",data);

		rt.convertAndSend("TestQ1","Test message 4");
	}
	
	

}
