package com.example.alrijneziekenhuisapp;

abstract class Bestelling extends Maaltijd{

    protected abstract void bestellen();
    protected abstract void bereiden();
    protected abstract void afleveren();

    public final void bestelproces() {
        bestellen();
        bereiden();
        afleveren();
    }

    public Bestelling(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }
}

class OchtendMaaltijdBestelling extends Bestelling {

    public OchtendMaaltijdBestelling(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }

    @Override
    protected void bestellen() {
        System.out.println("Ochtendmaaltijd besteld!");
    }

    @Override
    protected void bereiden() {
        System.out.println("Ochtendmaaltijd wordt nu bereid!");
    }

    @Override
    protected void afleveren() {
        System.out.println("Ochtendmaaltijd is klaar en komt er nu aan!");
    }
}

class MiddagMaaltijdBestelling extends Bestelling {

    public MiddagMaaltijdBestelling(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }

    @Override
    protected void bestellen() {
        System.out.println("Middagmaaltijd besteld!");
    }

    @Override
    protected void bereiden() {
        System.out.println("Middagmaaltijd wordt nu bereid!");
    }

    @Override
    protected void afleveren() {
        System.out.println("Middagmaaltijd is klaar en komt er nu aan!");
    }
}

class AvondMaaltijdBestelling extends Bestelling{

    public AvondMaaltijdBestelling(String eten, String drinken, String extra) {
        super(eten, drinken, extra);
    }

    @Override
    protected void bestellen() {
        System.out.println("Avondmaaltijd besteld!");
    }

    @Override
    protected void bereiden() {
        System.out.println("Avondmaaltijd wordt nu bereid!");
    }

    @Override
    protected void afleveren() {
        System.out.println("Avondmaaltijd is klaar en komt er nu aan!");
    }
}