package com.cts;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class C2 {

	
	public C2() {
		System.out.println("--- C2 class obejct created...");
	}
	
	
	

}
