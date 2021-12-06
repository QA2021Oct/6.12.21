package com.company;

public class Main {

    public static void main(String[] args) {
        // inheritance:
        Dog d = new Dog("dog", 3, "red", 0.3f);
        System.out.println(d);
        d.eat();
        System.out.println(d.tailLength);

        Animal animal = new Animal("animal", 8, "not-defined");
        animal.eat();
       // System.out.println(animal.tailLength); - Error!

        Labrador labi = new Labrador("labi", 8, "white", 0.9f);
        System.out.println(labi);
    }
}