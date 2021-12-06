package com.company;

import java.util.Scanner;

public class Main {
    // create a class called Circle. properties: double radius.
    // function: void printSize.
    // Create constructor to the class.
    // etgar: print the actual size inside print size function.  // size of circle ??  code ??
    // now create 2 circles: one with radius of 5.4 and a second circle with radius 8.7.
    // call printSize for each circle you created.

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Circle c1 = new Circle(5.4);
        c1.printSize();

        Circle c2 = new Circle(8.7);
        c2.printSize();

    }
}
