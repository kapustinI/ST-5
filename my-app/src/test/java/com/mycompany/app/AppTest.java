package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void testZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), 1e-8);
    }

    @Test
    void testOne() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), 1e-8);
    }

    @Test
    void testPerfectSquare() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), 1e-8);
    }

    @Test
    void testSmallNumber() {
        Sqrt sqrt = new Sqrt(0.01);
        assertEquals(0.1, sqrt.calc(), 1e-8);
    }

    @Test
    void testLargeNumber() {
        Sqrt sqrt = new Sqrt(1_000_000.0);
        assertEquals(1000.0, sqrt.calc(), 1e-6);
    }

    @Test
    void testNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), 1e-8);
    }

    @Test
    void testImproveMethod() {
        Sqrt sqrt = new Sqrt(0);
        double guess = 2.0;
        double improved = sqrt.improve(guess, 9.0);
        assertEquals( (2.0 + 9.0/2.0) / 2.0, improved, 1e-8);
    }

    @Test
    void testAverageMethod() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(5.0, sqrt.average(4.0, 6.0), 1e-8);
    }

    @Test
    void testGoodMethodWhenGood() {
        Sqrt sqrt = new Sqrt(0);
        assertTrue(sqrt.good(3.0, 9.0));
    }

    @Test
    void testGoodMethodWhenNotGood() {
        Sqrt sqrt = new Sqrt(0);
        assertFalse(sqrt.good(2.0, 9.0));
    }
}
