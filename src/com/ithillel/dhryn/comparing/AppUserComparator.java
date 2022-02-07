package com.ithillel.dhryn.comparing;

import java.util.Comparator;

public class AppUserComparator implements Comparator<AppUser> {

        public int compare(AppUser a, AppUser b){
            return a.getLogin().compareTo(b.getLogin());
        }
    }

