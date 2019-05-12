package com.sda.AbstractClass;


public class Circle extends AShape {


    @Override
    public void getArea() {
        System.out.println("The area of circle is");
    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of circle is");

    }

    final static double PI = 3.14;


}