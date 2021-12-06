package com.company;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius =radius;
    }

    public void printSize(){
        // S = PI * r^2
        double result = Math.PI * Math.pow(radius,2);
        System.out.println(result);
    }
}
