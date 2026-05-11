package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setName("Spot");

        String name = animal.getName();
        System.out.println(name);


        Cat cat = new Cat();
        cat.setName("Binx");
        cat.setBreed("Maine Coon");
        String catName = cat.getName();
        String breed = cat.getBreed();
        System.out.println(catName);
        System.out.println(breed);




    }
}
