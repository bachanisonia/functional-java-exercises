package com.learnjava.corejava;

import java.util.function.Function;

public class ComposableFunctions {

	public static void main(String[] args) {
		
		Function<Integer, Integer> increment = x -> x + 1;
		Function<Integer, Integer> doubles = x -> x * 2;
		
		int i = 10;
		
		//doubles.apply(increment.apply(i));
		Function<Integer, Integer> combine = increment.andThen(doubles);
		
		System.out.println(combine.apply(i));
		
		Function<Integer, Integer> combine2 = increment.andThen(doubles.andThen(increment.andThen(doubles)));
		System.out.println(combine2.apply(i));
		
		
		Function<String, String> trimLeading = String::stripLeading;
		Function<String, String> trimTrailing = String::stripTrailing;
		Function<String, String> upperCase = String::toUpperCase;
		
		System.out.println(trimLeading
				.andThen(trimTrailing
				.andThen(upperCase))
				.apply("  Hello World   "));
		
	

	}

}
