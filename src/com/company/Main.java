package com.company;

public class Main {

    public static void main(String[] args) {

        int intValue = 1000;

        int intMinIntValue = Integer.MIN_VALUE;
        int intMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + intMinIntValue);
        System.out.println("Integer maximum value = " + intMaxIntValue);
        /*
        Integer Minimum value = -2147483648
        Integer maximum value = 2147483647
         */

        System.out.println("Bust MAX value = " + (intMaxIntValue + 1));
        // Bust MAX value = -2147483648
    }
}
