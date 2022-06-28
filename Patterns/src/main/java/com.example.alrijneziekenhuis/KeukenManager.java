package com.example.alrijneziekenhuisapp;

import java.util.ArrayList;

public class KeukenManager {

    public String bestelUpdate;
    public ArrayList<DashboardObserver> ontvangers;

    public void setOntvangers() {
        ontvangers = new ArrayList<DashboardObserver>();
        ontvangers.add(new DashboardKeuken());
        ontvangers.add(new DashboardChef("Milan"));
        ontvangers.add(new DashboardChef("Armin"));
    }

    public void berichtAlleObservers(){
        for(DashboardObserver observer : ontvangers) {
            observer.update(this.bestelUpdate);
        }
    }

    public void setBestelUpdate(String bestelUpdate){
        this.bestelUpdate = bestelUpdate;
        berichtAlleObservers();
    }
}

interface DashboardObserver{
    public void update(String bestelUpdate);
}

class DashboardKeuken implements DashboardObserver {
    public String bestelUpdate;

    @Override
    public void update(String bestelUpdate) {
        this.bestelUpdate = bestelUpdate;
        System.out.println("Dashboardkeuken: " + bestelUpdate);
    }
}

class DashboardChef implements DashboardObserver {
    public String naam;
    public String bestelUpdate;

    public DashboardChef(String naam){
        this.naam = naam;
    }

    @Override
    public void update(String bestelUpdate) {
        this.bestelUpdate = bestelUpdate;
        System.out.println("Dashboardkeukenmedewerker: " + naam + ":" + bestelUpdate);
    }

}