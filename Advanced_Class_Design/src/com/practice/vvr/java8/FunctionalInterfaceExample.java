package com.practice.vvr.java8;

/*
 * Functional interface is an interface which contain
 * only one abstract method
 *
 * Marking these kind of interfaces with @FunctionInterface
 * annotation is a good practice.
 *
 * If we mark the interface with @FunctionInterface annotation
 * then if there are more the one abstract methods then
 * error shows
 */

@FunctionalInterface
public interface FunctionalInterfaceExample {

    public abstract void sprint();

}

class Example1 implements FunctionalInterfaceExample {

    @Override
    public void sprint() {
        System.out.println("Implementing functional interface method");
    }

}
