package com.automationmentoring.homework4.FirstTask;

public class Area extends Shape {
    @Override
    public double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    public double squareArea(double side) {
        return Math.pow(side, 2);
    }

    @Override
    public double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
