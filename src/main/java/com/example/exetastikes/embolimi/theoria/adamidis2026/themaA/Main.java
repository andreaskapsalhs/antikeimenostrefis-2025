package com.example.exetastikes.embolimi.theoria.adamidis2026.themaA;

public class Main {
    public static void main(String[] args) {
        Generic<String> onomata = new Generic<String>("Nikos", "Sakis", "Petros");
        Generic<Double> arithmoi = new Generic<Double>(1.62, 3.14, 2.67);

        System.out.println(onomata.toString());
        System.out.println(arithmoi.toString());
    }
}