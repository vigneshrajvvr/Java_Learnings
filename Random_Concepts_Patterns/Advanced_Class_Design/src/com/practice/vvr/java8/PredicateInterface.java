package com.practice.vvr.java8;

import java.util.function.Predicate;

/*
 * Instead create functional interface to test, 
 * java 8 provides PredicateInterface<T>
 */

public class PredicateInterface {
	
	private static void print(AnimalLambda animal, Predicate<AnimalLambda> p) {
		if(p.test(animal)) {
			System.out.println("Can hop");
		}
	}

	public static void main(String[] args) {
		print(new AnimalLambda("fish", true, true), a -> a.canHop());
	}

}
