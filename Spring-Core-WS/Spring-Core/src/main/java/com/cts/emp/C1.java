package com.cts.emp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class C1 {

	public C1() {
		System.out.println("--- C1 clas object craeted....");
	}

}
