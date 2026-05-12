package com.pluralsight.polymorphism.example;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Bark! Bark!");
    }

    public void sniffButt(){
        System.out.println("The dog is doing a 360-degree scent check.");
    }

}
