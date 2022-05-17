package com.company;

import java.util.ArrayList;

public class Luchthaven {

    private static double BASISPRIJS = 0.0;
    private static int gewichtVliegtuigKlein = 999;
    private static int gewichtVliegtuigMiddel = 4999;
    private static int gewichtVliegtuigGroot = 5000;
    private static int aantalPassagiers = 2;
    private static boolean baggageAfgehandeld = true;
    private static boolean nederlands= true;

    private ArrayList<Vliegtuig> vliegtuigen;

    public static double getPrijs(int gewichtVliegtuig, int passagiers, boolean baggage, boolean nederlandsVliegtuig) {

        double prijs = BASISPRIJS;

        if (gewichtVliegtuig <= gewichtVliegtuigKlein) {
            prijs = prijs + 100;
        }
        else if (gewichtVliegtuig <= gewichtVliegtuigMiddel) {
            prijs = prijs + 500;
        }
        else if (gewichtVliegtuig >= gewichtVliegtuigGroot) {
            prijs = prijs + 2500;
        }

        if (passagiers > aantalPassagiers) {
            prijs = prijs * 1.5;
        }

        if(baggage == baggageAfgehandeld) {
            prijs = prijs + 800;
        }

        if(nederlandsVliegtuig == nederlands) {
            prijs = prijs * 1.21;
        }
        return prijs;
    }
}
