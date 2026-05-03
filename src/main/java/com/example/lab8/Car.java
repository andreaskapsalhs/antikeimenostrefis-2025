package com.example.lab8;

import com.example.lab7.askisi2.Engine;
import com.example.lab7.askisi2.SteeringSystem;

public class Car extends Vehicle {
    private int doorsNum;

    public Car(String owner, int licensePlate, int manufactureYear, SteeringSystem steeringSystem, Engine engine, int doorsNum) {
        super(owner, licensePlate, manufactureYear, steeringSystem, engine);
        this.doorsNum = doorsNum;
    }

    @Override
    public void drive() {
        System.out.println("You need a car driving license dear " + this.getOwner() + ".");
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorsNum=" + doorsNum +
                super.toString() +
                '}';
    }

    public int getDoorsNum() {
        return doorsNum;
    }

    public void setDoorsNum(int doorsNum) {
        this.doorsNum = doorsNum;
    }
}
