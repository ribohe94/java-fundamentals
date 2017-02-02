package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        /**
         * Reading bytes 1 by 1
         */
        System.out.println("**********  Reading bytes 1 by 1  **********\n\n");

        try (InputStream inFile = new FileInputStream("input.txt")) {

            int intVal;
            while ((intVal = inFile.read()) >= 0) {
                byte byteVal = (byte) intVal;
                System.out.println("Byte value: " + byteVal);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Reading chars 1 by 1
         */

        System.out.println("**********  Reading chars 1 by 1  **********\n\n");

        int intVal;
        try (Reader reader = new FileReader("input.txt")) {
            while ((intVal = reader.read()) >= 0) {
                char byteVal = (char) intVal;
                System.out.println("Char value: " + byteVal);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
