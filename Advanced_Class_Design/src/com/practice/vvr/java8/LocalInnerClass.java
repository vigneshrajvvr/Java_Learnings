package com.practice.vvr.java8;

class Outer {
	private int length = 5;

	public void calculate() {
		// In Java 8, the “effectively final” concept was introduced. If the code could still compile with the keyword final inserted before the local variable, the variable is effectively final.
		final int width = 10;
		
		// cannot be declared static and cannot declare static fields or methods.
		class Inner {
			public void multiply() {
				System.out.println(length * width);
				// access to all fields and methods of the enclosing class.
				// Do not have access to local variables of a method unless those variables are final or effectively final. 
			}
		}
		
		Inner inner = new Inner();
		inner.multiply();
	}
}

public class LocalInnerClass {

	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.calculate();
	}

}
