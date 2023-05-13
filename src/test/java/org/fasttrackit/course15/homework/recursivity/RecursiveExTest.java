package org.fasttrackit.course15.homework.recursivity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveExTest {
    @Test
    public void testSumOfIntegerNumbers() {
        assertEquals(0,RecursiveEx.sumOfIntegerNumbers(0));
        assertEquals(1,RecursiveEx.sumOfIntegerNumbers(1));
        assertEquals(210,RecursiveEx.sumOfIntegerNumbers(20));
    }

    @Test
    public void testSumOfEvenNumbers(){
        assertEquals(0,RecursiveEx.sumOfEvenNumbers(0));
        assertEquals(140737488355234l,RecursiveEx.sumOfEvenNumbers(45));
        assertEquals(16777168,RecursiveEx.sumOfEvenNumbers(22));

    }
}
