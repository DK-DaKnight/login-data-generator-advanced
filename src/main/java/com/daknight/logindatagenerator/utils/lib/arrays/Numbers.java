package com.daknight.logindatagenerator.utils.lib.arrays;

public class Numbers {
    public static final int[] numbers = new int[10];

    static {
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }
}
