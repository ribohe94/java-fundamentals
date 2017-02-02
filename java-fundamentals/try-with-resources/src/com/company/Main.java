package com.company;

import java.io.*;

public class Main {

    /**
     * Long way to handle exceptions
     */

    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try {
            reader = new FileReader("input.txt");
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e2) {
                System.out.println(e2.getClass().getSimpleName() + " - " + e2.getMessage());
            }
        }
    }

    public static void doTryWithResources() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = new FileReader("input.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    public static void doTryWithResourcesMulti() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = new FileReader("input.txt");
             Writer writer = new FileWriter("output.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                writer.write(buff, 0, length);
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    private static void doCloseThing() {
        try (MyAutoClosable ac = new MyAutoClosable()) {
            ac.saySomething();
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
            for (Throwable t : e.getSuppressed())
                System.out.println("Suppressed: " + t.getMessage());
        }
    }

    public static void main(String[] args) {
        //doTryCatchFinally();
//        doTryWithResources();
//        doTryWithResourcesMulti();
        doCloseThing();
    }
}
