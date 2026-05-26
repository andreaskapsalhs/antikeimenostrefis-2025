package com.example.exetastikes.earino.a2025;

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
                    do {
                        System.out.println("Dwse timi days xana: ");
                        days = UserInput.getInteger();
                    } while (days < 1 || days > 30);
                    car.setDays(days);
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
                    do {
                        System.out.println("Dwse timi people xana: ");
                        people = UserInput.getInteger();
                    } while (people < 1 || people > 2);
                    motorcycle.setPeople(people);
                }

                System.out.println("Dwse mValue: ");
                int mValue = UserInput.getInteger();

                motorcycle.setPeople(people);
                motorcycle.setmValue(mValue);
                pinakas[i] = motorcycle;
            }
        }

        int carCount = 0;
        for (int i = 0; i < pinakas.length; i++) {
            if(pinakas[i] instanceof Car) {
                carCount++;
                System.out.println("Car #" + carCount + " has cc: " + ((Car) pinakas[i]).getEng().getCc());
            }
        }
    }

    public int maxCar(Vehicle[] pinakas) {
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
