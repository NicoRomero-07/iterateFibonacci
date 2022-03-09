package org.nicor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonaciTest {
    /*
    Test cases
    0 --> 0
    1 --> 1
    2 --> 1
    3 --> 2
    10 --> 55
    -1 --> Exception
    */


    private Fibonacci fibonacci;
    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }
    @AfterEach
    public void finish(){
        fibonacci = null;
    }

    @Test
    public void shouldComputeReturnZeroIfTheNumberIsZero(){
        int expectedValue = 0;
        int value = 0;
        int result = fibonacci.compute(value);
        assertEquals(expectedValue, result);
    }
    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne(){
        int expectedValue = 1;
        int value = 1;
        int result = fibonacci.compute(value);
        assertEquals(expectedValue, result);
    }
    @Test
    public void shouldComputeReturnOneIfTheNumberIsTwo(){
        int expectedValue = 1;
        int value = 2;
        int result = fibonacci.compute(value);
        assertEquals(expectedValue, result);
    }
    @Test
    public void shouldComputeReturnOneIfTheNumberIsThree(){
        int expectedValue = 2;
        int value = 3;
        int result = fibonacci.compute(value);
        assertEquals(expectedValue, result);
    }
    public void shouldComputeReturn55IfTheNumberIsTen(){
        int expectedValue = 55;
        int value = 10;
        int result = fibonacci.compute(value);
        assertEquals(expectedValue, result);
    }
    @Test
    public void shouldComputeReturnAnExceptionIfTheNumberIsNegative(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }
}
