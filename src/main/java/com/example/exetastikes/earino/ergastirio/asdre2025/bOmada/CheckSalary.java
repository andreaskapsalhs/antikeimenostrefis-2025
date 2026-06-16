package com.example.exetastikes.earino.ergastirio.asdre2025.bOmada;

import gr.ihu.iee.oop.lab.UserInput;

public class CheckSalary {
    public static void main(String[] args) {
        Employee[] pinakas = new Employee[10];

        for (int i = 0; i < pinakas.length; i++) {
            double chance = Math.random();

            if(chance > 0.4) {
                System.out.println("Give duty: ");
                int duty = UserInput.getInteger();

                System.out.println("Give misthotos value: ");
                int misthotosValue = UserInput.getInteger();

                System.out.println("Give name: ");
                String name = UserInput.getString();
                Person person = new Person(name);

                Misthotos misthotos = new Misthotos(duty, misthotosValue, person);
            } else {
                System.out.println("Give hours: ");
                int hours = UserInput.getInteger();

                System.out.println("Give hours value: ");
                int hoursValue = UserInput.getInteger();

                Oromisthios oromisthios = new Oromisthios(hours, hoursValue);
            }
        }

        for (int i = 0; i < pinakas.length; i++) {
            System.out.println(pinakas[i].toString());
            if(pinakas[i] instanceof Misthotos) {
                ((Misthotos) pinakas[i]).getPerson().work();
            }
        }

        int max = maxOromisthios(pinakas);
        System.out.println(max);
    }

    public static int maxOromisthios(Employee[] pinakas) {
        int max = -1;

        for (int i = 0; i < pinakas.length; i++) {
            if(pinakas[i] instanceof Oromisthios) {
                if (((Oromisthios) pinakas[i]).getHours() > max) {
                    max = ((Oromisthios) pinakas[i]).getHours();
                }
            }
        }

        return max;
    }
}
