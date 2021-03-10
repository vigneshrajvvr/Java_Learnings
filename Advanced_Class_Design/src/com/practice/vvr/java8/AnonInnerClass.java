package com.practice.vvr.java8;

public class AnonInnerClass {
	
	abstract class SaleTodayOnly{
		abstract int dollarOff();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			int dollarOff() {
				return 3;
			}
		};
		return basePrice = sale.dollarOff();
	}

}
