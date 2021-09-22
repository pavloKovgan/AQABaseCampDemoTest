package com.pk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc = new Calculator();

    @Test
    void getSum(){
        assertEquals(23, calc.getSum(11,12));
    }

}