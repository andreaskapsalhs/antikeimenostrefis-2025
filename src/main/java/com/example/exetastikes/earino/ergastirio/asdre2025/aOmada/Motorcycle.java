package com.example.exetastikes.earino.ergastirio.asdre2025.aOmada;

public class Motorcycle extends Vehicle  {
    private int people;
    private int mValue;

    public Motorcycle() {
        super();
    }

    @Override
    public int charge() {
        return (this.people * this.mValue) + (this.mValue * 20);
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

    @Override
    public String toString() {
        return "Motorcycle{" +
                "people=" + people +
                ", mValue=" + mValue +
                '}';
    }
}
