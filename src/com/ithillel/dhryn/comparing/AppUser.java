package com.ithillel.dhryn.comparing;

public class AppUser implements Comparable<AppUser>, Encryptable {
    private final String login;
    private final String password;
    private final AppUserType type;


    protected AppUser(String login, String password, AppUserType type) {
        this.login = login;
        this.password = password;
        this.type = type;
    }


    public String getLogin() {
        return this.login;
    }

    public AppUserType getType() {
        return this.type;
    }


    @Override
    public String toString() {
        return "\nUser{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AppUser)) return false;
        AppUser a = (AppUser) obj;
        return this.login.equals(a.login) && this.password.equals(a.password) && this.type.equals(a.type);
    }

    @Override
    public int hashCode() {
        return this.login.hashCode() + 7 * this.password.hashCode() + type.ordinal();
    }

    @Override
    public int compareTo(AppUser that) {
        String thisCompare = this.type.getPriority() + this.login;
        String thatCompare = that.type.getPriority() + that.login;
        return thisCompare.compareTo(thatCompare);
    }

    public int compareToInOtherWay(AppUser that) {
        int result = this.type.compareTo(that.type);
        if (result == 0) {
            result = this.login.compareTo(that.login);
        }
        return result;
    }

    @Override
    public boolean encode(String encriptionKey) {
        return false;
    }

    @Override
    public boolean decode(String encriptionKey) {
        return false;
    }
}
