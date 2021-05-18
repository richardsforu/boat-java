package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.model.Apple;
import com.model.Color;
import static  java.util.Comparator.comparing;

public class Ex2 {
	public static void main(String[] args) {
		
		
		// 1
		
		List<Apple> inventory = Arrays.asList(
				new Apple(Color.GREEN, 80), 
				new Apple(Color.GREEN, 70),
				new Apple(Color.GREEN, 200),
				new Apple(Color.RED, 120));
		
		
		
		// way -1  lamda - syntax - sort
		
		//System.out.println(inventory);
		//inventory.sort((a1,a2)->a1.getWeight()-a2.getWeight());
		//System.out.println(inventory);
		
		// way -2 method referance - syantx
		//inventory.sort(comparing(Apple::getWeight));  f(g(h())
		//System.out.println(inventory);
		
		Function<Apple, Integer> getWight=Apple::getWeight;
		Comparator<Apple> byWeight=comparing(getWight);
		inventory.sort(byWeight);
		System.out.println(inventory);
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}
}
