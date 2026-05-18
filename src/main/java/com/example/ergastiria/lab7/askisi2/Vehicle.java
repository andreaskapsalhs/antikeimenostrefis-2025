package com.example.ergastiria.lab7.askisi2;

public class Vehicle {
    private String owner;
    private int licensePlate;
    private int manufactureYear;
    private SteeringSystem steeringSystem;
    private Engine engine;

    public Vehicle(int manufactureYear, SteeringSystem steeringSystem, Engine engine) {
        this.manufactureYear = manufactureYear;
        this.steeringSystem = steeringSystem;
        this.engine = engine;
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
