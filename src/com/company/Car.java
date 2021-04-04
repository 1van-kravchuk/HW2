package com.company;

public class Car {
    private String name;
    private float engine;

    public Car(String name, float engine) {

        this.name = name;
        this.engine = engine;
    }


    public void startEngine() {
        if (engine > 0) {
            System.out.println(name + " Engine Start");
        } else System.out.println("Sorry, Your engine cannot be started");
    }

    public void stopEngine() {
        System.out.println(name + " Engine has beed stopped");
    }

    public void moove() {
        System.out.println(name + " " + engine + " mooves");
    }
    public void cruise (){
        System.out.println("Cruise control fo Your " + name + " is holding speed at 90 km/h");
    }
}

