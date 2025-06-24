package com.daknight.logindatagenerator.util.generators;

import com.daknight.logindatagenerator.utils.generators.PasswordGenerator;

public class PasswordGeneratorTest {
    public static void main(String[] args) {
        System.out.println(new PasswordGenerator(5, 5, 5, 5).generatePassword());
    }
}
