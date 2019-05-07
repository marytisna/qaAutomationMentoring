package com.automationmentoring.homework4.FirstTask;

public class Area extends Shape {
    @Override
    public void rectangleArea(double length, double breadth) {
        System.out.println("Rectangle area is: " + length*breadth);
    }

    @Override
    public void squareArea(double side) {
        System.out.println("Square area is: " + Math.pow(side, 2));
    }

    @Override
    public void circleArea(double radius) {
        System.out.println("Circle area is: " + Math.PI*Math.pow(radius, 2));
    }
}
