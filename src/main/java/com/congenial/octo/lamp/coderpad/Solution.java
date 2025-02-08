package com.congenial.octo.lamp.coderpad;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runner.notification.*;

// Class to be tested
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

// ✅ Test class must be public for JUnit to recognize it
public class Solution {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.subtract(10, 4));
    }

    // ✅ Main method to manually run tests in CoderPad
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}
