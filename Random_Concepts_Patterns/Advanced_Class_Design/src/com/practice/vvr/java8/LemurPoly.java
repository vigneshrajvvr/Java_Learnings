package com.practice.vvr.java8;

public class LemurPoly extends Primate implements HasTail{
	
	public int age = 10;

	public static void main(String[] args) {
		
		/*
		 * lemur object can access attributes and method
		 * defined within LemurPoly class
		 */
		LemurPoly lemur = new LemurPoly();
		System.out.println(lemur.age);
		
		/*
		 * hasTail object can access attributes and method
		 * which are defined in the HasTail interface
		 */
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		
		/*
		 * primate object can access attributes and method
		 * which are defined in the Primate class
		 */
		Primate primate = lemur;
		System.out.println(lemur.hasHair());
		
//		System.out.println(primate.age);  - Doesn't compile
//		System.out.println(hasTail.hasHair()); - Doesn't compile
		
	}

	@Override
	public boolean isTailStriped() {
		return false;
	}

}

class Primate {
	public boolean hasHair() {
		return true;
	}
}