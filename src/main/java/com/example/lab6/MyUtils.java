package com.example.lab6;

import gr.ihu.iee.oop.lab.UserInput;
import com.example.lab6.Foititis;

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
        int arxi = 0;
        int telos = pinakas.length - 1;

        while (arxi <= telos) {
            int mesi = arxi + (telos - arxi) / 2;

            if (pinakas[mesi].getArithmosMitrwou() == arithmosMitrwou)
                return mesi;
            else if (pinakas[mesi].getArithmosMitrwou() < arithmosMitrwou)
                arxi = mesi + 1;
            else
                telos = mesi - 1;
        }

        return -1;
    }

    public static int anadromiAnazMeArithMitrwou(Foititis[] pinakas, short arithmosMitrwou, int arxi, int telos) {
        if (arxi > telos) {
            return -1;
        }

        int mesi = arxi + (telos - arxi) / 2;

        if (pinakas[mesi].getArithmosMitrwou() == arithmosMitrwou)
            return mesi;
        if (pinakas[mesi].getArithmosMitrwou() > arithmosMitrwou)
            return anadromiAnazMeArithMitrwou(pinakas, arithmosMitrwou, arxi, mesi - 1);

        return anadromiAnazMeArithMitrwou(pinakas, arithmosMitrwou, mesi + 1, telos);
    }

    public static void quickSortAM(Foititis[] pinakas, int arxi, int telos) {
        if(arxi < telos) {
            Foititis pivot = pinakas[telos];
            int i = arxi - 1;

            for (int j = arxi; j < telos; j++) {
                if (pinakas[j].getArithmosMitrwou() <= pivot.getArithmosMitrwou()) {
                    i++;
                    Foititis temp = pinakas[i];
                    pinakas[i] = pinakas[j];
                    pinakas[j] = temp;
                }
            }

            Foititis temp = pinakas[i + 1];
            pinakas[i + 1] = pinakas[telos];
            pinakas[telos] = temp;

            int partitionIndex = i + 1;

            quickSortAM(pinakas, arxi, partitionIndex - 1);
            quickSortAM(pinakas, partitionIndex + 1, telos);
        }
    }

    public static void mergeSortEponymo(Foititis[] pinakas, int arxi, int telos) {
        if (telos - arxi <= 1) return;
        int mesi = arxi + (telos - arxi) / 2;

        mergeSortEponymo(pinakas, arxi, mesi);
        mergeSortEponymo(pinakas, mesi, telos);

        Foititis[] tempPinakas = new Foititis[telos - arxi];
        int i = arxi, j = mesi, k = 0;

        while (i < mesi && j < telos) {
            if (pinakas[i].getEponymo().compareTo(pinakas[j].getEponymo()) < 0)
                tempPinakas[k++] = pinakas[i++];
            else
                tempPinakas[k++] = pinakas[j++];
        }

        while (i < mesi)
            tempPinakas[k++] = pinakas[i++];
        while (j < telos)
            tempPinakas[k++] = pinakas[j++];

        for (i = 0; i < tempPinakas.length; i++)
            pinakas[arxi + i] = tempPinakas[i];
    }
}
