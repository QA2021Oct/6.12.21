package com.company;

public class Main {

    public static void main(String[] args) {
	    A instanceOfA = new A();
        System.out.println(instanceOfA.y);
        System.out.println(A.x);

        Student avi = new Student("Avi");
        System.out.println(avi.name);
        System.out.println(Student.Collage);
        System.out.println(avi.toString());
        System.out.println("avi studing in-" + Student.Collage);

    }
}
