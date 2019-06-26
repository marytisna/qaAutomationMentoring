package com.automationmentoring.homework6.HashMapCitizen;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<Passport, Citizen> citizens = new HashMap<>();

        Passport sk235326 = new Passport("SK", 235326);
        Citizen mariiaTisna = new Citizen("Mariia", "Tisna");
        Passport yu758948 = new Passport("YU", 758948);
        Citizen jessicaStone = new Citizen("Jessica", "Stone");
        Passport io457857 = new Passport("IO", 457857);
        Citizen veraGold = new Citizen("Vera", "Gold");
        Passport nb746543 = new Passport("NB", 746543);
        Citizen marikaValentine = new Citizen("Marika", "Valentine");

        citizens.put(sk235326, mariiaTisna);
        citizens.put(yu758948, jessicaStone);
        citizens.put(io457857, veraGold);
        citizens.put(nb746543, marikaValentine);

        System.out.println((citizens.get(sk235326)));
        System.out.println(citizens.get(yu758948));
        System.out.println(citizens.get(io457857));
        System.out.println(citizens.get(nb746543));
    }
}
