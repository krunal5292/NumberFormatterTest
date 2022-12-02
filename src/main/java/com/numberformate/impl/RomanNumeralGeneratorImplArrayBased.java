package com.numberformate.impl;

import com.numberformate.core.NumeralGenerator;

public class RomanNumeralGeneratorImplArrayBased implements NumeralGenerator {

    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    @Override
    public String generate(int number) {
        validate(number);
        StringBuilder finalNumber = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            while (number >= value) {
                number -= value;
                finalNumber.append(romanLiterals[i]);
            }
        }
        return finalNumber.toString();
    }
}
