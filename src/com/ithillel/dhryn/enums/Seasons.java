package com.ithillel.dhryn.enums;

public enum Seasons {
    SUMMER(22, "лето"),
    AUTUMN (8, "осень"),
    WINTER (-4, "зима"),
    SPRING (12, "весна");

    private int avgtemp;
    private String ruCaption;

    private Seasons (int avgtemp, String ruCaption) {
        this.avgtemp = avgtemp;
        this.ruCaption = ruCaption;
    }

    public int getAvgtemp() {
        return avgtemp;
    }

    public String getRuCaption() {
        return ruCaption;
    }
}
