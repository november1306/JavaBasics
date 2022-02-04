package com.ithillel.dhryn.comparing;

public class PremiumUser extends AppUser {

    protected PremiumUser(String login, String password, AppUserType type) {
        super(login, password, type);
    }

    public boolean encode(String encriptionKey) {
        return false;
    }

}
