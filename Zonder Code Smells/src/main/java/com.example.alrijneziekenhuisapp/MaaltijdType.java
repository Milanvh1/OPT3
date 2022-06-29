package com.example.alrijneziekenhuisapp;

public class MaaltijdType {

    public static final MaaltijdType OCHTENDMAALTIJD = new MaaltijdType(4);
    public static final MaaltijdType MIDDAGMAALTIJD = new MaaltijdType(3);
    public static final MaaltijdType AVONDMAALTIJD = new MaaltijdType(4);

    private int aantalMaaltijden;

    public MaaltijdType (int aantalMaaltijden) {
        this.aantalMaaltijden = aantalMaaltijden;
    }

    public int getAantalMaaltijden () {
        return aantalMaaltijden;
    }

}
