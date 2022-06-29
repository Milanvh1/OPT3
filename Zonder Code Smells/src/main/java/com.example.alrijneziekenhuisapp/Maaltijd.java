package com.example.alrijneziekenhuisapp;

import static com.example.alrijneziekenhuisapp.HelloApplication.scanner;

public class Maaltijd extends KeuzePatiënt{

    private KeuzePatiënt keuzePatiënt;
    private MaaltijdType type;

    public void setKeuzePatiënt(KeuzePatiënt keuzePatiënt) {
        this.keuzePatiënt = keuzePatiënt;
    }

    private void setType(MaaltijdType type) {
        this.type = type;
    }

    public Maaltijd(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }
    
    public Maaltijd(MaaltijdType type) {
        setType(type);
    }

    private MaaltijdType getType () {
        return type;
    }

    public KeuzePatiënt getKeuzePatiënt() {
        return keuzePatiënt;
    }


    public static void nieuwMaaltijdInschrijven() {
        System.out.println("Voer de naam van het eten in die u wilt toevoegen:");
        String eten = scanner.nextLine();
        System.out.println("Voer de naam van het drinken in die u wilt toevoegen:");
        String drinken = scanner.nextLine();
        System.out.println("Voer de naam van het extraatje in die u wilt toevoegen:");
        String extra = scanner.nextLine();
        Keuken.addMaaltijd(eten, drinken, extra);
        scanner.nextLine();
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
        Menu.optiesPatiënt();
    }

    public static void maaltijdVerwijderen() {
        System.out.println("Voer de naam van het eten in die u wilt verwijderen:");
        String eten = scanner.nextLine();
        System.out.println("Voer de naam van het eten in die u wilt verwijderen:");
        String drinken = scanner.nextLine();
        System.out.println("Voer de naam van het eten in die u wilt verwijderen:");
        String extra = scanner.nextLine();
        Keuken.removeMaaltijd(eten, drinken, extra);
        scanner.nextLine();
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
        Menu.optiesPatiënt();
    }

    public int aantalMaaltijden () {
        return type.getAantalMaaltijden();
    }
}
