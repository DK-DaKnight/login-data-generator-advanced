package com.daknight.logindatagenerator.utils.generators;

import com.daknight.logindatagenerator.utils.lib.arrays.Characters;
import java.security.SecureRandom;

public class UsernameGenerator {
    private int MAX_BIG_CHARS;
    private int MAX_SMALL_CHARS;
    private SecureRandom random = new SecureRandom();

    public UsernameGenerator(int maxBig, int maxSmall) {
        MAX_BIG_CHARS = maxBig;
        MAX_SMALL_CHARS = maxSmall;
    }

    private char[] generateBigChar() {
        char[] generated = new char[MAX_BIG_CHARS];

        for (int i = 0; i < MAX_BIG_CHARS; i++) {
            generated[i] = Characters.bigChars[random.nextInt(Characters.bigChars.length)];
        }
        return generated;
    }

    private char[] generateSmallChar() {
        char[] generated = new char[MAX_SMALL_CHARS];

        for (int i = 0; i < MAX_SMALL_CHARS; i++) {
            generated[i] = Characters.smallChars[random.nextInt(Characters.smallChars.length)];
        }
        return generated;
    }

    public String generateUsername() {
        char[] bigChars = generateBigChar();
        char[] smallChars = generateSmallChar();

        int totalLength = MAX_BIG_CHARS + MAX_SMALL_CHARS;
        String[] username = new String[totalLength];
        int index = 0;

        for (char c : bigChars) {
            username[index++] = String.valueOf(c);
        }
        for (char c : smallChars) {
            username[index++] = String.valueOf(c);
        }

        StringBuilder generatedUsername = new StringBuilder();
        for (int i = 0; i < totalLength; i++) {
            int randomIndex = random.nextInt(username.length);
            generatedUsername.append(username[randomIndex]);
        }
        return generatedUsername.toString();
    }
}
