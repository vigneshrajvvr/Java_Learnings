package com.practice.vvr.java8;

/*
 * Abstract keyword is implict
 * It can be assumed as
 * public abstract interface InterfaceRecap
 */
public interface InterfaceRecap {
	
	// public static final int MINIMUM_DEPTH = 2
	int MINIMUM_DEPTH = 2;
	
	// public abstract int getMaximumDepth();
	int getMaximumDepth();
	
	/*
	 * Default method with implementation
	 * Class which implements the interface may or may not override default method
	 * This is to add new functionality without breaking the existing functionalities
	 * Cannot to be static, final, or abstract
	 */
	public default double getTemperature() {
		return 20.0;
	}
	
}

/*
 * Class which uses this interface will have "implements" keyword
 * 
 * Extending multiple interfaces, example:
 * public class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore {}
 * 
 */

class ClassInterfaceRecap implements InterfaceRecap{

	@Override
	public int getMaximumDepth() {
		return 0;
	}
	
}
