package com.example.lab8;

import com.example.lab7.askisi2.Engine;
import com.example.lab7.askisi2.SteeringSystem;

public class Truck extends Vehicle {
    private int axleNum;

    public Truck(String owner, int licensePlate, int manufactureYear, SteeringSystem steeringSystem, Engine engine, int axleNum) {
        super(owner, licensePlate, manufactureYear, steeringSystem, engine);
        this.axleNum = axleNum;
    }

    @Override
    public void drive() {
        System.out.println("You must be a professional driver. This is " + this.getAxleNum() + " axels truck, Mr. " + this.getOwner() + ".");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "axleNum=" + axleNum +
                super.toString() +
                '}';
    }

    public int getAxleNum() {
        return axleNum;
    }

    public void setAxleNum(int axleNum) {
        this.axleNum = axleNum;
    }
}
