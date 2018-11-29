package com.Java24Hrs;

import java.util.*;

public class Dice {
    public static void main (String[] args) {

        Random generator = new Random();

        int value = generator.nextInt();

        System.out.println("The random number is "
        + value);

    }
}

