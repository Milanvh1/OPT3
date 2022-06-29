package com.example.alrijneziekenhuisapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static ArrayList<Maaltijd> ochtendEtenKeuze = new ArrayList<Maaltijd>();
    private static ArrayList<Maaltijd> middagEtenKeuze = new ArrayList<Maaltijd>();
    private static ArrayList<Maaltijd> avondEtenKeuze = new ArrayList<Maaltijd>();
    private static ArrayList<KeuzePatiënt> keuzeDrinkenEnExtra = new ArrayList<KeuzePatiënt>();

    public static ArrayList<Maaltijd> keuzesOchtendEten() {
        ochtendEtenKeuze.add(new Maaltijd("een broodje met appelstroop en een broodje met kaas", "",""));
        ochtendEtenKeuze.add(new Maaltijd("een broodje met hagelslag en een broodje met ham", "",""));
        ochtendEtenKeuze.add(new Maaltijd("een broodje met ham en een broodje met kaas", "",""));
        ochtendEtenKeuze.add(new Maaltijd("een broodje met ham en een broodje met salami", "",""));
        return ochtendEtenKeuze;
    }

    public static ArrayList<Maaltijd> keuzesMiddagEten() {
        middagEtenKeuze.add(new Maaltijd("een broodje hete kip", "",""));
        middagEtenKeuze.add(new Maaltijd("twee kaas tosti's", "",""));
        middagEtenKeuze.add(new Maaltijd("een broodje gezond", "",""));
        return middagEtenKeuze;
    }

    public static ArrayList<Maaltijd> keuzesAvondEten() {
        avondEtenKeuze.add(new Maaltijd("spaghetti met tomatensaus, gehaktballen en kaas", "",""));
        avondEtenKeuze.add(new Maaltijd("spinazie stampot met jus en worst", "",""));
        avondEtenKeuze.add(new Maaltijd("rijst met kip, groenten en een zoete saus", "",""));
        avondEtenKeuze.add(new Maaltijd("aardappels met bloemkool, kipfilet en een romige saus", "",""));
        return avondEtenKeuze;
    }

    public static ArrayList<KeuzePatiënt> keuzesDrinkenEnExtra() {
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("water", "fruit"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("koffie", "ijs"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("thee", "koekje"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("geen drinken", "geen extraatje"));
        return keuzeDrinkenEnExtra;
    }


    public static void selecteerOchtendMaaltijd() {
        keuzesOchtendEten();
        System.out.println("");
        System.out.println("Bij de ochtendmaaltijd horen de volgende keuzes: ");
        System.out.println("1) " + ochtendEtenKeuze.get(0).getEten());
        System.out.println("2) " + ochtendEtenKeuze.get(1).getEten());
        System.out.println("3) " + ochtendEtenKeuze.get(2).getEten());
        System.out.println("4) " + ochtendEtenKeuze.get(3).getEten());
        System.out.println("Kies een maaltijdnummer: ");
        Scanner scanner = new Scanner(System.in);
        int keuzeOchtendEten = scanner.nextInt();
        if (keuzeOchtendEten == 1) {
        System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(0).getEten());
        selecteerDrinkenEnExtra();
        System.out.println("");
        System.out.println("U heeft uw ochtendmaaltijd afgerond");
    } else if (keuzeOchtendEten == 2) {
        System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(1).getEten());
        selecteerDrinkenEnExtra();
        System.out.println("");
        System.out.println("U heeft uw ochtendmaaltijd afgerond");
    } else if (keuzeOchtendEten == 3) {
        System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(2).getEten());
        selecteerDrinkenEnExtra();
        System.out.println("");
        System.out.println("U heeft uw ochtendmaaltijd afgerond");
    } else if (keuzeOchtendEten == 4) {
        System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(3).getEten());
        selecteerDrinkenEnExtra();
        System.out.println("");
        System.out.println("U heeft uw ochtendmaaltijd afgerond");
    } else {
        System.out.println("Kies alleen 1 tot 4!");
        selecteerOchtendMaaltijd();;
        }
    }



    public static void selecteerMiddagMaaltijd() {
        keuzesMiddagEten();
        System.out.println("");
        System.out.println("Bij de middagmaaltijd horen de volgende keuzes: ");
        System.out.println("1) " + middagEtenKeuze.get(0).getEten());
        System.out.println("2) " + middagEtenKeuze.get(1).getEten());
        System.out.println("3) " + middagEtenKeuze.get(2).getEten());
        System.out.println("Kies een maaltijdnummer: ");
        Scanner scanner = new Scanner(System.in);
        int keuzeMiddagEten = scanner.nextInt();
        if (keuzeMiddagEten == 1) {
            System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(0).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw middagmaaltijd afgerond");
        } else if (keuzeMiddagEten == 2) {
            System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(1).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw middagmaaltijd afgerond");
        } else if (keuzeMiddagEten == 3) {
            System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(2).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw middagmaaltijd afgerond");
        } else {
            System.out.println("Kies alleen 1 tot 3!");
            selecteerMiddagMaaltijd();
        }
    }

    public static void selecteerAvondMaaltijd() {
        keuzesAvondEten();
        System.out.println("");
        System.out.println("Bij de avondmaaltijd horen de volgende keuzes: ");
        System.out.println("1) " + avondEtenKeuze.get(0).getEten());
        System.out.println("2) " + avondEtenKeuze.get(1).getEten());
        System.out.println("3) " + avondEtenKeuze.get(2).getEten());
        System.out.println("4) " + avondEtenKeuze.get(3).getEten());
        System.out.println("Kies een maaltijdnummer: ");
        Scanner scanner = new Scanner(System.in);
        int keuzeAvondEten = scanner.nextInt();
        if (keuzeAvondEten == 1) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(0).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 2) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(1).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 3) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(2).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 4) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(3).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else {
            System.out.println("Kies alleen 1 tot 4!");
            selecteerAvondMaaltijd();
        }
    }

    public static void selecteerDrinkenEnExtra() {
        keuzesDrinkenEnExtra();
        System.out.println("");
        System.out.print("U kan uw drinken en extraatje hieruit kiezen: ");
        System.out.println("");
        System.out.println("1) " + keuzeDrinkenEnExtra.get(0).getDrinken() + " en " + keuzeDrinkenEnExtra.get(0).getExtra());
        System.out.println("2) " + keuzeDrinkenEnExtra.get(1).getDrinken() + " en " + keuzeDrinkenEnExtra.get(1).getExtra());
        System.out.println("3) " + keuzeDrinkenEnExtra.get(2).getDrinken() + " en " + keuzeDrinkenEnExtra.get(2).getExtra());
        System.out.println("4) " + keuzeDrinkenEnExtra.get(3).getDrinken()  + " en " + keuzeDrinkenEnExtra.get(3).getExtra());
        System.out.println("Kies een drank en extraatje nummer: ");
        Scanner scanner = new Scanner(System.in);
        int keusDrinkenEnExtra = scanner.nextInt();
        if (keusDrinkenEnExtra == 1) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(0).getDrinken() + " en " + keuzeDrinkenEnExtra.get(0).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 2) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(1).getDrinken() + " en " + keuzeDrinkenEnExtra.get(1).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 3) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(2).getDrinken() + " en " + keuzeDrinkenEnExtra.get(2).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 4) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(3).getDrinken() + " en " + keuzeDrinkenEnExtra.get(3).getExtra() + " gekozen");
        }  else {
            System.out.println("Kies alleen 1 tot 4!");
            selecteerDrinkenEnExtra();
        }
    }

    public static void optiesPatiënt() {
        System.out.println("Menu: ");
        System.out.println("1) Een bestelling plaatsen");
        System.out.println("2) Overzicht bestellingen");
        System.out.println("3) Maaltijd toevoegen");
        System.out.println("4) Maaltijd verwijderen");
        Scanner scanner = new Scanner(System.in);
        int keuze = scanner.nextInt();
        if (keuze == 1) {
            Menu menu = new Menu();
            menu.selecteerOchtendMaaltijd();
            menu.selecteerMiddagMaaltijd();
            menu.selecteerAvondMaaltijd();
            Bestelling ochtendMaaltijd = new OchtendMaaltijdBestelling("", "", "");
            ochtendMaaltijd.bestelproces();
            Bestelling middagMaaltijd = new MiddagMaaltijdBestelling("", "", "");
            middagMaaltijd.bestelproces();
            Bestelling avondMaaltijd = new AvondMaaltijdBestelling("","","");
            avondMaaltijd.bestelproces();
            System.out.println();
            scanner.nextLine();
            System.out.println("Druk enter als u terug wilt naar het menu.");
            scanner.nextLine();
            Menu.optiesPatiënt();
        } else if (keuze == 2) {
            Keuken.BesteldeMaaltijdenLijst();
            Keuken.printTotaalOverzichtMaaltijden();
        } else if (keuze == 3) {
            Maaltijd.nieuwMaaltijdInschrijven();
        } else if (keuze == 4) {
            Maaltijd.maaltijdVerwijderen();
        } else {
            System.out.println("Kies alleen 1 tot 4!");
            optiesPatiënt();
        }
    }

    public static ArrayList<Maaltijd> getKeuzesOchtendEten() {
        return ochtendEtenKeuze;
    }
    public static ArrayList<Maaltijd> getKeuzesMiddagEten() {
        return middagEtenKeuze;
    }
    public static ArrayList<Maaltijd> getKeuzesAvondEten() {
        return avondEtenKeuze;
    }
    public static ArrayList<KeuzePatiënt> getKeuzesDrinkenEnExtra() {
        return keuzeDrinkenEnExtra;
    }

}







