package com.company;

public class Vegetables {
    String color;
    int calories;

    public Vegetables(String color, int calories){
        this.color = color;
        this.calories = calories;
    }

    public void eat(){
        System.out.println("Vegetables is eatable");
    }

    public String toString(){
        return "Vegetables color: " + color + ", calories: "  + calories;
    }
}
