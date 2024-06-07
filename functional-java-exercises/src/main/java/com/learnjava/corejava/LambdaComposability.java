package com.learnjava.corejava;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdaComposability {

	
	public static void operationLogger(UnaryOperator<Integer> operator) {
		System.out.println("Start : " + LocalDateTime.now());
		operator.apply(10);
		System.out.println("End : " + LocalDateTime.now());
	}
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> increment = (x) -> x + 1;
		
		Consumer<String> messageLogger = msg -> System.out.println(msg + " : " + LocalDateTime.now());
		
		Runnable logStart = () -> messageLogger.accept("Start");
		Runnable logEnd = () -> messageLogger.accept("End");
		
		BiConsumer<UnaryOperator<Integer>, Integer> logger = (operation, number) -> { 
			logStart.run();
			operation.apply(number);
			logEnd.run();
		};
		
		logger.accept(x -> x + 1, 20);
		logger.accept(x -> x + 100, 42);

	}

}
