package com.example.ergastiria.lab7.askisi2;

import gr.ihu.iee.oop.lab.UserInput;

public class Main {
    public static void main(String[] args) {
        Vehicle[] pinakas = new Vehicle[3];

        for (int i = 0; i < pinakas.length; i++) {
            System.out.println("Give owner name: ");
            String ownerName = UserInput.getString();

            System.out.println("Give license plate: ");
            int licensePlate = UserInput.getInteger();

            System.out.println("Give manufacture year: ");
            int manufactureYear = UserInput.getInteger();

            System.out.println("Give engine displacement: ");
            int engDisplacement = UserInput.getInteger();

            System.out.println("Give engine horsepower: ");
            int engHorsepower = UserInput.getInteger();

            Engine eng = new Engine(engDisplacement, engHorsepower);
            SteeringSystem steeringSystem = new SteeringSystem();

            Vehicle vehicle = new Vehicle(manufactureYear, steeringSystem, eng);
            vehicle.setOwner(ownerName);
            vehicle.setLicensePlate(licensePlate);
        }

        int index;

        do {
            System.out.println("Give vehicle number (0-2) to get engine displacement: ");
            index = UserInput.getInteger();
        } while (index < 0 || index > pinakas.length - 1);
        System.out.println(pinakas[index].getEngine().getDisplacement());
        pinakas[index].getEngine().turnOn();
        pinakas[index].getSteeringSystem().turnOn();
        pinakas[index].getSteeringSystem().turnOff();
        pinakas[index].getEngine().turnOff();

        do {
            System.out.println("Give vehicle number (0-2) to get engine hp: ");
            index = UserInput.getInteger();
        } while (index < 0 || index > pinakas.length - 1);
        System.out.println(pinakas[index].getEngine().getHorsePower());
        pinakas[index].getEngine().turnOn();
        pinakas[index].getSteeringSystem().turnOn();
        pinakas[index].getSteeringSystem().turnOff();
        pinakas[index].getEngine().turnOff();

        do {
            System.out.println("Give vehicle number (0-2) to get owner and man. date: ");
            index = UserInput.getInteger();
        } while (index < 0 || index > pinakas.length - 1);
        System.out.println(pinakas[index].getOwner());
        System.out.println(pinakas[index].getManufactureYear());
        pinakas[index].getEngine().turnOn();
        pinakas[index].getSteeringSystem().turnOn();
        pinakas[index].getSteeringSystem().turnOff();
        pinakas[index].getEngine().turnOff();
    }
}
