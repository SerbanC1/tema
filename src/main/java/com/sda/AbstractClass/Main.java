package com.sda.AbstractClass;

import static sun.misc.Version.print;

public class Main {

    public static void main(String[] args) {
        AShape Circle = new Circle();
        AShape Rectangle = new Rectangle();
        AShape Square = new Square();

        print(Circle);
        print(Rectangle);
        print(Square);

    }

    private static void print(AShape aShape) {
        aShape.getArea();
        aShape.getPerimeter();
    }
}
