package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myMinValue = -2147483648;
        int myMaxValue =  2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("my Total = " + myTotal);

        // byte has a width of 8
        byte myByteValue = 10;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("my New Byte Value = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = -32768;

        //long has a width of 64
        long myLongValue = 100L;
    }
}
