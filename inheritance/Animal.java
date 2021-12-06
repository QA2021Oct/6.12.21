package com.company;

public class Animal {
    String name;
    int age;
    String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println("Animal eating");
    }
}
