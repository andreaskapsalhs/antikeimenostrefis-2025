package com.example.exetastikes.earino.ergastirio.asdre2025.bOmada;

public class Misthotos extends Employee {
    private int duty;
    private int misthotosValue;
    private Person person;

    public Misthotos(int duty, int misthotosValue, Person person) {
        try {
            setDuty(duty);
        } catch (LathosEisodou e) {
            System.out.println(e.getMessage());
        }

        this.misthotosValue = misthotosValue;
        this.person = person;
    }

    @Override
    public double salary() {
        return super.salary() + (misthotosValue *  duty);
    }

    public int getDuty() {
        return duty;
    }

    public void setDuty(int duty) throws LathosEisodou {
        if((duty < 1 || duty > 10) && duty != 0) throw new LathosEisodou("Duty must be between 1...10");
        this.duty = duty;
    }

    @Override
    public String toString() {
        return "Misthotos{" +
                "duty=" + duty +
                ", misthotosValue=" + misthotosValue +
                ", person=" + person +
                '}';
    }

    public int getMisthotosValue() {
        return misthotosValue;
    }

    public void setMisthotosValue(int misthotosValue) {
        this.misthotosValue = misthotosValue;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
