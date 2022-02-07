package com.ithillel.dhryn.comparing;

import java.util.Comparator;

public class AppTypeComparator implements Comparator<AppUser> {

        public int compare(AppUser a, AppUser b){
            int result = a.getType().compareTo(b.getType());
            return result;
        }
    }

