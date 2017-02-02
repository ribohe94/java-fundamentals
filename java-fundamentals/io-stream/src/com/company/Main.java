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

        System.out.println("\n\n**********  Reading chars 1 by 1  **********\n\n");

        try (Reader reader = new FileReader("input.txt")) {
            int intVal;
            while ((intVal = reader.read()) >= 0) {
                char byteVal = (char) intVal;
                System.out.println("Char value: " + byteVal);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Reading an array of bytes
         */

        System.out.println("\n\n**********  Reading an array of bytes  **********\n\n");

        try (InputStream inFile = new FileInputStream("input.txt")) {

            int length;
            byte[] byteBuff = new byte[10];
            while ((length = inFile.read(byteBuff)) >= 0) {

                for (int i = 0; i < length; i++) {
                    byte byteVal = byteBuff[i];
                    System.out.println("Byte value: " + byteVal);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Reading an array of chars
         */

        System.out.println("\n\n**********  Reading an array of chars  **********\n\n");

        try (Reader inFile = new FileReader("input.txt")) {

            int length;
            char[] byteBuff = new char[10];
            while ((length = inFile.read(byteBuff)) >= 0) {

                for (int i = 0; i < length; i++) {
                    char byteVal = byteBuff[i];
                    System.out.println("Char value: " + byteVal);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
