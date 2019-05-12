package com.sda.AbstractClass;

public class Square extends AShape {

    private double side;

    public double getSide() {
        return side;
    }

    /**
     * Returns shape's area
     *
     * @return area as double
     */
    @Override
    public double getArea() {
        return side * side;
    }

    /**
     * Returns shape's perimeter
     *
     * @return perimeter as double
     */
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public Square(double side) {
        this.side = side;
    }
}
