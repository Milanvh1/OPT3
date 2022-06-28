package com.example.alrijneziekenhuisapp;

import java.util.ArrayList;

public class KeukenManager {

    String bestelUpdate;
    ArrayList<DashboardObserver> ontvangers;

    void setOntvangers() {
        ontvangers = new ArrayList<DashboardObserver>();
        ontvangers.add(new DashboardKeuken());
        ontvangers.add(new DashboardKeukenMedewerker("Milan"));
        ontvangers.add(new DashboardKeukenMedewerker("Armin"));
    }

    public void berichtAlleObservers(){
        for(DashboardObserver observer : ontvangers) {
            observer.update(this.bestelUpdate);
        }
    }

    void setBestelUpdate(String bestelUpdate){
        this.bestelUpdate = bestelUpdate;
        berichtAlleObservers();
    }
}

interface DashboardObserver{
    public void update(String bestelUpdate);
}

class DashboardKeuken implements DashboardObserver {
    String bestelUpdate;

    @Override
    public void update(String bestelUpdate) {
        this.bestelUpdate = bestelUpdate;
        System.out.println("Dashboardkeuken: " + bestelUpdate);
    }
}

class DashboardKeukenMedewerker implements DashboardObserver {
    String naam;
    String bestelUpdate;

    public DashboardKeukenMedewerker(String naam){
        this.naam = naam;
    }

    @Override
    public void update(String bestelUpdate) {
        this.bestelUpdate = bestelUpdate;
        System.out.println("Dashboardkeukenmedewerker: " + naam + ":" + bestelUpdate);
    }

}