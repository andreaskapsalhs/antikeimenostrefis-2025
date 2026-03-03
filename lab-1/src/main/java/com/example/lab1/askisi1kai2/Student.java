package com.example.lab1.askisi1kai2;

public class Student {
    private String onoma;
    private String eponymo;
    private int AM;
    private int apousies;
    private double vathmosErg;
    private double vathmosTheor;

    public Student(String onoma, String eponymo, int AM, int apousies, double vathmosErg, double vathmosTheor) {
        this.onoma = onoma;
        this.eponymo = eponymo;
        this.AM = AM;
        this.apousies = apousies;
        this.vathmosErg = vathmosErg;
        this.vathmosTheor = vathmosTheor;
    }

    public double computeFinal() {
        return (0.3 * this.vathmosErg) + (0.7 * this.vathmosTheor);
    }

    @Override
    public String toString() {
        return (
                "\nOnoma: " + this.onoma +
                        "\nEponymo: " + this.eponymo +
                        "\nAM: " + this.AM +
                        "\nPlithos Apousion: " + this.apousies +
                        "\nVathmos Ergastiriou: " + this.vathmosErg +
                        "\nVathmos Theorias: " + this.vathmosTheor + "\n"
        );
    }

    public String getOnoma() {
        return this.onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEponymo() {
        return this.eponymo;
    }

    public void setEponymo(String eponymo) {
        this.eponymo = eponymo;
    }

    public int getAM() {
        return this.AM;
    }

    public void setAM(int AM) {
        this.AM = AM;
    }

    public int getApousies() {
        return this.apousies;
    }

    public void setApousies(int apousies) {
        this.apousies = apousies;
    }

    public double getVathmosErg() {
        return this.vathmosErg;
    }

    public void setVathmoErg(double vathmosErg) {
        this.vathmosErg = vathmosErg;
    }

    public double getVathmosTheor() {
        return this.vathmosTheor;
    }

    public void setVathmoTheor(double vathmosTheor) {
        this.vathmosTheor = vathmosTheor;
    }
}
