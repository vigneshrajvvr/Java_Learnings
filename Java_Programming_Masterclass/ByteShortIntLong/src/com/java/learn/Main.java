package com.java.learn;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        /*
            32 bits - 4 bytes
         */
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value : " + myMinIntValue);
        System.out.println("Integer Maximum Value : " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMinIntValue - 1));
        System.out.println("Busted MIN value = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2147483647;

        /*
            16 bits - 2 bytes
         */
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Maximum Value : " + myMaxByteValue);
        System.out.println("Byte Minimum Value : " + myMinByteValue);

        /*
            8 bits - 1 byte
         */
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Maximum Value : " + myMaxShortValue);
        System.out.println("Short Minimum Value : " + myMinShortValue);



    }
}
