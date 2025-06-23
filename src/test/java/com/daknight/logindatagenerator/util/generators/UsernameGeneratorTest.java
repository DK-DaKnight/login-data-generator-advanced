package com.daknight.logindatagenerator.util.generators;

import com.daknight.logindatagenerator.utils.generators.UsernameGenerator;

public class UsernameGeneratorTest {
    public static void main(String[] args) {
        System.out.println(new UsernameGenerator(5,5).generateUsername());
    }
}
