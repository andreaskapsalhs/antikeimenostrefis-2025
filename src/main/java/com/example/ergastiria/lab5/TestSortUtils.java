package com.example.ergastiria.lab5;

import com.example.ergastiria.lab4.Foititis;
import gr.ihu.iee.oop.lab.UserInput;

public class TestSortUtils {
    public static void main(String[] args) {
        Foititis[] pinakas = new Foititis[7];

        for (int i = 0; i < pinakas.length; i++) {
            System.out.print("Dwse onoma foititi[" + i + "]: ");
            String onoma = UserInput.getString();

            System.out.print("Dwse eponymo foititi[" + i + "]: ");
            String eponymo = UserInput.getString();

            pinakas[i] = new Foititis(onoma, eponymo);

            System.out.print("Dwse AM foititi[" + i + "]: ");
            short arithmoMitrwou = UserInput.getShort();

            System.out.print("Dwse etos eisagwgis foititi[" + i + "]: ");
            short etosEisagwgis = UserInput.getShort();

            pinakas[i].setArithmosMitrwou(arithmoMitrwou);
            pinakas[i].setEtosEisagwgis(etosEisagwgis);
        }

        /*
            DOKIMH INSERTION SORT
        */
        for (int i = 0; i < pinakas.length; i++) {
            System.out.println("Prin insertionSort: " + pinakas[i].getArithmosMitrwou());
        }

        MyUtils.insertionSortAM(pinakas);

        for (int i = 0; i < pinakas.length; i++) {
            System.out.println("Meta insertionSort: " + pinakas[i].getArithmosMitrwou());
        }

        /*
            DOKIMH SELECTION SORT
        */
        for (int i = 0; i < pinakas.length; i++) {
            System.out.println("Prin selectionsSort: " + pinakas[i].getEponymo());
        }

        MyUtils.selectionSortEponymo(pinakas);

        for (int i = 0; i < pinakas.length; i++) {
            System.out.println("Meta selectionsSort: " + pinakas[i].getEponymo());
        }

         /*
            DOKIMH BUBBLE SORT
        */
        for (int i = 0; i < pinakas.length; i++) {
            System.out.println("Prin bubbleSort: " + pinakas[i].getEtosEisagwgis());
        }

        pinakas = MyUtils.bubbleSortEE(pinakas);

        for (int i = 0; i < pinakas.length; i++) {
            System.out.println("Meta bubbleSort: " + pinakas[i].getEtosEisagwgis());
        }
    }
}
