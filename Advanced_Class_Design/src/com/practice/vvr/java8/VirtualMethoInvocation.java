package com.practice.vvr.java8;

abstract class Animal {
	public abstract void feed();

	String name = "???";

	public void printName() {
		System.out.println(name);
	}
}

/*
 * Delegating the call to private method(virtual method)
 */

class Cow extends Animal {
	public void feed() {
		addHay();
	}

	private void addHay() {
	}
}

class Bird extends Animal {
	public void feed() {
		addSeed();
	}

	private void addSeed() {
	}
}

class Lion extends Animal {
	public void feed() {
		addMeat();
	}

	private void addMeat() {
	}
}

class TestLion extends Animal {
	
	String name = "Leo";

	@Override
	public void feed() {

	}
}

public class VirtualMethoInvocation {
	public static void main(String... args) {
		Animal animal = new TestLion();
		animal.printName();
	}
}
