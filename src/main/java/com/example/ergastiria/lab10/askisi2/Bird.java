package com.example.ergastiria.lab10.askisi2;

public class Bird implements IBird {
    private int age;
    private int weight;

    public Bird(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bird{" +
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

    @Override
    public void chirp() {
        System.out.println("chirp...");
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }
}
