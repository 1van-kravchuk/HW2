package com.company;

import org.w3c.dom.css.Counter;

import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {
        System.out.print("Circle S is ");
        Circle circle = new Circle(12);
        circle.showS();
        System.out.println("");



        Car car = new Car("Lexus", 2.5f);
            car.startEngine();
            car.moove();
            car.cruise();
            car.stopEngine();

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            new CounterClass();

        }
        System.out.println("quantity of objects is " + CounterClass.getCount());

        System.out.println("");


        }


    }




