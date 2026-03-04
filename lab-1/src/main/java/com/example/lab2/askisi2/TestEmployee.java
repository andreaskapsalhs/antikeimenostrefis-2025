package com.example.lab2.askisi2;

import gr.ihu.iee.oop.lab.UserInput;

public class TestEmployee {
    public static void main(String[] args) {
        System.out.print("Dwse diastasi pinaka: ");
        int n = UserInput.getInteger();
        Employee[] staff = new Employee[n];

        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            staff[i] = new Employee();

            System.out.print("Dwse onoma ergati[" + i + "]: ");
            staff[i].setOnoma(UserInput.getString());

            System.out.print("Dwse eponymo ergati[" + i + "]: ");
            staff[i].setEponymo(UserInput.getString());

            System.out.print("Dwse AM ergati[" + i + "]: ");
            staff[i].setAM(UserInput.getInteger());

            System.out.print("Dwse eti apasxolisis ergati[" + i + "]: ");
            staff[i].setEtiApasxolisis(UserInput.getInteger());

            System.out.print("Dwse vasiko mistho ergati[" + i + "]: ");
            staff[i].setVasikosMisthos(UserInput.getDouble());

            System.out.print("Dwse bonus ergati[" + i + "]: ");
            staff[i].setBonus(UserInput.getDouble());
            System.out.print("\n");
        }

        displayStaff(staff);
    }

    public static void displayStaff(Employee[] staff) {
        for (int i = 0; i < staff.length; i++) {
            System.out.print("<--- ERGATIS[" + i + "]  --->\n");
            System.out.println("Onoma ergati[" + i + "] = " + staff[i].getOnoma());
            System.out.println("Eponymo ergati[" + i + "] = " + staff[i].getEponymo());
            System.out.println("AM ergati[" + i + "] = " + staff[i].getAM());
            System.out.println("Eti apasxolisis ergati[" + i + "] = " + staff[i].getEtiApasxolisis());
            System.out.println("Vasiko misthos ergati[" + i + "] = " + staff[i].getVasikosMisthos());
            System.out.println("Bonus ergati[" + i + "] = " + staff[i].getBonus());
            System.out.println("Telikos Misthos ergati[" + i + "] = " + (staff[i].getBonus() + staff[i].getVasikosMisthos()));
            System.out.print("\n");
        }
    }
}
