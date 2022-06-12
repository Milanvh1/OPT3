package com.example.alrijneziekenhuisapp;

import java.util.ArrayList;
public class Bestelling extends Maaltijd{

    private ArrayList<MaaltijdInhoud> alleMaaltijden = initialiseerMaaltijden();

    public Bestelling(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }

    private ArrayList<MaaltijdInhoud> initialiseerMaaltijden() {
        ArrayList<MaaltijdInhoud> lijstMetMaaltijden = new ArrayList<>();
        MaaltijdInhoud ochtendMaaltijd = new OchtendMaaltijd(getEten(), getDrinken(), getExtra());
        MaaltijdInhoud middagMaaltijd = new MiddagMaaltijd(getEten(), getDrinken(), getExtra());
        MaaltijdInhoud avondMaaltijd = new AvondMaaltijd(getEten(), getDrinken(), getExtra());
        lijstMetMaaltijden.add(ochtendMaaltijd);
        lijstMetMaaltijden.add(middagMaaltijd);
        lijstMetMaaltijden.add(avondMaaltijd);
        return lijstMetMaaltijden;
    }

    public void verstuurMaaltijden() {
        for (MaaltijdInhoud maaltijd : alleMaaltijden) {
            maaltijd.verstuurMaaltijd();
        }
    }
}


interface MaaltijdInhoud {
    public void verstuurMaaltijd();
}

class OchtendMaaltijd extends Maaltijd implements MaaltijdInhoud {

    public OchtendMaaltijd(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }

    @Override
    public void verstuurMaaltijd() {
        System.out.println("Ochtendmaaltijd verstuurd!");
    }
}

class MiddagMaaltijd extends Maaltijd implements MaaltijdInhoud {

    public MiddagMaaltijd(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }

    @Override
    public void verstuurMaaltijd() {
        System.out.println("Middagmaaltijd verstuurd!");
    }
}

class AvondMaaltijd extends Maaltijd implements MaaltijdInhoud {

    public AvondMaaltijd(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }

    @Override
    public void verstuurMaaltijd() {
        System.out.println("Avondmaaltijd verstuurd!");
    }
}