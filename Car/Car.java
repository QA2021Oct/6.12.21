package com.company;

public class Car {

    String brand;

    public Car(){
        this.brand =  "Ford";
    }
    public void run(){
        System.out.println("Car running....");
    }
    public String getBrand(){
        return brand;
    }
}
