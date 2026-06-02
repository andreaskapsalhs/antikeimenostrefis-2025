package com.example.exetastikes.earino.asdre2025.bOmada;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("person is working...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}