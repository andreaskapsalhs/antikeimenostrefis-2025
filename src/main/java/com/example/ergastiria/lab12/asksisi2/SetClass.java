package com.example.ergastiria.lab12.asksisi2;

import java.util.Arrays;

public class SetClass<T extends Comparable> {
    private Object[] pinakas;
    private int N;

    public SetClass(int N) {
        this.N = N;
        this.pinakas = new Object[N];
    }

    public void insert(T element) throws ArrayOverflow {
        for (int i = 0; i < N; i++) {
            if(this.pinakas[i] == null) {
                this.pinakas[i] = element;
                return;
            }
        }

        throw new ArrayOverflow("O Pinakas einai gematos");
    }

    public static <T> boolean equals(T[] pinakas1, T[] pinakas2) {
        if(pinakas1.length != pinakas2.length)
            return false;

        for (int i = 0; i < pinakas1.length-1; i++) {
            if(!pinakas1[i].equals(pinakas2[i]))
                return false;
        }

        return true;
    }

    public boolean delete(T element) {
        boolean exists = false;

        for (int i = 0; i < N; i++) {
            if(this.pinakas[i].equals(element)) {
                this.pinakas[i] = null;
                exists = true;
            }
        }

        return exists;
    }

    public int find(T element) {
        int index = -1;

        for (int i = 0; i < N; i++) {
            if(this.pinakas[i] != null && this.pinakas[i].equals(element)) {
                index = i;
            }
        }

        return index;
    }

    @Override
    public String toString() {
        return "SetClass{" +
                "pinakas=" + Arrays.toString(pinakas) +
                ", N=" + N +
                '}';
    }

    public Object[] getPinakas() {
        return pinakas;
    }

    public void setPinakas(T[] pinakas) {
        this.pinakas = pinakas;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }
}
