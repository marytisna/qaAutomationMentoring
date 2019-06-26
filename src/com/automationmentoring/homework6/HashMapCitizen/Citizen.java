package com.automationmentoring.homework6.HashMapCitizen;

public class Citizen {
    String name;
    String surname;

    public Citizen(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "Name: " + this.name + ", " + "Surname: " + this.surname;
    }
}
