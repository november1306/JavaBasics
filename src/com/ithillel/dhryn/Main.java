package com.ithillel.dhryn;

import com.ithillel.dhryn.exceptions.CatchingExp;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        CatchingExp.wrongArrayIndex();
        CatchingExp.readFromFile();
        CatchingExp.raiseException();

    }
}
