package com.example.lab7.askisi3;

public class Proistamenos extends Misthotos {

    public Proistamenos(String onoma, String eidikotita, String dieuthinsi, int arithmosMitrwou,
            int oresErgasias, int arithmosPaidion, int xroniaProyphresias) {
        super(onoma, eidikotita, dieuthinsi, arithmosMitrwou, oresErgasias, arithmosPaidion,
                xroniaProyphresias);
        this.misthos = calculateMisthos();
    }
    
    protected double calculateMisthos() {
        return 700 + (0.05 * arithmosPaidion) + (0.1 * 700 * (xroniaProyphresias/3)) + (0.1 * 700 + (0.05 * arithmosPaidion) + (0.1 * 700 * (xroniaProyphresias/3)));
    }
}
