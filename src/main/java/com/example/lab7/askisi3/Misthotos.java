package com.example.lab7.askisi3;

public class Misthotos extends Ypallilos {
    protected int arithmosPaidion;
    protected int xroniaProyphresias;

    public Misthotos(String onoma, String eidikotita, String dieuthinsi, int arithmosMitrwou,
            int oresErgasias, int arithmosPaidion, int xroniaProyphresias) {
        super(onoma, eidikotita, dieuthinsi, arithmosMitrwou);
        this.arithmosPaidion = arithmosPaidion;
        this.xroniaProyphresias = xroniaProyphresias;
        this.misthos = calculateMisthos();
    }

    @Override
    public String toString() {
        return super.toString() + " [arithmosPaidion=" + arithmosPaidion + ", xroniaProyphresias=" + xroniaProyphresias + "]";
    }

    protected double calculateMisthos() {
        return 700 + (0.05 * arithmosPaidion) + (0.1 * 700 * (xroniaProyphresias/3)) + (0.1 * 700 + (0.05 * arithmosPaidion) + (0.1 * 700 * (xroniaProyphresias/3)));
    }

    public int getArithmosPaidion() {
        return arithmosPaidion;
    }
    public void setArithmosPaidion(int arithmosPaidion) {
        this.arithmosPaidion = arithmosPaidion;
    }
    public int getXroniaProyphresias() {
        return xroniaProyphresias;
    }
    public void setXroniaProyphresias(int xroniaProyphresias) {
        this.xroniaProyphresias = xroniaProyphresias;
    }
}
