package com.company;

public class Main {

    static void changeReference(int number, Home home) {
        home.setOwner("Oscar");
        number = 5;

        System.out.println("\nnumber has been changed inside changeReference: " + number);
        System.out.println("owner has been changed inside changeReference: " + home.getOwner());
    }

    static void changeValue(int number, Home home) {
        home = null;
        number = 7;

        System.out.println("\nnumber has been changed inside changeValue: " + number);
        System.out.println("home has been changed inside changeValue: " + home);
    }

    public static void main(String[] args) {

        /**
         * This example shows the difference between value and reference parameters
         */

        int number = 1;
        Home home = new Home("Bove");

        System.out.println("number is: " + number);
        System.out.println("owner is: " + home.getOwner());
        System.out.println("\nRunning changeReference");

        changeReference(number, home);

        System.out.println("\nnumber is: " + number);
        System.out.println("owner is: " + home.getOwner());
        System.out.println("\nRunning changeValue");

        changeValue(number, home);

        System.out.println("\nnumber is: " + number);
        System.out.println("owner is: " + home.getOwner());

    }
}

class Home {
    public Home(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    String owner;
}