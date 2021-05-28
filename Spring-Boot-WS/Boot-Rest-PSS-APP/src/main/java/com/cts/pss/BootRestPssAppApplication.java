package com.cts.pss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class BootRestPssAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(BootRestPssAppApplication.class, args);
		
	//	BookingService bs = ac.getBean(BookingService.class);
		
		//CoPassengerRepository pr = ac.getBean(CoPassengerRepository.class);
		//PassengerDao p=ac.getBean(PassengerDao.class);
		//CoPassenger cp = pr.findById(205).orElse(null);
		//pr.deleteById(205)
		//p.deleteById(203);
		
		/**
		BookingRepository br = ac.getBean(BookingRepository.class);
		//br.deleteById(190);
	
		BookingRecord br1 = br.findById(174).orElse(null);
		BookingService bs=ac.getBean(BookingService.class);
		
		List<CoPassenger> cps=new ArrayList<>();
		List<CoPassenger> cpl = br1.getPassenger().getCoPassengers();
		
		for(CoPassenger cp: cpl) {
			if(cp.getCopassengerId()==177) {
				System.out.println(">>>>>>>>>>>>>>>>> <<<<<<<<<<<<<");
				System.out.println(cp.getCopassengerId());
				cps.add(cp);
			}
			
		}
	
		bs.customCancelBooking(174, cps);
		
		
		//List<CoPassenger> cpl = br1.getPassenger().getCoPassengers();
		*/
		
		/*
		for(CoPassenger cp:cpl) {
			if(cp.getCopassengerId()==180) {
				pr.deleteCopassengersById(180);
				pr.deleteByCopassengerId(180);
				//p.deleteByCoPassengers_CopassengerId(180);
				
			}
		}
		*/
		
		
		
	}

}
