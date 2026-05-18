package com.example.ergastiria.lab3.askisi3;

public class Prime {
    public static void main(String[] args) {
        for (int i = 1; i < 10_000; i++) {
            if (isPrime(i, i - 1)) System.out.println(i);
        }
    }

    public static boolean isPrime(int num, int divisor) {
        if (num <= 1) return false;
        if (divisor <= 1) return true;
        if (num % divisor == 0) return false;

        return isPrime(num, divisor - 1);
    }
}
