package com.pluralsight.polymorphism.example;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Bark! Bark!");
    }

}
