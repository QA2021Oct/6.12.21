package com.company;

public class Dog extends Animal{

    float tailLength;

    public Dog(String name, int age, String color, float tailLength){
      super(name,age, color);
      this.tailLength = tailLength;
    }

    public String toString(){
        return  "Dog= " + name + ", age= " + age + ", color= " + color + ", tailLength= " + tailLength;
    }
}
