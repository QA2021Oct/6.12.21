package com.company;

public class Main {

    //inheritance tree:
    // classes:  fruits, vegetables, banana, orange, tomato, carrot
    // to each class - members(variables + functions):
    // properties: color, calories;
    // functions: eat() -> inside print eatable(:
    // Constructor - remember you need to sent subclass parameters to the superclass using super()
    // function toString()

    public static void main(String[] args) {

        Banana b = new Banana("yellow", 90);
        Banana bosser = new Banana("green", 70);
        Tomato t = new Tomato("red", 30);
        System.out.println(b);
        b.eat();
        System.out.println(bosser);
        b.eat();
        System.out.println(t);
        t.eat();
    }
}