package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         * These program illustrates aspects of the String pool stored in the heap memory.
         */

        String a = "value 1";
        String b = new String("value 1");

        System.out.println("Comparing using ==: ");

        System.out.println(a == b);

        System.out.println("\nComparing using .equals(): ");

        System.out.println(a.equals(b));
    }
}
