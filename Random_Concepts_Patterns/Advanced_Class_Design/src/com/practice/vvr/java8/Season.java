package com.practice.vvr.java8;

public enum Season {
//	WINTER, SPRING, SUMMER, FALL
	
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
	private String expectedVisitors;
	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	
	public String visitors() {
		return this.expectedVisitors;
	}
	
//	WINTER{
//		public void printHours() {
//			System.out.println("9pm - 3pm");
//		}
//	};
//	
//	public abstract void printHours();
}
