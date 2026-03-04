package com.example.lab2.askisi1;

import gr.ihu.iee.oop.lab.UserInput;

public class Askisi {
    public static void main(String[] args) {
        System.out.print("Give dimension: ");
        int n = UserInput.getInteger();
        int[] pinakas = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter pinakas[" + i + "]: ");
            int input = UserInput.getInteger();
            pinakas[i] = input;
        }

        int max = findMax(pinakas);
        double avg = findAvg(pinakas);

        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);

        System.out.println("Displaying the array:");
        display(pinakas);
        System.out.println("Displaying the array after swapping:");

        // extra - gia na vreis tyxaious arithmous sto diastima [0,n]:
        // min + (int)(Math.random() * ((max - min) + 1))
        int i = (int) (Math.random() * n);
        int j = (int) (Math.random() * n);
        swap(pinakas, i, j);

        display(pinakas);
    }

    public static int findMax(int[] m) {
        int max = m[0];
        int maxThesi = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
                maxThesi = i;
            }
        }

        return maxThesi;
    }

    public static double findAvg(int[] m) {
        int sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }

        return (double) sum / m.length;
    }

    public static void display(int[] m) {
        System.out.println("[");
        for (int i = 0; i < m.length; i++) {
            System.out.println("\t" + m[i] + ",");
        }
        System.out.println("]");
    }

    public static void swap(int[] m, int i, int j) {
        int temp = m[i];
        m[i] = m[j];
        m[j] = temp;
    }
}
