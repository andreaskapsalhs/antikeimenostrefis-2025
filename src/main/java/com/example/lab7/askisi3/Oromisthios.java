package com.example.lab7.askisi3;

public class Oromisthios extends Ypallilos {
    protected int oresErgasias;

    public Oromisthios(String onoma, String eidikotita, String dieuthinsi, int arithmosMitrwou, int oresErgasias) {
        super(onoma, eidikotita, dieuthinsi, arithmosMitrwou);
        this.oresErgasias = oresErgasias;
        this.setMisthos(calculateSalary());
    }

    protected double calculateSalary() {
        return 30* (7*oresErgasias + 0.6*(7*oresErgasias));
    }

    @Override
    public String toString() {
        return super.toString() + " [oresErgasias=" + oresErgasias + "]";
    }  
}
