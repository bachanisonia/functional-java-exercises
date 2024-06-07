package com.learnjava.corejava;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class JDKFunctionalInterfacesDemo {

	public static void main(String[] args) {
		
		//Function<Integer, Integer> myFunc = (x) -> x * 2;
		UnaryOperator<Integer> myFunc = (x) -> x * 2;
		
		System.out.println("myFunc : " + myFunc.apply(2));
		
		Function<Integer, String> f2 = (num) -> "Value is " + num;
		
		System.out.println("f2 : " + f2.apply(2));
		
		Consumer<String> greeting = (name) -> System.out.println("Hello " + name);
		greeting.accept("World");
		
		// :: here refers to a method reference, println is a method of class System.out
		Consumer<String> printName = System.out::println;
		
		Supplier<Double> random = () -> Math.random();
		System.out.println("Random " + random.get().toString());
		
		Predicate<Integer> isEven = (num) -> num % 2 == 0;
		System.out.println("isEven : " + isEven.test(2));
		
		UnaryOperator<String> trim = String::trim;
		System.out.println(trim.apply("Hello   "));
		
		BinaryOperator<String> concatOper = (a,b) -> a.concat(b);
		BiFunction<String, String, String> concatFunc = (a,b) -> a.concat(b);
		
		// Works
		concatFunc = concatOper;
		
		// Does not work , Super type being assigned to a sub type
		//concatOper = concatFunc;
		
		

	}

}
