package com;

import java.util.function.Consumer;

public class LocalVariables_Ex1 {

	static String staVar = "static";
	String insVar = "instance";

	public static Consumer<String> getConsumerLambda() {

		String name = "Praveen";

		Consumer<String> consumer = s -> {
			System.out.println(s + " " + name);
			System.out.println(staVar);
		};

		// name="James"; // error

		return consumer;

	}

	public static void main(String[] args) {

		Consumer<String> consumer = getConsumerLambda();

		consumer.accept("Hello");

	}

}
