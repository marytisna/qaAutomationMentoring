package com.automationmentoring.homework3.ThirdTask;

import java.util.Random;

public class Employee {
    private String name;
    private String surname;
    private int id;

    public Employee(){
        Random rand = new Random();
        id = rand.nextInt(200);
    }
    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
        Random rand = new Random();
        id = rand.nextInt(200);
    }

    public String getName(){ return this.name;}
    public void setName(String name) {this.name = name;}
    public String getSurname(){ return this.surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public int getId(){ return this.id;}
    public void setId(int id) {this.id = id;}

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + id);
        System.out.println();
    }

}
