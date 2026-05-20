package com.example.ergastiria.lab10.askisi2;

public class Pegasus implements IHorse, IBird {
    private int age;
    private int weight;

    public Pegasus(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pegasus{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void whinny() {
        System.out.println("Pegasus can't whinny.");
    }

    @Override
    public void gallop() {
        System.out.println("travel fast");
    }

    @Override
    public void chirp() {
        System.out.println("chirp...");
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }
}
