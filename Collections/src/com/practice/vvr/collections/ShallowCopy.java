package com.practice.vvr.collections;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopy {
	
	public static void main(String args[]) {
		List<Integer> original = new ArrayList<>();
		original.add(1);
		original.add(2);
		original.add(3);
		original.add(4);
		original.add(6);
		
		List<Integer> shallowCopy = new ArrayList<>(original);
		shallowCopy.add(5);
		
		for(int i: shallowCopy) {
			System.out.print(" " + i);
		}
		
		//Modifing copied object will not modify original object
		//But modifiying original will be reflected in the copied object
		
	}

}
