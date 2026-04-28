package com.example.lab6;

import gr.ihu.iee.oop.lab.UserInput;

public class TestSortUtils {
    public static void main(String[] args) {
        Foititis[] pinakas = new Foititis[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Dwse onoma foititi[" + i + "]: ");
            String onoma = UserInput.getString();

            System.out.print("Dwse eponymo foititi[" + i + "]: ");
            String eponymo = UserInput.getString();

            pinakas[i] = new Foititis(onoma, eponymo);

//            System.out.print("Dwse AM foititi[" + i + "]: ");
//            short arithmoMitrwou = UserInput.getShort();
//            pinakas[i].setArithmosMitrwou(arithmoMitrwou);
//
//            System.out.print("Dwse etos eisagwgis foititi[" + i + "]: ");
//            short etosEisagwgis = UserInput.getShort();
//            pinakas[i].setEtosEisagwgis(etosEisagwgis);
        }

        //        Dokimes:
        //        for (int i = 0; i < pinakas.length; i++) {
        //            System.out.println("Prin insertionSort: " + pinakas[i].getArithmosMitrwou());
        //        }
        //
        //        MyUtils.insertionSortAM(pinakas);
        //
        //        for (int i = 0; i < pinakas.length; i++) {
        //            System.out.println("Meta insertionSort: " + pinakas[i].getArithmosMitrwou());
        //        }
        //
        //        for (int i = 0; i < pinakas.length; i++) {
        //            System.out.println("Prin selectionsSort: " + pinakas[i].getEponymo());
        //        }
        //
        //        MyUtils.selectionSortEponymo(pinakas);
        //
        //        for (int i = 0; i < pinakas.length; i++) {
        //            System.out.println("Meta selectionsSort: " + pinakas[i].getEponymo());
        //        }

        //        for (int i = 0; i < pinakas.length; i++) {
        //            System.out.println("Prin bubbleSort: " + pinakas[i].getEtosEisagwgis());
        //        }
        //
        //        MyUtils.bubbleSortEE(pinakas);
        //
        //        for (int i = 0; i < pinakas.length; i++) {
        //            System.out.println("Meta bubbleSort: " + pinakas[i].getEtosEisagwgis());
        //        }

        //        for (int i = 0; i < pinakas.length; i++) {
        //            System.out.println("Prin quickSort: " + pinakas[i].getArithmosMitrwou());
        //        }
        //
        //        MyUtils.quickSortAM(pinakas, 0, pinakas.length-1);
        //
        //        for (int i = 0; i < pinakas.length; i++) {
        //            System.out.println("Meta quickSort: " + pinakas[i].getArithmosMitrwou());
        //        }

        for (int i = 0; i < pinakas.length; i++) {
            System.out.println("Prin mergeSort: " + pinakas[i].getEponymo());
        }

        MyUtils.mergeSortEponymo(pinakas, 0, pinakas.length);

        for (int i = 0; i < pinakas.length; i++) {
            System.out.println("Meta mergeSort: " + pinakas[i].getEponymo());
        }
    }
}
