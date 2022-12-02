package com.numberformate.core;

import lombok.Builder;

@Builder
public class NumberGenerator {

    private NumeralGenerator numeralGenerator;

    public String generate(int number) {
        return numeralGenerator.generate(number);
    }


}
