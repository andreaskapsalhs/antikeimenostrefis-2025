package com.example.lab8;

import com.example.lab7.askisi2.Engine;
import com.example.lab7.askisi2.SteeringSystem;
import gr.ihu.iee.oop.lab.UserInput;

public class Main {
    public static void main(String[] args) {
        int n;

        if(args.length > 0) n = Integer.parseInt(args[0]);
        else {
            System.out.println("Give N: ");
            n = UserInput.getInteger();
        }

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            double chance = Math.random();

            String owner = UserInput.getString();
            int licensePlate = UserInput.getInteger();
            int manufactureYear = UserInput.getInteger();
            int displacement = UserInput.getInteger();
            int horsePower = UserInput.getInteger();

            SteeringSystem steeringSystem = new SteeringSystem();
            Engine engine = new Engine(displacement, horsePower);

            // Πιθανότητα: chance ∈ [0.0, 0.7)
            if (chance < 0.7) {
                int doorsNum = UserInput.getInteger();
                vehicles[i] = new Car(owner, licensePlate, manufactureYear, steeringSystem, engine, doorsNum);
            }
            // Πιθανότητα: chance ∈ [0.7, 0.85)
            else if (chance < 0.85) {
                int axleNum = UserInput.getInteger();
                vehicles[i] = new Truck(owner, licensePlate, manufactureYear, steeringSystem, engine, axleNum);
            }
            // Πιθανότητα: chance ∈ [0.85, 1.0)
            else {
                boolean hasNextVehicle = UserInput.getBoolean();
                vehicles[i] = new Motorcycle(owner, licensePlate, manufactureYear, steeringSystem, engine, hasNextVehicle);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(vehicles[i].toString());
        }
    }
}
