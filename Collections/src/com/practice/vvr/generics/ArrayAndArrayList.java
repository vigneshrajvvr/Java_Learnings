package com.practice.vvr.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		System.out.println("Conversion : ");
		String[] array = {"gerbil", "mouse"};
		List<String> listArray = Arrays.asList(array); // returns fixed size list
		listArray.set(1, "test"); // Modification in the list is being reflected in array from where it has been converted
		
		System.out.println(listArray.toString());
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		array[0] = "new";
		System.out.println("Changes : ");
		System.out.println(listArray.toString());
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//listArray.remove(1); Exception throws as it's fixed list
		String[] newArray = (String[]) listArray.toArray();
		
		//Searching and Sorting
		System.out.println("Searching and Sorting :");
		int[] numbers = {6,9,1,8};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 6)); // 1
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		
		List<Integer> sortedList = Arrays.asList(9, 7, 5, 3); 
		Collections.sort(sortedList);
		System.out.println(Collections.binarySearch(sortedList, 3)); // 0
		System.out.println(Collections.binarySearch(sortedList, 1)); // -1
	}
	
}
