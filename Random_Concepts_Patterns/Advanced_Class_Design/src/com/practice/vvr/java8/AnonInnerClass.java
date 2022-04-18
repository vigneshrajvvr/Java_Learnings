package com.practice.vvr.java8;

public class AnonInnerClass {
	
	interface SaleTodayInterface {
		abstract int dollarOff();
	}
	
	abstract class SaleTodayOnly{
		abstract int dollarOff();
	}
	
	/*
	 * Anonymous Inner Class can be passed as an argument
	 */
	public int pay() {
		return admission(5,new SaleTodayOnly() {
			int dollarOff() {
				return 3;
			}
		});
	}
	
	public int admission(int basePrice, SaleTodayOnly sale) {		
		SaleTodayInterface sales = new SaleTodayInterface() {
			public int dollarOff() {
				return 3;
			}
		};
		return basePrice = sale.dollarOff();
	}
}


