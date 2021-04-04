package com.company;

public class Circle {
    private double radius;

    public Circle(double radius) {
    this.radius = radius;
    }
     public void showS (){
        System.out.println(Math.PI * radius * radius);
    }
}
