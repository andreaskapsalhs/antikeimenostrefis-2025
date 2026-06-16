package com.example.exetastikes.earino.ergastirio.asdre2025.bOmada;

public abstract class Employee {
    private int years;

    public double salary() {
        return 10 * years;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
