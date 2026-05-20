package com.pluralsight.polymorphism.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());
//        animals.add(new Animal()); //can't do this because it's abstract


        for (Animal animal: animals){
            animal.speak();

            if (animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.sniffButt();
            }

            if (animal instanceof Bird){
                Bird bird = (Bird) animal;
                bird.fly();
            }


        }

        List<Flyable> flyableList = new ArrayList<>();
        flyableList.add(new Bird());
        flyableList.add(new Airplane());


        for (Flyable flyable: flyableList){
            flyable.fly();
        }


    }
}
