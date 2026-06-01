package com.example.ergastiria.lab10.askisi2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Give n dimension: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        IHorse[] Ranch = new IHorse[n];
        IBird[] Aviary = new IBird[n];

        for (int i = 0; i < n; i++) {
            double chance = Math.random();

            System.out.println("Give age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Give weight: ");
            int weight = scanner.nextInt();
            scanner.nextLine();

            if(chance >= 0.5) {
                Ranch[i] = new Pegasus(age,weight);
                System.out.println("Created Pegasus: " + Ranch[i].toString());
            } else {
                Ranch[i] = new Horse(age,weight);
                System.out.println("Created Horse: " + Ranch[i].toString());
            }
        }

        for (int i = 0; i < n; i++) {
            double chance = Math.random();

            System.out.println("Give age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Give weight: ");
            int weight = scanner.nextInt();
            scanner.nextLine();

            if(chance >= 0.5) {
                Aviary[i] = new Pegasus(age,weight);
                System.out.println("Created Pegasus: " + Aviary[i].toString());
            } else {
                Aviary[i] = new Bird(age,weight);
                System.out.println("Created Bird: " + Aviary[i].toString());
            }

            scanner.close();
        }
    }
}
