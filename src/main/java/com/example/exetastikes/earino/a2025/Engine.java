package com.example.exetastikes.earino.a2025;

public class Engine {
    private int cc;

    public Engine(int cc) {
        this.cc = cc;
    }

    private void start() {
        System.out.println("Engine starts...");
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
