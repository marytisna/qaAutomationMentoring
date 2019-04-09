package com.automationmentoring.homework3.ThirdTask;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee("Mariia", "Tisna");
        employee1.print();
        employee.setName("Bohdan");
        employee.setSurname("Bachkala");
        employee.print();
    }
}
