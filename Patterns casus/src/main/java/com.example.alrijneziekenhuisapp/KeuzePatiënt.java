package com.example.alrijneziekenhuisapp;

public class KeuzePatiënt {
    private String drinken, extra, eten;

    public KeuzePatiënt(String drinken, String extra) {
        setKeuzePatiënt(drinken, extra);
    }

    public KeuzePatiënt(String eten, String drinken, String extra) {
        setKeuzePatiënt(eten, drinken, extra);
    }

    public KeuzePatiënt() {
    }

    public void setKeuzePatiënt (String drinken, String extra) {
        this.drinken = drinken;
        this.extra = extra;
    }

    public void setKeuzePatiënt (String eten, String drinken, String extra) {
        this.drinken = drinken;
        this.extra = extra;
        this.eten = eten;
    }

    public String getEten() {
        return eten;
    }

    public String getDrinken() {
        return drinken;
    }

    public String getExtra() {
        return extra;
    }

}
