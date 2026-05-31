package com.example.exetastikes.earino.asdre2025.aOmada;

public class Car extends Vehicle {
    private int days;
    private int cValue;
    private Engine eng;

    public Car() {
    }

    @Override
    public int charge() {
        return (this.days * this.cValue) + (this.cValue * 20);
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) throws LathosEisodou {
        if(days < 1 || days > 30) throw new LathosEisodou("Lathos eisodos, days e [1,30]");
        else this.days = days;
    }

    public int getcValue() {
        return cValue;
    }

    public void setcValue(int cValue) {
        this.cValue = cValue;
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "Car{" +
                "days=" + days +
                ", cValue=" + cValue +
                ", eng=" + eng +
                '}';
    }
}
