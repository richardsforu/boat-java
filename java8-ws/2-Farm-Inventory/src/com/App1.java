package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.model.Apple;
import com.model.Color;

public class App1 {

	public static void main(String[] args) {

		List<Apple> inventory = Arrays.asList(
				new Apple(Color.GREEN, 80), 
				new Apple(Color.GREEN, 155),
				new Apple(Color.GREEN, 200),
				new Apple(Color.RED, 120));

		/*
		// filter Green apples?
		filterGreenApples(inventory).forEach(apple -> {
			System.out.println(apple);
		});
		
		System.out.println("-----------------------");
		filterRedApples(inventory).forEach(apple -> {
			System.out.println(apple);
		});
	
		
		
		
		// filter apples by color
		
		filterApplesByColor(inventory, Color.RED).forEach(apple->{
			System.out.println(apple);
		});
		
	
		
		// filter apples by weight
		
		// filter by color
		filterApple(inventory, Color.GREEN, 0, true).forEach(apple->{
			System.out.println(apple);
		});
		
		
		// filter by weight
		System.out.println("--------------------------");
		filterApple(inventory, null, 80, false).forEach(apple->{
			System.out.println(apple);
		});
		
		*/
		
		
		/*
		filterApples(inventory,new Predicate<Apple>() {
			@Override
			public boolean test(Apple apple) {
				// TODO Auto-generated method stub
				return apple.getColor().equals(Color.GREEN);
			}
		}).forEach(apple->{
				System.out.println(apple);
		});
		
		*/
		 
		
		/*
		 System.out.println("--------------------------------------");
		
		// through lamda expression
		 filterApples(inventory, (Apple apple)->{ // java 1.8 and above 
			 return apple.getColor().equals(Color.GREEN);
		 }).forEach(apple->{
			 System.out.println(apple);
		 });
		 
		 */
		 
		 
		/*
		 filterApples(inventory, apple->{
			 return apple.getColor().equals(Color.RED);
		 }).forEach(apple->{
			 System.out.println(apple);
		 });
		 
		 */
		
		
		  filterApples(inventory, apple->apple.getColor().equals(Color.GREEN));
		  filterApples(inventory, apple->apple.getColor().equals(Color.RED));
		  filterApples(inventory, apple->apple.getWeight()>150);
		  filterApples(inventory, apple->apple.getColor().equals(Color.GREEN) && apple.getWeight()>150);

		  
		 
		 
		
		
		
	}
	
	
	
	// #4 ==> behavior parameterization
	
	public static List<Apple> filterApples(List<Apple> inventory,Predicate<Apple> predicate) {
		
		List<Apple> out = new ArrayList<>();
		
		for (Apple apple : inventory) {
			if(predicate.test(apple)) {
				out.add(apple);
			}
		}


		return out;
		
	}
	
	
	
	// # 3
	public static  List<Apple> filterApple(List<Apple> inventory,Color color,int weight, boolean flag) {
	
		List<Apple> out = new ArrayList<>();
		
		for (Apple apple : inventory) {
			if(flag && apple.getColor().equals(color))
				out.add(apple);	
			if(!flag && apple.getWeight() > weight)
				out.add(apple);
			}
		
		return out;

	}
	
	// #2
	public static List<Apple> filterApplesByColor(List<Apple> inventory,Color color) {
		
		List<Apple> out = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getColor().equals(color))
				out.add(apple);
		}
		return out;

	}
	
	
	
	

	// #1
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> out = new ArrayList<>();

		for (Apple apple : inventory) {
			if (apple.getColor().equals(Color.GREEN))
				out.add(apple);
		}
		return out;
	}
	
	public static List<Apple> filterRedApples(List<Apple> inventory) {
		List<Apple> out = new ArrayList<>();

		for (Apple apple : inventory) {
			if (apple.getColor().equals(Color.RED))
				out.add(apple);
		}
		return out;
	}
}
