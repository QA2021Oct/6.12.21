package com.company;

import java.util.Scanner;

public class Main {
    // Create class car with property - brand.
    // Write a constructor in the Car class that initializes the brand class field with the string “Ford”.
    // create function getBrand() and run Car()
    // in the main class crate car object
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Car c = new Car();
        //String cBrand = c.getBrand() ;
        //System.out.println(cBrand);
        c.getBrand() ;
        c.run();

        Car d = new Car();
        String dBrand = d.getBrand() ;
        System.out.println(dBrand);
        d.run();
    }
}
