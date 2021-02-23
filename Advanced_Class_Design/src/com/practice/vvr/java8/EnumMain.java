package com.practice.vvr.java8;

public class EnumMain {

	public static void main(String args[]) {
		Season s = Season.SUMMER;
		System.out.println(Season.SUMMER);
		System.out.println(s == Season.SUMMER);
		Season s1 = Season.valueOf("SUMMER");

		for (Season st : Season.values()) {
			System.out.println(st.name() + " " + st.ordinal());
		}

		// enum usage in switch case
		switch (s) {
		case SUMMER:
			System.out.println("It's summer");
			break;
		case WINTER:
			System.out.println("It's winter");
			break;
		default:
			System.out.println("Enter correct season");
		}
		
		System.out.println(s.visitors());
	}

}
