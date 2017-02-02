package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        /**
         * Reading an array of bytes
         */

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

    }
}
