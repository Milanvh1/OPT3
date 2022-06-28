package com.example.alrijneziekenhuisapp;

import java.util.ArrayList;

import static com.example.alrijneziekenhuisapp.HelloApplication.scanner;

public class Keuken {

    public static ArrayList<Maaltijd> maaltijdlijst = new ArrayList<>();

    public static ArrayList<Maaltijd> BesteldeMaaltijdenLijst() {
        maaltijdlijst.add(new Maaltijd("Een broodje met ham en een broodje met kaas", "geen drinken", "geen extraatje"));
        maaltijdlijst.add(new Maaltijd("Twee ham kaas tosti's" , "water", "tomatensoep"));
        maaltijdlijst.add(new Maaltijd("Aardappels met bloemkool, kipfilet en een romige saus", "chocolademelk","yoghurt"));

        return maaltijdlijst;
    }


    public static void totaalOverzichtMaaltijden() {
        printTotaalOverzichtMaaltijden();
    }

    public static void printTotaalOverzichtMaaltijden() {

        System.out.println("Bestellingen: ");
        for (Maaltijd maaltijd : maaltijdlijst) {
            System.out.println("Eten: " + maaltijd.getEten() + " Drinken: " + maaltijd.getDrinken() +
                    " Extra: " + maaltijd.getExtra());
        }

        scanner.nextLine();
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
        Menu.optiesPatiënt();
    }

    public static void addMaaltijd(String eten, String drinken, String extra) {

        maaltijdlijst.add(new Maaltijd(eten, drinken, extra));
        System.out.println("Maaltijdeten succesvol toegevoegd.");

    }

    public static boolean removeMaaltijd(String eten, String drinken, String extra) {
        for (int i = 0; i < maaltijdlijst.size(); i++) {
            if (eten.equals(maaltijdlijst.get(i).getEten()) && drinken.equals(maaltijdlijst.get(i).getDrinken()) &&
                    extra.equals(maaltijdlijst.get(i).getExtra())) {
                System.out.printf("Eten: %s (%d) Drinken: %s (%d) Extra: %d succesvol verwijderd.", maaltijdlijst.get(i).getEten(),
                        maaltijdlijst.get(i).getDrinken(), maaltijdlijst.get(i).getExtra());
                maaltijdlijst.remove(i);
                return true;
            }
        }
        System.out.println("Maaltijd niet gevonden.");
        return false;
    }

}
