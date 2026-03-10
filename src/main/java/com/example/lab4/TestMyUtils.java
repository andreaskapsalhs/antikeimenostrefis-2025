package com.example.lab4;

import gr.ihu.iee.oop.lab.UserInput;

public class TestMyUtils {
    public static void main(String[] args) {
        Foititis[] pinakas = new Foititis[10];

        for (int i = 0; i < 9; i++) {
            System.out.print("Dwse onoma foititi[" + i + "]: ");
            String onoma = UserInput.getString();

            System.out.print("Dwse eponymo foititi[" + i + "]: ");
            String eponymo = UserInput.getString();

            System.out.print("Dwse AM foititi[" + i + "]: ");
            short arithmoMitrwou = UserInput.getShort();

            System.out.print("Dwse etos eisagwgis foititi[" + i + "]: ");
            short etosEisagwgis = UserInput.getShort();

            pinakas[i] = new Foititis(onoma, eponymo, arithmoMitrwou, etosEisagwgis);
        }

        System.out.println(MyUtils.anazitisiMeEpwnymo(pinakas, "eponymo"));
        System.out.println(MyUtils.anazitisiMeArMitrwou(pinakas));
        System.out.println(MyUtils.anadromiAnazMeArithMitrwou(pinakas, (short) 93, 0, pinakas.length));
    }
}
