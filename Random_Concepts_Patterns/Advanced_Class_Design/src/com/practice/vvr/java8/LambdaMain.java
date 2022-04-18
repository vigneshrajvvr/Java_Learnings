package com.practice.vvr.java8;

public class LambdaMain {
	
	/*
	 * Lambda functions work only on functional interfaces
	 */
	
	public static void testAnimalLambda(AnimalLambda a, LambdaExample l) {
		if(l.test(a)) {
			System.out.println(a.toString());
		}
	}
	
	public static void main(String args[]) {
		testAnimalLambda(new AnimalLambda("fish", false, true), a -> a.canHop());
		testAnimalLambda(new AnimalLambda("kangaroo", true, false), a -> a.canHop());
	}
}

class AnimalLambda {

	private String species;
	private boolean canHop;
	private boolean canSwim;

	public AnimalLambda(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() { return species; }
}
