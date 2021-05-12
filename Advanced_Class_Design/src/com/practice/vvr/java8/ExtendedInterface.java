package com.practice.vvr.java8;

public interface ExtendedInterface {
	public abstract int getTailLength();
}

/*
 * An interface can extend any number of interfaces but
 * the concrete class which implements the interface
 * should implement all the abstract methods including the
 * abstract methods of inherited interface
 */
interface HashWiskers extends ExtendedInterface {
	public abstract int getNumberOfWishkers();
}

class Extended implements HashWiskers {

	@Override
	public int getTailLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfWishkers() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
