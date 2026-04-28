package com.example.lab7.askisi3;

public class Main {
    public static void main(String[] args) {
        Oromisthios mpampis = new Oromisthios("mpampis", "freelancer", "athina", 202402,  35);
        Misthotos giorgos = new Misthotos("giorgos", "software engineer", "thessaloniki", 202501,  48,  0,  4);
        Proistamenos nikos = new Proistamenos("nikos", "manager", "trikala", 202103,  54,  2,  8);

        System.out.println(mpampis.toString() + "\n");
        System.out.println(giorgos.toString() + "\n");
        System.out.println(nikos.toString());
    }
}
