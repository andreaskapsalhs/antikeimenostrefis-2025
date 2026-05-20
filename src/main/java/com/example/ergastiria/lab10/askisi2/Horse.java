package com.example.ergastiria.lab10.askisi2;

public class Horse implements IHorse {
    private int age;
    private int weight;

    public Horse(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Horse{" +
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
    public void whinny() {
        System.out.println("whinny");
    }

    @Override
    public void gallop() {
        System.out.println("travel fast");
    }
}
