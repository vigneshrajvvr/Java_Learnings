package com.practice.vvr.threading;

public class Application {
	
	// main thread
	public static void main(String args[]) {
		Task taskRunner = new Task(1);
		taskRunner.start();
		
		System.out.println("Hello there ...");
		for(int i=0;i<=10;i++) {
			System.out.println("Main thread : " + i);
		}
		
//		taskRunner.start(); Exception in thread "main" java.lang.IllegalThreadStateException
		Task taskRunner1 = new Task(2); // New task
		taskRunner1.start();
	}
}

class Task extends Thread{
	
	int threadNumber;
	
	public Task(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread : "+ threadNumber + " : "+ i);
		}
	}
	
}
