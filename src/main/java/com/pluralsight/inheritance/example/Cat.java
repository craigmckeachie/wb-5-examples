package com.pluralsight.inheritance.example;

public class Cat extends Animal{
    private String breed;


//    Cat(){
//        super();
//    }


    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
