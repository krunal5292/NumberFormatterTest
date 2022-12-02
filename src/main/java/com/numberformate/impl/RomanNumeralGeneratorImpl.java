package com.numberformate.impl;

import com.numberformate.core.NumeralGenerator;

public class RomanNumeralGeneratorImpl implements NumeralGenerator {

    String[] M = {"", "M", "MM", "MMM"};
    String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};


    @Override
    public String generate(int number) {
        validate(number);
        return M[number / 1000] + C[(number % 1000) / 100] + X[(number % 100) / 10] + I[number % 10];
    }
}
