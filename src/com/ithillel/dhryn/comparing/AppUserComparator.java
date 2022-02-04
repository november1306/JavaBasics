package com.ithillel.dhryn.comparing;

import java.util.Comparator;

public class AppUserComparator implements Comparator<AppUser> {

        public int compare(AppUser a, AppUser b){

            int result = a.getType().compareTo(b.getType());
            if (result == 0) {
                result = a.getLogin().compareTo(b.getLogin());
            }
            return result * -1;
        }
    }

