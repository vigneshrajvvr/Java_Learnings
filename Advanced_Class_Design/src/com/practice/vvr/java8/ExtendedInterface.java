package com.practice.vvr.java8;

public interface ExtendedInterface {

	public abstract int getTailLength();

	public static final int LENGTH = 10; // Interface variable
	/*
	 * Default method - Class which implements the interface is not required to
	 * implement the default method
	 */

	public default double getTemperature() {
		return 10.0;
	}
	
	
	/*
	 * Static interface methods are similar to static methods.
	 * To access the static method in an interface then interface
	 * name has to be used.s
	 */
	public static int staticInterfaceMethod() {
		return 10;
	}
}

/*
 * An interface can extend any number of interfaces but the concrete class which
 * implements the interface should implement all the abstract methods including
 * the abstract methods of inherited interface
 */
interface HashWiskers extends ExtendedInterface {
	public abstract int getNumberOfWishkers();
}

class Extended implements HashWiskers {

	@Override
	public int getTailLength() {
		return 0;
	}

	@Override
	public int getNumberOfWishkers() {
		return 0;
	}
	
	public int testStaticMethod() {
		return ExtendedInterface.staticInterfaceMethod();
		// Accessed using interface name
	}
	

}
