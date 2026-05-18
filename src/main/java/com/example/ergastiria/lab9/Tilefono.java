package com.example.ergastiria.lab9;

import java.util.Arrays;

public abstract class Tilefono {
    protected String arithmosTilefonou;
    protected int deuteroleptaProsKinita;
    protected int deuteroleptaProsStathera;
    protected final static double[] kosthKlisewn = {
            // Stathero -> Stathero
            0.02,
            // Stathero -> Kinito
            0.05,
            // Kinito -> Stathero
            0.06,
            // Kinito -> Kinito
            0.07
    };

    public Tilefono(String arithmosTilefonou) {
        this.arithmosTilefonou = arithmosTilefonou;
    }

    public abstract void dial(String arithmosIncoming);
    public abstract double calculateCost();

    @Override
    public String toString() {
        return "Tilefono{" +
                "arithmosTilefonou='" + arithmosTilefonou + '\'' +
                ", deuteroleptaProsKinita=" + deuteroleptaProsKinita +
                ", deuteroleptaProsStathera=" + deuteroleptaProsStathera +
                ", kosthKlisewn=" + Arrays.toString(kosthKlisewn) +
                '}';
    }

    public String getArithmosTilefonou() {
        return arithmosTilefonou;
    }

    public void setArithmosTilefonou(String arithmosTilefonou) {
        this.arithmosTilefonou = arithmosTilefonou;
    }

    public int getDeuteroleptaProsKinita() {
        return deuteroleptaProsKinita;
    }

    public void setDeuteroleptaProsKinita(int deuteroleptaProsKinita) {
        this.deuteroleptaProsKinita = deuteroleptaProsKinita;
    }

    public int getDeuteroleptaProsStathera() {
        return deuteroleptaProsStathera;
    }

    public void setDeuteroleptaProsStathera(int deuteroleptaProsStathera) {
        this.deuteroleptaProsStathera = deuteroleptaProsStathera;
    }

    public double[] getKosthKlisewn() {
        return kosthKlisewn;
    }
}
