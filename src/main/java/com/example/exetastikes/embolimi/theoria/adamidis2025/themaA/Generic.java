package com.example.exetastikes.embolimi.theoria.adamidis2025.themaA;

public class Generic<T> {
    private T x;
    private T y;
    private T z;

    public Generic(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getZ() {
        return z;
    }

    public void setZ(T z) {
        this.z = z;
    }
}