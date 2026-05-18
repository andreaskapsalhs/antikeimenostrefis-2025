package com.example.ergastiria.lab8;

import com.example.ergastiria.lab7.askisi2.Engine;
import com.example.ergastiria.lab7.askisi2.SteeringSystem;

public abstract class Vehicle {
    protected String owner;
    protected int licensePlate;
    protected int manufactureYear;
    protected SteeringSystem steeringSystem;
    protected Engine engine;

    public Vehicle(String owner, int licensePlate, int manufactureYear, SteeringSystem steeringSystem, Engine engine) {
        this.owner = owner;
        this.licensePlate = licensePlate;
        this.manufactureYear = manufactureYear;
        this.steeringSystem = steeringSystem;
        this.engine = engine;
    }

    // Η κάθε υποκλάση έχει την δική της υλοποιήση.
    public abstract void drive();

    public void transferOwnership(String newOwner) {
        System.out.println("Ownership is transferred from " + this.getOwner() + " to " + newOwner + ".");
        this.setOwner(newOwner);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "owner='" + owner + '\'' +
                ", licensePlate=" + licensePlate +
                ", manufactureYear=" + manufactureYear +
                ", steeringSystem=" + steeringSystem +
                ", engine=" + engine +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public SteeringSystem getSteeringSystem() {
        return steeringSystem;
    }

    public void setSteeringSystem(SteeringSystem steeringSystem) {
        this.steeringSystem = steeringSystem;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
