package com.practice.vvr.java8;

public class Polymorphism {
	
	public void checkSound(LivesInOcean species) {
		species.makeSound();
	}
	
	public static void main(String args[]) {
		Polymorphism species = new Polymorphism();
		/*
		 * Based on the type of object respective methods will be called
		 */
		species.checkSound(new Dolphin()); // Whistle
		species.checkSound(new Whale());   // Sing
	}

}

class Dolphin implements LivesInOcean {

	@Override
	public void makeSound() {
		System.out.println("Whistle");
	}
	
}

class Whale implements LivesInOcean {

	@Override
	public void makeSound() {
		System.out.println("Sing");
	}
	
}
