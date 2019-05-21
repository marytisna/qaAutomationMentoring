package com.automationmentoring.homework4.FirstTask;

public class Test {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Rectangle area is: " + area.rectangleArea(5,10));
        System.out.println("Square area is: "+ area.squareArea(10));
        System.out.println("Circle area is: "+ area.circleArea(8));
    }
}

