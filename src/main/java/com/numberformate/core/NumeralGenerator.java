package com.numberformate.core;

public interface NumeralGenerator {

    default void validate(int number) {
        if (number < 1)
            throw new NumberFormatException("Value of RomanNumeral must be positive.");
        if (number > 3999)
            throw new NumberFormatException("Value of RomanNumeral must be less then 3999.");
    }

    String generate(int number);
}
