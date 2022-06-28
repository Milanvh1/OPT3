package com.example.alrijneziekenhuisapp;

abstract class Bestelling extends Maaltijd{

    abstract void bestellen();
    abstract void bereiden();
    abstract void afleveren();

    public final void bestelproces() {
        bestellen();
        bereiden();
        afleveren();
    }

    public Bestelling(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }
}

class OchtendMaaltijd extends Bestelling {

    public OchtendMaaltijd(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }

    @Override
    void bestellen() {
        System.out.println("Ochtendmaaltijd besteld!");
    }

    @Override
    void bereiden() {
        System.out.println("Ochtendmaaltijd wordt nu bereid!");
    }

    @Override
    void afleveren() {
        System.out.println("Ochtendmaaltijd is klaar en komt er nu aan!");
    }
}

class MiddagMaaltijd extends Bestelling {

    public MiddagMaaltijd(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }

    @Override
    void bestellen() {
        System.out.println("Middagmaaltijd besteld!");
    }

    @Override
    void bereiden() {
        System.out.println("Middagmaaltijd wordt nu bereid!");
    }

    @Override
    void afleveren() {
        System.out.println("Middagmaaltijd is klaar en komt er nu aan!");
    }
}

class AvondMaaltijd extends Bestelling{

    public AvondMaaltijd(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }

    @Override
    void bestellen() {
        System.out.println("Avondmaaltijd besteld!");
    }

    @Override
    void bereiden() {
        System.out.println("Avondmaaltijd wordt nu bereid!");
    }

    @Override
    void afleveren() {
        System.out.println("Avondmaaltijd is klaar en komt er nu aan!");
    }
}