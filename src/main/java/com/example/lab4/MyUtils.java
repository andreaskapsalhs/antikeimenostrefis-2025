package com.example.lab4;

import gr.ihu.iee.oop.lab.UserInput;

import java.util.Objects;

public class MyUtils {
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
