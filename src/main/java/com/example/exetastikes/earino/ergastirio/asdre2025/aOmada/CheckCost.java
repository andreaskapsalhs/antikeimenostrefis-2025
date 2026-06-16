package com.example.exetastikes.earino.ergastirio.asdre2025.aOmada;

import gr.ihu.iee.oop.lab.UserInput;

public class CheckCost {
    public static void main(String[] args) throws LathosEisodou {
        Vehicle[] pinakas = new Vehicle[10];

        for (int i = 0; i < pinakas.length; i++) {
            double chance = Math.random();

            if(chance > 0.5) {
                Car car = new Car();

                System.out.println("Dwse timi days: ");
                int days = UserInput.getInteger();

                try {
                    car.setDays(days);
                } catch (LathosEisodou e) {
                    car.setDays(0);
                }

                System.out.println("Dwse cValue: ");
                int cValue = UserInput.getInteger();
                System.out.println("Dwse cc: ");
                int cc = UserInput.getInteger();
                Engine eng = new Engine(cc);

                car.setEng(eng);
                car.setcValue(cValue);
                pinakas[i] = car;
            } else {
                Motorcycle motorcycle = new Motorcycle();

                System.out.println("Dwse people: ");
                int people = UserInput.getInteger();

                try {
                    motorcycle.setPeople(people);
                } catch (LathosEisodou e) {
                    motorcycle.setPeople(0);
                }

                System.out.println("Dwse mValue: ");
                int mValue = UserInput.getInteger();

                motorcycle.setPeople(people);
                motorcycle.setmValue(mValue);
                pinakas[i] = motorcycle;
            }
        }

        for (int i = 0; i < pinakas.length; i++) {
            System.out.println(pinakas[i].toString());

            if(pinakas[i] instanceof Car) {
                System.out.print("And has cc: " + ((Car) pinakas[i]).getEng().getCc());
                ((Car) pinakas[i]).getEng().start();
            }
        }

        System.out.println("Most expensive charge per day: " + CheckCost.maxCar(pinakas));
    }

    public static int maxCar(Vehicle[] pinakas) {
        int max = -1;

        for (int i = 0; i < pinakas.length; i++) {
            if(pinakas[i] instanceof Car) {
                if (((Car) pinakas[i]).getcValue() > max) {
                    max = ((Car) pinakas[i]).getcValue();
                }
            }
        }

        return max;
    }
}
