package com.example.lab2.askisi2;

public class Employee {
    private String onoma;
    private String eponymo;
    private int AM;
    private int etiApasxolisis;
    private double vasikosMisthos;
    private double bonus;

    public double calculateSalary() {
        return this.bonus + this.vasikosMisthos + this.etiApasxolisis * 10;
    }

    @Override
    public String toString() {
        return (
                "\nOnoma: " + this.onoma +
                        "\nEponymo: " + this.eponymo +
                        "\nAM: " + this.AM +
                        "\nEti Apasxolisis: " + this.etiApasxolisis +
                        "\nBonus: " + this.bonus +
                        "\nVasikos Misthos: " + this.vasikosMisthos +
                        "\nTelikos Misthos: " + this.calculateSalary() + "\n"
        );
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEponymo() {
        return eponymo;
    }

    public void setEponymo(String eponymo) {
        this.eponymo = eponymo;
    }

    public int getAM() {
        return AM;
    }

    public void setAM(int AM) {
        this.AM = AM;
    }

    public int getEtiApasxolisis() {
        return etiApasxolisis;
    }

    public void setEtiApasxolisis(int etiApasxolisis) {
        this.etiApasxolisis = etiApasxolisis;
    }

    public double getVasikosMisthos() {
        return vasikosMisthos;
    }

    public void setVasikosMisthos(double vasikosMisthos) {
        this.vasikosMisthos = vasikosMisthos;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
