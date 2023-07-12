package com.jirengu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleWithBitOperationTest {

    @Test
    public void testDoubleWithBitOperation() {
        assertEquals(4, DoubleWithBitOperation.doubleWithBitOperation(2));
        assertEquals(0, DoubleWithBitOperation.doubleWithBitOperation(0));
        assertEquals(100, DoubleWithBitOperation.doubleWithBitOperation(50));
        assertEquals(-46, DoubleWithBitOperation.doubleWithBitOperation(-23));
    }


}
