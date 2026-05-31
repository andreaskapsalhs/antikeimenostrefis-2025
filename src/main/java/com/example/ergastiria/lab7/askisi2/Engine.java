package com.example.ergastiria.lab7.askisi2;

public class Engine {
    private int displacement;
    private int horsePower;

    public Engine(int displacement, int horsePower) {
        this.displacement = displacement;
        this.horsePower = horsePower;
    }

    public void turnOn() {
        System.out.println("Engine turnt on.");
    }
    public void drive() {
        System.out.println("Engine is driving.");
    }
    public void turnOff() {
        System.out.println("Engine turnt off.");
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
