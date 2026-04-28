package com.example.lab7.askisi2;

public class Vehicle {
    private String idioktitis;
    private String arithmosKykloforias;
    private int etosKataskevis;
    private SystimaDieuthynsis systimaDieuthynsis;
    private Mixani eng;

    public Vehicle(int etosKataskevis, SystimaDieuthynsis systimaDieuthynsis, Mixani eng) {
        this.etosKataskevis = etosKataskevis;
        this.systimaDieuthynsis = systimaDieuthynsis;
        this.eng = eng;
    }

    public String getIdioktitis() {
        return idioktitis;
    }

    public void setIdioktitis(String idioktitis) {
        this.idioktitis = idioktitis;
    }

    public String getArithmosKykloforias() {
        return arithmosKykloforias;
    }

    public void setArithmosKykloforias(String arithmosKykloforias) {
        this.arithmosKykloforias = arithmosKykloforias;
    }

    public int getEtosKataskevis() {
        return etosKataskevis;
    }

    public void setEtosKataskevis(int etosKataskevis) {
        this.etosKataskevis = etosKataskevis;
    }

    public SystimaDieuthynsis getSystimaDieuthynsis() {
        return systimaDieuthynsis;
    }

    public void setSystimaDieuthynsis(SystimaDieuthynsis systimaDieuthynsis) {
        this.systimaDieuthynsis = systimaDieuthynsis;
    }

    public Mixani getEng() {
        return eng;
    }

    public void setEng(Mixani eng) {
        this.eng = eng;
    }
}
