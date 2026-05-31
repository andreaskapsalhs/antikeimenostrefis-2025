package com.example.exetastikes.earino.asdre2025.cOmada;

public class SecondYear extends Student {
    private double finalGrade;
    private double pososto;

    public SecondYear(double finalGrade, double pososto) throws LathosEisodou {
        this.finalGrade = finalGrade;
        this.pososto = pososto;
    }

    @Override
    public double grade() {
        return super.grade() + (finalGrade * pososto);
    }

    public void setFinalGrade(double finalGrade) throws LathosEisodou {
        // evala && finalGrade != 0 giati alliws den vgazei noima i ekfwnisi
        if((finalGrade < 1 || finalGrade > 10) && finalGrade != 0) throw new LathosEisodou("Final grade must be between 1..10");
        else this.finalGrade = finalGrade;
    }

    @Override
    public String toString() {
        return "SecondYear{" +
                "finalGrade=" + finalGrade +
                ", pososto=" + pososto +
                '}';
    }

    public double getPososto() {
        return pososto;
    }

    public void setPososto(double pososto) {
        this.pososto = pososto;
    }

    public double getFinalGrade() {
        return finalGrade;
    }
}
