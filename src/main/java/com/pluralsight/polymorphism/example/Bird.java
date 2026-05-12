package com.pluralsight.polymorphism.example;

public class Bird extends Animal{

    @Override
    public void speak() {
        System.out.println("Tweet, Tweet");
    }

}
