package com.practice.vvr.java8;

public class ObjectMethods {
	public static void main(String args[]) {
		Hippo1 h1 = new Hippo1("Harry", 3100);
		System.out.println(h1); //Hippo1 [name=Harry, weight=3100.0]
	}
}

class Hippo1 {
	private String name;
	private double weight;

	public Hippo1(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Overriding toString() method of Object class
	 */
	
	@Override
	public String toString() {
		return "Hippo1 [name=" + name + ", weight=" + weight + "]";
	}
	
}
