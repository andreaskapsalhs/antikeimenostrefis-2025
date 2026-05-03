package com.example.lab8;

import com.example.lab7.askisi2.Engine;
import com.example.lab7.askisi2.SteeringSystem;

public class Motorcycle extends Vehicle {
    private boolean hasNextVehicle;

    public Motorcycle(String owner, int licensePlate, int manufactureYear, SteeringSystem steeringSystem, Engine engine, boolean hasNextVehicle) {
        super(owner, licensePlate, manufactureYear, steeringSystem, engine);
        this.hasNextVehicle = hasNextVehicle;
    }

    @Override
    public void drive() {
        System.out.println("Your car driving license is not enough. You need a special license dear " + this.getOwner() + ".");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasNextVehicle=" + hasNextVehicle +
                super.toString() +
                '}';
    }

    public boolean isHasNextVehicle() {
        return hasNextVehicle;
    }

    public void setHasNextVehicle(boolean hasNextVehicle) {
        this.hasNextVehicle = hasNextVehicle;
    }
}
