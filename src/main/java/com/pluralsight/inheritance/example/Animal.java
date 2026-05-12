package com.pluralsight.inheritance.example;

public class Animal {
    private String name;
    private String ownerName;

    Animal(){
        System.out.println("Called parameterless");
    }


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
