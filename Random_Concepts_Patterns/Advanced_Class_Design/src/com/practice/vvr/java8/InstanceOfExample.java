package com.practice.vvr.java8;

class HeavyAnimal {}

class Hippo extends HeavyAnimal {}

class Elephant extends HeavyAnimal {}

class MotherHippo extends Hippo implements Mother {}

interface Mother {}

public class InstanceOfExample {
	
	public static void main(String args[]) {
		HeavyAnimal hippo = new Hippo();
		System.out.println(hippo instanceof Hippo); // true
		System.out.println(hippo instanceof HeavyAnimal); // true
		System.out.println(hippo instanceof Elephant); // false
		System.out.println(hippo instanceof Object); // true
		
		/*
		 *  All Java classes inherit from Object, which means that x instanceof Object is usually true
		 */
		
		HeavyAnimal nullHippo = null;
		System.out.println(nullHippo instanceof HeavyAnimal); // false
		
//		Hippo newHippo = new Hippo();
//		System.out.println(newHippo instanceof Elephant);
		/*
		 * Compilation error as the newHippo is of type Hippo.
		 * During compilation time incompatible type issue occurs.
		 * 
		 */
		
		/*
		 * When checking whether an object is an instanceof an interface, 
		 * Java waits until runtime to do the check.
		 */
		
		Mother mom = new MotherHippo();
		System.out.println(mom instanceof Mother); // true
		System.out.println(mom instanceof MotherHippo); // true
		System.out.println(mom instanceof Hippo); // true
		
	}

}
