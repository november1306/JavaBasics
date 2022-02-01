package com.ithillel.dhryn.enums;

import java.util.Random;

public enum UserType {
    ADM,
    BUY,
    SEL;

    public static UserType getRandom() {
        Random randomizer = new Random();
        UserType[] userTypeList = UserType.values();
        int randomOrdinal = randomizer.nextInt(userTypeList.length);
        return userTypeList[randomOrdinal];
    }
}
