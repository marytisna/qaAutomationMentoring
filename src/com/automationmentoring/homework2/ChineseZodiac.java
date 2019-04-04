package com.automationmentoring.homework2;

import java.util.HashMap;
import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        String[] animals = {" Monkey", " Rooster", " Dog", " Pig", " Rat", " Ox", " Tiger", " Rabbit", " Dragon", " Snake", " Horse", " Goat"};

        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(0, "White");
        colors.put(1, "White");
        colors.put(2, "Black");
        colors.put(3, "Black");
        colors.put(4, "Green");
        colors.put(5, "Green");
        colors.put(6, "Red");
        colors.put(7, "Red");
        colors.put(8, "Yellow");
        colors.put(9, "Yellow");

        int key = year%10;

        System.out.println(colors.get(key) + "" + animals[year%12] + " year");
    }


}

