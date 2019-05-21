package com.automationmentoring.homework5;

public class Triangle {
    private double ax;
    private double ay;
    private double bx;
    private double by;
    private double cx;
    private double cy;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        ax = x1;
        ay = y1;
        bx = x2;
        by = y2;
        cx = x3;
        cy = y3;
    }

    public double area() throws TriangleException {
        if((ax==bx && ay==by)||(bx==cx && by==cy) || (ax==cx && ay==cy)){
            throw new TriangleException("The points are collinear!");
        }
        return Math.abs((ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2);
    }

}
