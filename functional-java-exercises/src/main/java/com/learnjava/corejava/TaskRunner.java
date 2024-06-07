package com.learnjava.corejava;

import java.time.LocalDateTime;

public class TaskRunner {

	public static void main(String[] args) {
		
		//Task task = new HelloWorldClass();
		//Task task = () -> System.out.println("Hello World !");
		
		TaskRunner.runner(() -> System.out.println("Hello World !"));
	}
	
	
	public static void runner(Task task) {
		System.out.println("Start : " + LocalDateTime.now());
		task.run();
		System.out.println("End : " + LocalDateTime.now());
	}

}

@FunctionalInterface
interface Task {
	public void run();
	// Default methods are still allowed
	default void add() {};
}

/*
class HelloWorldClass implements Task {
	
	public void run() {
		System.out.println("Hello World ! ");
	}
}*/