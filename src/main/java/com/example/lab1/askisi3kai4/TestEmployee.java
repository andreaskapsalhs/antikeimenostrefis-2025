package com.example.lab1.askisi3kai4;

import gr.ihu.iee.oop.lab.UserInput;

public class TestEmployee {
    public static void main(String[] args) {
        // Eisagwgi dedomenwn me thn xrisi ths klashs UserInput (https://exams-iee.the.ihu.gr/mod/resource/view.php?id=1541)
        System.out.print("Dwse onoma ergati1: ");
        String onoma = UserInput.getString();

        System.out.print("Dwse eponymo ergati1: ");
        String eponymo = UserInput.getString();

        System.out.print("Dwse AM ergati1: ");
        int am = UserInput.getInteger();

        System.out.print("Dwse eti apasxolisis ergati1: ");
        int etiApasxolisis = UserInput.getInteger();

        System.out.print("Dwse vasiko mistho ergati1: ");
        double vasikosMisthos = UserInput.getDouble();

        System.out.print("Dwse bonus ergati1: ");
        double bonus = UserInput.getDouble();

        Employee ergatis1 = new Employee(onoma, eponymo, am, etiApasxolisis, vasikosMisthos, bonus);

        // Eisagwgi statikwn dedomenwn xwris thn xrisi ths klashs UserInput.
        Employee ergatis2 = new Employee("onoma2", "eponymo2", 2, 4, 730, 65);

        System.out.println(ergatis1.toString());
        System.out.println(ergatis2.toString());

        TestEmployee.findLowSalary(ergatis1, ergatis2);
    }

    // ΑΣΚΗΣΗ 4 (Επαύξηση της άσκησης 3)
    public static void findLowSalary(Employee ergatis1, Employee ergatis2) {
        Employee FoundEmployee = null;

        if (ergatis1.getVasikosMisthos() < 1200 && ergatis1.getEtiApasxolisis() >= 5) {
            FoundEmployee = ergatis1;
        } else if (ergatis2.getVasikosMisthos() < 1200 && ergatis2.getEtiApasxolisis() >= 5) {
            FoundEmployee = ergatis2;
        }

        if (FoundEmployee != null) {
            System.out.println("O ergazomenos me onoma " + ergatis1.getOnoma() + " einai xamilomisthos.");
            FoundEmployee.setVasikosMisthos(FoundEmployee.getVasikosMisthos() + 100);
            System.out.println(FoundEmployee.toString());
        }
    }
}
