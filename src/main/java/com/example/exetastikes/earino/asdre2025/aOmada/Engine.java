package com.example.exetastikes.earino.asdre2025.aOmada;

public class Engine {
    private int cc;

    public Engine(int cc) {
        this.cc = cc;
    }

    public void start() {
        System.out.println("Engine starts...");
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
