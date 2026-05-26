package com.example.exetastikes.earino.asdre2025.alfaOmada;

public class Motorcycle extends Vehicle  {
    private int people;
    private int mValue;

    public Motorcycle() {
    }

    public int charge(int pagio) {
        return (this.mValue * 20) + pagio;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) throws LathosEisodou {
        if(people > 2 || people < 1) throw new LathosEisodou("Lathos eisodos, people prepei na einai 1 Ή 2.");
        else this.people = people;
    }

    public int getmValue() {
        return mValue;
    }

    public void setmValue(int mValue) {
        this.mValue = mValue;
    }
}
