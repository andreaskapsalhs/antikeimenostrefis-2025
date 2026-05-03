package com.example.lab7.askisi2;

public class Engine {
    private int displacement;
    private int horsePower;

    public Engine(int displacement, int horsePower) {
        this.displacement = displacement;
        this.horsePower = horsePower;
    }

    public void operation() {}
    public void drive() {}
    public void turnOff() {}

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
