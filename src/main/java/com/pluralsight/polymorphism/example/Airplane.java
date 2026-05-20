package com.pluralsight.polymorphism.example;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("whoosh!");
    }
}
