package com.daknight.logindatagenerator.ui.menu.settings;

public class PasswordSettings {
    private int passwordMaxBigChars;
    private int passwordMaxSmallChars;
    private int passwordMaxSpecialChars;
    private int passwordMaxNumbers;

    public PasswordSettings(int maxBig, int maxSmall, int maxSpecial, int maxNumbers) {
        passwordMaxBigChars = maxBig;
        passwordMaxSmallChars = maxSmall;
        passwordMaxSpecialChars = maxSpecial;
        passwordMaxNumbers = maxNumbers;
    }

    public int getPasswordMaxBigChars() {
        return passwordMaxBigChars;
    }

    public void setPasswordMaxBigChars(int passwordMaxBigChars) {
        this.passwordMaxBigChars = passwordMaxBigChars;
    }

    public int getPasswordMaxSmallChars() {
        return passwordMaxSmallChars;
    }

    public void setPasswordMaxSmallChars(int passwordMaxSmallChars) {
        this.passwordMaxSmallChars = passwordMaxSmallChars;
    }

    public int getPasswordMaxSpecialChars() {
        return passwordMaxSpecialChars;
    }

    public void setPasswordMaxSpecialChars(int passwordMaxSpecialChars) {
        this.passwordMaxSpecialChars = passwordMaxSpecialChars;
    }

    public int getPasswordMaxNumbers() {
        return passwordMaxNumbers;
    }

    public void setPasswordMaxNumbers(int passwordMaxNumbers) {
        this.passwordMaxNumbers = passwordMaxNumbers;
    }
}
