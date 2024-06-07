package com.learnjava.corejava;

public class LambdaExamples {

	public static void main(String[] args) {
		
		MathOperation increment = (int x) -> x + 1;
		
		int result = increment.operation(1);
		System.out.println("Increment Math Operation Result : " + result);
		
		MathOperation square = (int num) -> num * 2;
		System.out.println("Square Math Operation Result : " + square.operation(4));
		
		square = increment;
		System.out.println("Changed Square operation to increment " + square.operation(2));
		
		AnotherOperation newSquare = (int num) ->  num * 2;
		
		// Does not work, it does interface typing , not SAM typing
		//newSquare = square;
		
	}

}


interface MathOperation {
	int operation(int x);
}


interface AnotherOperation {
	int operation(int x);
}