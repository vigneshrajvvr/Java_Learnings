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
	
}

/*
 * Class which uses this interface will have "implements" keyword
 * 
 * Extending mulitple interfaces, example:
 * public class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore {}
 * 
 */
