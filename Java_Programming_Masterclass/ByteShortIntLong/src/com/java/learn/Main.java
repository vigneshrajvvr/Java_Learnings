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

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Maximum Value : " + myMaxLongValue);
        System.out.println("Long Minimum Value : " + myMinLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = myMinIntValue / 2;

        byte myNewByteTotal = (byte) (myMinByteValue / 2);

        short myNewShortTotal = (short) (myMinShortValue / 2);

    }
}
