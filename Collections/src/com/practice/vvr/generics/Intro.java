package com.practice.vvr.generics;

/*
 * Generic provides way to generalize the type of objects which we use in a class
 * formal type parameter - T has to be used
 * 
 * E for an element
 * K for a map key
 * V for a map value
 * N for a number
 * T for a generic data type
 * S, U, V, and so forth for multiple generic types
 * 
 * Process of removing the generics syntax from your code is referred to as type erasure
 * 
 * 
 */
public class Intro<T> implements GenericInterface<T>{
	
	private T contents;
	
	public T pack() {
		return contents;
	}
	
	public void add(T contents) {
		this.contents = contents;
	}

	
	public static void main(String args[]) {
		Intro<String[]> intro1 = new Intro<>();
		String[] value = {"one", "two"};
		intro1.add(value);
		
		String[] result = intro1.pack();
		for(String temp : result) {
			System.out.println(temp);
		}
		
		Intro<String> test = new Intro<>();
		test.test(null);
		
	}

	@Override
	public boolean test(T t) {
		return t == null;
	}
}

