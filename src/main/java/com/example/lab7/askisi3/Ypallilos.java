package com.example.lab7.askisi3;

public class Ypallilos {
    protected String onoma;
    protected String eidikotita;
    protected String dieuthinsi;
    protected double misthos;
    protected int arithmosMitrwou;

    public Ypallilos(String onoma, String eidikotita, String dieuthinsi, int arithmosMitrwou) {
        this.onoma = onoma;
        this.eidikotita = eidikotita;
        this.dieuthinsi = dieuthinsi;
        this.arithmosMitrwou = arithmosMitrwou;
    }

    @Override
    public String toString() {
        return "[onoma=" + onoma + ", eidikotita=" + eidikotita + ", dieuthinsi=" + dieuthinsi + ", misthos="
                + misthos + ", arithmosMitrwou=" + arithmosMitrwou + "]";
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEidikotita() {
        return eidikotita;
    }

    public void setEidikotita(String eidikotita) {
        this.eidikotita = eidikotita;
    }

    public String getDieuthinsi() {
        return dieuthinsi;
    }

    public void setDieuthinsi(String dieuthinsi) {
        this.dieuthinsi = dieuthinsi;
    }

    public int getArithmosMitrwou() {
        return arithmosMitrwou;
    }

    public void setArithmosMitrwou(int arithmosMitrwou) {
        this.arithmosMitrwou = arithmosMitrwou;
    }

    public double getMisthos() {
        return misthos;
    }

    public void setMisthos(double misthos) {
        this.misthos = misthos;
    }
}
