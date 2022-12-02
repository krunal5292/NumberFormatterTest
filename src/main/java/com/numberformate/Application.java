package com.numberformate;

import com.numberformate.core.NumberGenerator;
import com.numberformate.impl.RomanNumeralGeneratorImplArrayBased;
import com.numberformate.impl.RomanNumeralGeneratorImpl;
import com.numberformate.impl.RomanNumeralGeneratorImplValidationDemo;

public class Application {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = NumberGenerator.builder().numeralGenerator(new RomanNumeralGeneratorImplArrayBased()).build();
        System.out.println(numberGenerator.generate(3200));

        NumberGenerator numberGenerator1 = NumberGenerator.builder().numeralGenerator(new RomanNumeralGeneratorImpl()).build();
        System.out.println(numberGenerator1.generate(3200));


        NumberGenerator numberGenerator2 = NumberGenerator.builder().numeralGenerator(new RomanNumeralGeneratorImplValidationDemo()).build();
        System.out.println(numberGenerator1.generate(3200));
    }
}
