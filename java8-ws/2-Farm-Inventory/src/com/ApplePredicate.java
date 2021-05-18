package com;

import com.model.Apple;

@FunctionalInterface
public interface ApplePredicate {
	
	boolean test(Apple apple);

}
