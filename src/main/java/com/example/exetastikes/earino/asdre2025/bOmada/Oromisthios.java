package com.example.exetastikes.earino.asdre2025.bOmada;

public class Oromisthios extends Employee {
    private int hours;
    private int hoursValue;

    public Oromisthios(int hours, int hoursValue) {
        try {
            setHours(hours);
        } catch (LathosEisodou e) {
            System.out.println(e.getMessage());
        }
        this.hoursValue = hoursValue;
    }

    @Override
    public double salary() {
        return super.salary() + (hours * hoursValue);
    }

    public void setHours(int hours) throws LathosEisodou {
        if(hours < 1 || hours > 40) throw new LathosEisodou("Hours must be between 1...40");
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Oromisthios{" +
                "hours=" + hours +
                ", hoursValue=" + hoursValue +
                '}';
    }

    public int getHours() {
        return hours;
    }

    public int getHoursValue() {
        return hoursValue;
    }

    public void setHoursValue(int hoursValue) {
        this.hoursValue = hoursValue;
    }
}
