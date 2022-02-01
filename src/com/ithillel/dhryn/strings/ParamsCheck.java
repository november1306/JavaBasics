package com.ithillel.dhryn.strings;

public class ParamsCheck {

    public static void doCheck() {
        String text = "phrase";

        String resText = text.toUpperCase();
        System.out.println(resText);

        String objText = new String("phrase");

        BoxOfApples boxOfApples = new BoxOfApples();
        boxOfApples.setApples(5);

        updateText(text);
        updateText(objText);
        addAnApple(boxOfApples);

        System.out.println(text);
        System.out.println(boxOfApples.getApples());
    }

    public static int increaseNumber(int internalNumber) {
        internalNumber = internalNumber + 1;
        return internalNumber;
    }

    public static void addAnApple(BoxOfApples boxOfApples) {
        boxOfApples.setApples(boxOfApples.getApples() + 1);
    }

    public static void updateText(String innerText) {
        innerText = innerText + " updated";
    }
}
