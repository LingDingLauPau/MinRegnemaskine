package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegnemaskineTest {

    @Test
    void add() {
        Regnemaskine calculator = new Regnemaskine();
        assertEquals(30,calculator.add(20,10),0.001);
    }

    @Test
    void subtract() {
        Regnemaskine calculator = new Regnemaskine();
        assertEquals(10,calculator.subtract(20,10),0.001);
    }

    @Test
    void multiply() {
        Regnemaskine calculator = new Regnemaskine();
        assertEquals(200,calculator.multiply(20,10),0.001);
    }

    @Test
    void divide() {
        Regnemaskine calculator = new Regnemaskine();
        assertEquals(2,calculator.divide(20,10),0.001);
    }
}