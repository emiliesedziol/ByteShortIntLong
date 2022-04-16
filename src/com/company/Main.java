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

        byte byteMinByteValue = Byte.MIN_VALUE;
        byte byteMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum value = " + byteMinByteValue);
        System.out.println("Byte maximum value = " + byteMaxByteValue);

        System.out.println("Bust Minimum value = " + (byteMinByteValue-1));
        System.out.println("Bust maximum value = " + (byteMaxByteValue+1));

        /*
         Byte Minimum value = -128
        Byte maximum value = 127
        Bust Minimum value = -129
        Bust maximum value = 128
        */

        short shortMinByteValue = Short.MIN_VALUE;
        short shortMaxByteValue = Short.MAX_VALUE;

        System.out.println("Short Minimum value = " + shortMinByteValue);
        System.out.println("Short maximum value = " + shortMaxByteValue);

        System.out.println("Bust Minimum value = " + (shortMinByteValue-1));
        System.out.println("Bust maximum value = " + (shortMaxByteValue+1));

        /*
        Short Minimum value = -32768
        Short maximum value = 32767
        Bust Minimum value = -32769
        Bust maximum value = 32768
         */

        long longMinByteValue = Long.MIN_VALUE;
        long longMaxByteValue = Long.MAX_VALUE;

        System.out.println("long Minimum value = " + longMinByteValue);
        System.out.println("long maximum value = " + longMaxByteValue);

        System.out.println("Bust Minimum value = " + (longMinByteValue-1));
        System.out.println("Bust maximum value = " + (longMaxByteValue+1));

        long longValue = 100L;

        System.out.println("Long 100L = "+ longValue);
        long longBigLongLitteral = 2_137_432_324_478L;

        System.out.println(longBigLongLitteral);
        /*
        long Minimum value = -9223372036854775808
        long maximum value = 9223372036854775807
        Bust Minimum value = 9223372036854775807
        Bust maximum value = -9223372036854775808
        Long 100L = 100
        2137432324478
         */

        short shortLitteralValue = 32767;
        int intTotal = (intMinIntValue /2);
        //                      (byte) is casting in Java
        // int id Java default
        byte byteNewByteValue = (byte)(byteMinByteValue /2);


    }
}
