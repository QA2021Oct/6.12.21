package com.company;

public class Student {
    static String Collage = "UPS";
    static String state = "Israel";
    String name;

    public Student(String name) {
        this.name = name;
    }
    public String toString(){
        return "student " + Collage + "and state is: " + state;
    }
}
