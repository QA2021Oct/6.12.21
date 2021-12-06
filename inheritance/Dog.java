package com.company;

public class Dog extends Animal{

    public Dog(String name, int age, String color){
      super(name,age, color);
    }
    public String toString(){
        return  "Dog= " + name + ", age= " + age + ", color= " + color;
    }
}
