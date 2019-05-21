package com.automationmentoring.homework5;

public class App {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(23, 30, 23, 30, 50, 25);
        try{
            System.out.println(triangle.area());
        }
        catch(TriangleException ex){
            ex.printStackTrace();
        }
    }
}
