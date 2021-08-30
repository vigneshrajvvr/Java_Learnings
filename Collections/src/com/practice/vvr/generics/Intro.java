package com.practice.vvr.generics;

import java.util.ArrayList;
import java.util.List;

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
	
	/*
	 * Unbounded wildcards - It accepts any type of object
	 */
	public static void printList(List<?> list) {
		System.out.println("Input : " + list.get(0).getClass().getName());
		for(Object o : list) {
			System.out.println(o);
		}
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
		
		Intro.<String>ship("String");
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(6);
		list1.add(7);
		printList(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("Hello");
		list2.add("two");
		list2.add("three");
		printList(list2);
		
	}
	
	/*
	 * <T> should be used to specify the type of formal parameter when calling the method 
	 */
	public static <T> T ship(T t) {
		System.out.println(t.getClass().getName());
		return t;
	}
	
	public static <T> void ship1(T t) {
		System.out.println(t.getClass().getName());
	}
	
	public void ship2(T t) {
		
	}
	
	public T ship3(T t) {
		return t;
	}

	@Override
	public boolean test(T t) {
		return t == null;
	}
}

