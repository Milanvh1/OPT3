package com.company;

public class Vliegtuig {

    private boolean toestemmingLuchthaven;
    private int gewichtLading;
    private int tegenwind;

    public Vliegtuig (boolean toestemmingLuchthaven, int gewichtLading, int tegenwind) {
        this.toestemmingLuchthaven = toestemmingLuchthaven;
        this.gewichtLading= gewichtLading;
        this.tegenwind = tegenwind;
    }

    public boolean opstijgenVliegtuig(boolean toestemmingLuchthaven, int gewichtLading, int tegenwind) {
        return (toestemmingLuchthaven && (gewichtLading < 1000 || tegenwind > 50));
    }
}