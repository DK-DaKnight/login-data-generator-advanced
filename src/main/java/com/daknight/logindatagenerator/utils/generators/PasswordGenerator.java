package com.daknight.logindatagenerator.utils.generators;

import com.daknight.logindatagenerator.utils.lib.arrays.Characters;
import com.daknight.logindatagenerator.utils.lib.arrays.Numbers;

import java.security.SecureRandom;

public class PasswordGenerator {
    private int MAX_BIG_CHARS;
    private int MAX_SMALL_CHARS;
    private int MAX_SPECIAL_CHARS;
    private int MAX_NUMBERS;
    private SecureRandom random = new SecureRandom();

    public PasswordGenerator(int maxBig, int maxSmall, int maxSpecial, int maxNumbers) {
        MAX_BIG_CHARS = maxBig;
        MAX_SMALL_CHARS = maxSmall;
        MAX_SPECIAL_CHARS = maxSpecial;
        MAX_NUMBERS = maxNumbers;
    }

    private char[] generateBigChars() {
        char[] generated = new char[MAX_BIG_CHARS];

        for (int i = 0; i < MAX_BIG_CHARS; i++) {
            generated[i] = Characters.bigChars[random.nextInt(Characters.bigChars.length)];
        }
        return generated;
    }
    private char[] generateSmallChars() {
        char[] generated = new char[MAX_SMALL_CHARS];

        for (int i = 0; i < MAX_SMALL_CHARS; i++) {
            generated[i] = Characters.smallChars[random.nextInt(Characters.smallChars.length)];
        }
        return generated;
    }
    private char[] generateSpecialChars() {
        char[] generated = new char[MAX_SPECIAL_CHARS];

        for (int i = 0; i < MAX_SPECIAL_CHARS; i++) {
            generated[i] = Characters.specialChars[random.nextInt(Characters.specialChars.length)];
        }
        return generated;
    }
    private int[] generateNumbers() {
        int[] generated = new int[MAX_NUMBERS];

        for (int i = 0; i < MAX_NUMBERS; i++) {
            generated[i] = Numbers.numbers[random.nextInt(Numbers.numbers.length)];
        }
        return generated;
    }

    public String generatePassword() {
        char[] bigChars = generateBigChars();
        char[] smallChars = generateSmallChars();
        char[] specialChars = generateSpecialChars();
        int[] numbers = generateNumbers();

        int totalLength = MAX_BIG_CHARS + MAX_SMALL_CHARS + MAX_SPECIAL_CHARS + MAX_NUMBERS;
        String[] password = new String[totalLength];
        int index = 0;

        for (char c : bigChars) {
            password[index++] = String.valueOf(c);
        }
        for (char c : smallChars) {
            password[index++] = String.valueOf(c);
        }
        for (char c : specialChars) {
            password[index++] = String.valueOf(c);
        }
        for (int i : numbers) {
            password[index++] = String.valueOf(i);
        }

        StringBuilder generatedPassword = new StringBuilder();

        for (int i = 0; i < totalLength; i++) {
            int randomIndex = random.nextInt(password.length);
            generatedPassword.append(password[randomIndex]);
        }
        return generatedPassword.toString();
    }
}
