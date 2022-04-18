package com.java.learn;

public class Main {

    public static void main(String[] args) {
	    byte byteValue = 10;
        short shortValue = 10;
        int intValue = 15;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short)(1000 + 10 * (byteValue + shortValue + intValue));
    }
}
