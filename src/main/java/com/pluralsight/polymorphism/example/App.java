package com.pluralsight.polymorphism.example;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());


        for (Animal animal: animals){
            animal.speak();

            if (animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.sniffButt();
            }


        }




    }
}
