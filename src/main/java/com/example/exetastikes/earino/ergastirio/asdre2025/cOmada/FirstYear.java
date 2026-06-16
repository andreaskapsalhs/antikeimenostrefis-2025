package com.example.exetastikes.earino.ergastirio.asdre2025.cOmada;

public class FirstYear extends Student {
    private double labGrade;
    private double theoryGrade;
    private Subject subject;

    public FirstYear(double labGrade, double theoryGrade, Subject subject) throws LathosEisodou {
        this.theoryGrade = theoryGrade;
        this.subject = subject;
        this.labGrade = labGrade;
    }

    @Override
    public double grade() {
        return super.grade() + labGrade + theoryGrade;
    }

    public void setLabGrade(double labGrade) throws LathosEisodou {
        // evala && labGrade != 0 giati alliws den vgazei noima i ekfwnisi
        if((labGrade < 5 || labGrade > 10) && labGrade != 0) throw new LathosEisodou("Lab grade must be between 5..10");
        else this.labGrade = labGrade;
    }

    @Override
    public String toString() {
        return "FirstYear{" +
                "labGrade=" + labGrade +
                ", theoryGrade=" + theoryGrade +
                '}';
    }

    public double getLabGrade() {
        return labGrade;
    }

    public double getTheoryGrade() {
        return theoryGrade;
    }

    public void setTheoryGrade(double theoryGrade) {
        this.theoryGrade = theoryGrade;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
