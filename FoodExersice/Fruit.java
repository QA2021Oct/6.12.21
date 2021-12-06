package com.company;

public class Fruit {

    String color;
    int calories;

    public Fruit(String color, int calories){
        this.color = color;
        this.calories = calories;
    }

    public void eat(){
        System.out.println("Fruit is eatable");
    }

    public String toString(){
        return "Fruit color: " + color + ", calories: "  + calories;
    }
}
