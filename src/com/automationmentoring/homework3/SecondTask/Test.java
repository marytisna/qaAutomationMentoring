package com.automationmentoring.homework3.SecondTask;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Accounting accounting = new Accounting();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of working hours: ");
        double hours = input.nextDouble();
        System.out.print("Enter a per hour payment: ");
        double payment = input.nextDouble();
        System.out.println("Payment is: " + accounting.pay(hours,payment));
    }
}
