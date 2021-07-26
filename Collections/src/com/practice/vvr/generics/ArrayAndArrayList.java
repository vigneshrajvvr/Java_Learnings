package com.practice.vvr.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayAndArrayList {
	
	public static void main(String args[]) {
		// ArrayList
		List<String> list = new ArrayList<>();
		list.add("Fluffy");
		list.add("Webby");
		System.out.println(list.toString());
		
		// Arrays
		String[] arrays = new String[list.size()];
		arrays[0] = list.get(0);
		arrays[1] = list.get(1);
		for(int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}
		
		// Conversion between arrays and array list
		
	}
	
}
