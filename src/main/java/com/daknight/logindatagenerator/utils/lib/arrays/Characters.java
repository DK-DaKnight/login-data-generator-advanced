package com.daknight.logindatagenerator.utils.lib.arrays;

public class Characters {
    public static final char[] bigChars = new char[26];
    public static final char[] smallChars = new char[26];
    public static final char[] specialChars = {
            '!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
            '-', '_', '=', '+', '[', ']', '{', '}', ';', ':',
            '\'', '"', ',', '.', '<', '>', '/', '?', '\\', '|'
    };

    static {
        for (int i = 0; i < 26; i++) {
            bigChars[i] = (char) ('A' + i);
            smallChars[i] = (char) ('a' + i);
        }
    }
}
