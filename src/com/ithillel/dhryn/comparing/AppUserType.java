package com.ithillel.dhryn.comparing;

public enum AppUserType {
    ADMIN(0), // the highest
    PREMIUM(1), // high
    AUTHORIZED(2), // normal
    GUEST(3); // low

    private int priority;
    private AppUserType(int priority) {
        this.priority = priority;
    }
    public int getPriority() {
        return this.priority;
    }
}
