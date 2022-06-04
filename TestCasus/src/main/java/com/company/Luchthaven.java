package com.company;

import java.util.ArrayList;

public class Luchthaven {

    private static double BASISPRIJS = 0.0;
    private static int gewichtVliegtuigKlein = 999;
    private static int gewichtVliegtuigMiddel = 4999;
    private static int gewichtVliegtuigGroot = 5000;
    private static int aantalPassagiers = 2;
    private static boolean bagageAfgehandeld = true;
    private static boolean nederlands= true;

    public static double getPrijsGewicht(int gewichtVliegtuig) {

        double prijs = BASISPRIJS;

        if (gewichtVliegtuig <= gewichtVliegtuigKlein) {
            prijs = prijs + 100;
        } else if (gewichtVliegtuig <= gewichtVliegtuigMiddel) {
            prijs = prijs + 500;
        } else if (gewichtVliegtuig >= gewichtVliegtuigGroot) {
            prijs = prijs + 2500;
        }
        return prijs;
    }

    public static double getPrijsTotaal(int gewichtVliegtuig, int passagiers, boolean bagage, boolean nederlandsVliegtuig) {

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

        if(bagage == bagageAfgehandeld) {
            prijs = prijs + 800;
        }

        if(nederlandsVliegtuig == nederlands) {
            prijs = prijs * 1.21;
        }
        return prijs;
    }
}
