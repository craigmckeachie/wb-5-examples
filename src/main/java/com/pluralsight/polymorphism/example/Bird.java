package com.pluralsight.polymorphism.example;

public class Bird extends Animal implements Flyable{

    @Override
    public void speak() {
        System.out.println("Tweet, Tweet");
    }

    public void fly(){
        System.out.println("Flap, flap, flap");
    }

}
