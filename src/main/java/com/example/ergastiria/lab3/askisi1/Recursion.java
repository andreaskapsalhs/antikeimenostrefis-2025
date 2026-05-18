package com.example.ergastiria.lab3.askisi1;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(6));
        System.out.println(calculateFibonacci(15));
    }

    public static int calculateFactorial(int n) {
        if (n <= 1) return 1;
        else return n * calculateFactorial(n - 1);
    }

    public static int calculateFibonacci(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;

        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
