package com.example.demo.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CTest {

    @Test
    void testAdd() {
        D d = new D();
        assertEquals(5, d.add.calculate(2, 3), "Addition of 2 and 3 should be 5");
        assertEquals(0, d.add.calculate(-2, 2), "Addition of -2 and 2 should be 0");
        assertEquals(-5, d.add.calculate(-3, -2), "Addition of -3 and -2 should be -5");
    }

    @Test
    void testMul() {
        D d = new D();
        assertEquals(6, d.mul.calculate(2, 3), "Multiplication of 2 and 3 should be 6");
        assertEquals(-4, d.mul.calculate(-2, 2), "Multiplication of -2 and 2 should be -4");
        assertEquals(6, d.mul.calculate(-3, -2), "Multiplication of -3 and -2 should be 6");
    }

    @Test
    void testDiv() {
        D d = new D();
        assertEquals(2, d.div.calculate(6, 3), "Division of 6 by 3 should be 2");
        assertEquals(-2, d.div.calculate(-6, 3), "Division of -6 by 3 should be -2");
        assertEquals(3, d.div.calculate(9, 3), "Division of 9 by 3 should be 3");
    }

    @Test
    void testSub() {
        D d = new D();
        assertEquals(-1, d.sub.calculate(2, 3), "Subtraction of 2 and 3 should be -1");
        assertEquals(-4, d.sub.calculate(-2, 2), "Subtraction of -2 and 2 should be -4");
        assertEquals(-1, d.sub.calculate(-3, -2), "Subtraction of -3 and -2 should be -1");
    }
}
