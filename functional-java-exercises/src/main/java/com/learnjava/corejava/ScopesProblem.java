package com.learnjava.corejava;

import java.util.function.Function;

public class ScopesProblem {

	public static Function<Integer, Integer> counter() {
		
		int count = 0;
		Function<Integer, Integer> increment = (x) -> count + 1;
		
		//Does not work, value of count has been locked in by the lambda expression above 
		//count = 10;

		//return increment.apply(count);
		return increment;
		
	}
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> counter = ScopesProblem.counter();
		System.out.println(counter.apply(0));
		//System.out.println(ScopesProblem.counter());

	}

}
