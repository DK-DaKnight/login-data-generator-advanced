package com.daknight.logindatagenerator.ui.menu.settings.config;

public class UsernameSettings {
    private int usernameMaxBigChars;
    private int usernameMaxSmallChars;

    public UsernameSettings(int maxBig, int maxSmall) {
        usernameMaxBigChars = maxBig;
        usernameMaxSmallChars = maxSmall;
    }

    public int getUsernameMaxBigChars() {
        return usernameMaxBigChars;
    }

    public void setUsernameMaxBigChars(int usernameMaxBigChars) {
        this.usernameMaxBigChars = usernameMaxBigChars;
    }

    public int getUsernameMaxSmallChars() {
        return usernameMaxSmallChars;
    }

    public void setUsernameMaxSmallChars(int usernameMaxSmallChars) {
        this.usernameMaxSmallChars = usernameMaxSmallChars;
    }
}
