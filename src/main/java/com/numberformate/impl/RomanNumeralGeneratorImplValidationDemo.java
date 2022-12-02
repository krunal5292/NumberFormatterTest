package com.numberformate.impl;

import com.numberformate.core.NumeralGenerator;
import com.numberformate.core.Validator;

public class RomanNumeralGeneratorImplValidationDemo implements NumeralGenerator, Validator {

    @Override
    public void validate(int number) {
        // add custom validation code here
    }

    @Override
    public String generate(int number) {
        validate(number);

        // number generation code , as this is example class just returning the same number
        return number + "";
    }
}
