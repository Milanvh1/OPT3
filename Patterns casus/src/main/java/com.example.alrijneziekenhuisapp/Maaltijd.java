package com.example.alrijneziekenhuisapp;

import static com.example.alrijneziekenhuisapp.HelloApplication.scanner;

public class Maaltijd {
    private String eten;
    private String drinken;
    private String extra;

    public Maaltijd() {

    }

    public Maaltijd(String eten) {
        this.eten = eten;
    }

    public Maaltijd(String eten, String drinken) {
        this.eten = eten;
        this.drinken = drinken;
    }

    public Maaltijd(String eten, String drinken, String extra) {
        this.eten = eten;
        this.drinken = drinken;
        this.extra = extra;
    }

    public String getEten() {
        return eten;
    }

    public String getDrinken() {
        return drinken;
    }

    public String getExtra() {
        return extra;
    }

    public static void nieuwMaaltijdInschrijven() {
        System.out.println("Voer de naam van de eten in die u wilt toevoegen:");
        String eten = scanner.nextLine();
        System.out.println("Voer de naam van het drinken in die u wilt toevoegen:");
        String drinken = scanner.nextLine();
        System.out.println("Voer de naam van het extraatje in die u wilt toevoegen:");
        String extra = scanner.nextLine();
        Keuken.addMaaltijd(eten, drinken, extra);
        scanner.nextLine();
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
        Menu.keuzePatiënt();
    }

    public static void maaltijdVerwijderen() {
        System.out.println("Voer de naam van het eten in die u wilt verwijderen:");
        String eten = scanner.nextLine();
        System.out.println("Voer de naam van het drinken in die u wilt verwijderen:");
        String drinken = scanner.nextLine();
        System.out.println("Voer de naam van het extraatje in die u wilt verwijderen:");
        String extra = scanner.nextLine();
        Keuken.removeMaaltijd(eten, drinken, extra);
        scanner.nextLine();
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
        Menu.keuzePatiënt();
    }
}
