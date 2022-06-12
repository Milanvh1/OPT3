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
        middagEtenKeuze.add(new Maaltijd("twee ham kaas tosti's", "",""));
        middagEtenKeuze.add(new Maaltijd("twee kaas tosti's", "",""));
        middagEtenKeuze.add(new Maaltijd("twee vlam tosti's", "",""));
        middagEtenKeuze.add(new Maaltijd("een broodje gezond", "",""));
        return middagEtenKeuze;
    }

    public static ArrayList<Maaltijd> keuzesAvondEten() {
        avondEtenKeuze.add(new Maaltijd("spaghetti met tomatensaus, gehaktballen en kaas", "",""));
        avondEtenKeuze.add(new Maaltijd("spinazie stampot met jus en worst", "",""));
        avondEtenKeuze.add(new Maaltijd("twee broodjes shoarma met knoflooksaus en ijsbergsla", "",""));
        avondEtenKeuze.add(new Maaltijd("rijst met kip, groenten en een zoete saus", "",""));
        avondEtenKeuze.add(new Maaltijd("aardappels met bloemkool, kipfilet en een romige saus", "",""));
        avondEtenKeuze.add(new Maaltijd("pizza margherita", "",""));
        avondEtenKeuze.add(new Maaltijd("pizza salami", "",""));
        return avondEtenKeuze;
    }

    public static ArrayList<KeuzePatiënt> keuzesDrinkenEnExtra() {
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","water", "geen extraatje"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","koffie", "geen extraatje"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","thee", "geen extraatje"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","chocolademelk", "geen extraatje"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","geen drinken", "kippensoep"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","geen drinken", "tomatensoep"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","geen drinken", "groentensoep"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","geen drinken", "yoghurt"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","geen drinken", "banaan"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","geen drinken", "appel"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","geen drinken", "vanille ijs"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","koffie", "banaan"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","water", "tomatensoep"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","thee", "vanille ijs"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","chocolademelk", "yoghurt"));
        keuzeDrinkenEnExtra.add(new KeuzePatiënt("","geen drinken", "geen extraatje"));
        return keuzeDrinkenEnExtra;
    }


    public static void selecteerOchtendMaaltijd() {
        keuzesOchtendEten();
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
            selecteerOchtendMaaltijd();
        }
    }

    public static void selecteerMiddagMaaltijd() {
        keuzesMiddagEten();
        System.out.println("");
        System.out.println("Bij de middagmaaltijd horen de volgende keuzes: ");
        System.out.println("1) " + middagEtenKeuze.get(0).getEten());
        System.out.println("2) " + middagEtenKeuze.get(1).getEten());
        System.out.println("3) " + middagEtenKeuze.get(2).getEten());
        System.out.println("4) " + middagEtenKeuze.get(3).getEten());
        System.out.println("5) " + middagEtenKeuze.get(4).getEten());
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
        } else if (keuzeMiddagEten == 4) {
            System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(3).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw middagmaaltijd afgerond");
        } else if (keuzeMiddagEten == 5) {
            System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(4).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw middagmaaltijd afgerond");
        } else {
            System.out.println("Kies alleen 1 tot 5!");
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
        System.out.println("5) " + avondEtenKeuze.get(4).getEten());
        System.out.println("6) " + avondEtenKeuze.get(5).getEten());
        System.out.println("7) " + avondEtenKeuze.get(6).getEten());
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
        } else if (keuzeAvondEten == 5) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(4).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 6) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(5).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 7) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(6).getEten());
            selecteerDrinkenEnExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else {
            System.out.println("Kies alleen 1 tot 7!");
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
        System.out.println("5) " + keuzeDrinkenEnExtra.get(4).getDrinken() + " en "  + keuzeDrinkenEnExtra.get(4).getExtra());
        System.out.println("6) " + keuzeDrinkenEnExtra.get(5).getDrinken() + " en "  + keuzeDrinkenEnExtra.get(5).getExtra());
        System.out.println("7) " + keuzeDrinkenEnExtra.get(6).getDrinken()  + " en " + keuzeDrinkenEnExtra.get(6).getExtra());
        System.out.println("8) " + keuzeDrinkenEnExtra.get(7).getDrinken()  + " en " + keuzeDrinkenEnExtra.get(7).getExtra());
        System.out.println("9) " + keuzeDrinkenEnExtra.get(8).getDrinken()+ " en "  + keuzeDrinkenEnExtra.get(8).getExtra());
        System.out.println("10) " + keuzeDrinkenEnExtra.get(9).getDrinken()  + " en " + keuzeDrinkenEnExtra.get(9).getExtra());
        System.out.println("11) " + keuzeDrinkenEnExtra.get(10).getDrinken()  + " en " + keuzeDrinkenEnExtra.get(10).getExtra());
        System.out.println("12) " + keuzeDrinkenEnExtra.get(11).getDrinken() + " en " + keuzeDrinkenEnExtra.get(11).getExtra());
        System.out.println("13) " + keuzeDrinkenEnExtra.get(12).getDrinken()  + " en " + keuzeDrinkenEnExtra.get(12).getExtra());
        System.out.println("14) " + keuzeDrinkenEnExtra.get(13).getDrinken() + " en " + keuzeDrinkenEnExtra.get(13).getExtra());
        System.out.println("15) " + keuzeDrinkenEnExtra.get(14).getDrinken()  + " en " + keuzeDrinkenEnExtra.get(14).getExtra());
        System.out.println("0) " + keuzeDrinkenEnExtra.get(15).getDrinken()  + " en " + keuzeDrinkenEnExtra.get(15).getExtra());
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
        } else if (keusDrinkenEnExtra == 5) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(4).getDrinken() + " en " + keuzeDrinkenEnExtra.get(4).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 6) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(5).getDrinken() + " en " + keuzeDrinkenEnExtra.get(5).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 7) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(6).getDrinken() + " en " + keuzeDrinkenEnExtra.get(6).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 8) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(7).getDrinken() + " en " + keuzeDrinkenEnExtra.get(7).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 9) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(8).getDrinken() + " en " + keuzeDrinkenEnExtra.get(8).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 10) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(9).getDrinken() + " en " + keuzeDrinkenEnExtra.get(9).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 11) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(10).getDrinken() + " en " + keuzeDrinkenEnExtra.get(10).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 12) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(11).getDrinken() + " en " + keuzeDrinkenEnExtra.get(11).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 13) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(12).getDrinken() + " en " + keuzeDrinkenEnExtra.get(12).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 14) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(13).getDrinken() + " en " + keuzeDrinkenEnExtra.get(13).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 15) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(14).getDrinken() + " en " + keuzeDrinkenEnExtra.get(14).getExtra() + " gekozen");
        } else if (keusDrinkenEnExtra == 0) {
            System.out.println("U heeft " + keuzeDrinkenEnExtra.get(15).getDrinken() + " en " + keuzeDrinkenEnExtra.get(15).getExtra() + " gekozen");
        } else {
            System.out.println("Kies alleen 0 tot 15!");
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
            Bestelling bestelling = new Bestelling("","","");
            bestelling.verstuurMaaltijden();
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
    public static ArrayList<Maaltijd> getKeuzesAvondEten() {
        return avondEtenKeuze;
    }
    public static ArrayList<KeuzePatiënt> getKeuzesDrinkenEnExtra() {
        return keuzeDrinkenEnExtra;
    }

}







