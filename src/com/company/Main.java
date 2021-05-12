package com.company;


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

        Fractions fractions = new Fractions(2, 4, 1, 2);
        fractions.add();
        fractions.sub();
        fractions.mult();
        fractions.div();

        System.out.println("");

        Money money1 = new Money(57, 70);
        Money money2 = new Money(25, 35);
        Money money = money1.addUAH(money2);
        System.out.println("addition of "+ money1 +" + "+ money2 +" = " + money);
        Money money3 = money1.subUAH(money2);
        System.out.println("subtraction of "+ money1 +" + "+ money2 +" = " + money3);
    }
}



