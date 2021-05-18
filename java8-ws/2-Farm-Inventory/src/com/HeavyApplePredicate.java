package com;

import com.model.Apple;

public class HeavyApplePredicate implements ApplePredicate{
	
	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getWeight() > 150;
	}

}
