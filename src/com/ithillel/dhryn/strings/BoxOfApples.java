package com.ithillel.dhryn.strings;

public class BoxOfApples {

    private int apples = 0;

    public void setApples(int apples) {
        this.apples = apples;
    }

    public int getApples() {
        return apples;
    }

    public BoxOfApples getThisInstance() {
        BoxOfApples newBox = new BoxOfApples();
        return newBox;
    }
}
