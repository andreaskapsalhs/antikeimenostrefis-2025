package com.example.lab5;

import gr.ihu.iee.oop.lab.UserInput;
import com.example.lab4.Foititis;

import java.util.Objects;

public class MyUtils {
    public static Foititis[] bubbleSortEE(Foititis[] pinakas) {
        for (int i = 0; i < pinakas.length - 1; i++) {
            for (int j = pinakas.length - 1; j > i; j--) {
                if (pinakas[j-1].getEtosEisagwgis() > pinakas[j].getEtosEisagwgis()) {
                    Foititis temp = pinakas[j];
                    pinakas[j] = pinakas[j-1];
                    pinakas[j-1] = temp;
                }
            }
        }

        return pinakas;
    }

    public static Foititis[] selectionSortEponymo(Foititis[] pinakas) {
        for (int i = 0; i < pinakas.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < pinakas.length; j++) {
                if (pinakas[j].getEponymo().compareTo(pinakas[minIndex].getEponymo()) < 0) {
                    minIndex = j;
                }
            }

            Foititis temp = pinakas[minIndex];
            pinakas[minIndex] = pinakas[i];
            pinakas[i] = temp;
        }

        return pinakas;
    }

    public static Foititis[] insertionSortAM(Foititis[] pinakas) {
        for (int i = 1; i < pinakas.length; i++) {
            Foititis temp = pinakas[i];
            int j;
            for (j = i-1; j >= 0; j--) {
                if(pinakas[j].getArithmosMitrwou() > temp.getArithmosMitrwou()) pinakas[j+1] = pinakas[j];
                else break;
            }
            pinakas[j+1] = temp;
        }
        
        return pinakas;
    }

    public static int anazitisiMeEpwnymo(Foititis[] pinakas, String eponymo) {
        int thesi = -1;
        for (int i = 0; i < pinakas.length - 1; i++) {
            if (Objects.equals(pinakas[i].getEponymo(), eponymo)) {
                thesi = i;
                break;
            }
        }

        return thesi;
    }

    public static int anazitisiMeArMitrwou(Foititis[] pinakas) {
        short arithmosMitrwou = UserInput.getShort();
        int left = 0;
        int right = pinakas.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (pinakas[mid].getArithmosMitrwou() == arithmosMitrwou)
                return mid;
            else if (pinakas[mid].getArithmosMitrwou() < arithmosMitrwou)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static int anadromiAnazMeArithMitrwou(Foititis[] pinakas, short arithmosMitrwou, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (pinakas[mid].getArithmosMitrwou() == arithmosMitrwou)
            return mid;
        if (pinakas[mid].getArithmosMitrwou() > arithmosMitrwou)
            return anadromiAnazMeArithMitrwou(pinakas, arithmosMitrwou, left, mid - 1);

        return anadromiAnazMeArithMitrwou(pinakas, arithmosMitrwou, mid + 1, right);
    }
}
