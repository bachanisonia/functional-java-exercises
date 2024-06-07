package com.learnjava.corejava;

public class Calculator {

	
	public static int doMathOperation(IntOperation op, int a, int b) {
		return op.doOperation(a, b);
	}
	
	public static void main(String[] args) {
		
		IntOperation addition = (x, y) -> x + y;
		IntOperation subtraction = (x, y) -> x - y;
		
		System.out.println(doMathOperation(addition, 10, 5));
		System.out.println(doMathOperation(subtraction, 10, 5));

	}

}

@FunctionalInterface
interface IntOperation {
	int doOperation(int x, int y);
}