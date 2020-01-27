package com.deepak.testing;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {

    @Test
    public void checkAdd(){
        Arithmetic arithmetic = new Arithmetic();

        float expected = 5;
        float actual = arithmetic.add(2,3);
        assertEquals(expected,actual);

    }

    @Test
    public void checkSubtract(){
        Arithmetic arithmetic = new Arithmetic();

        float expected = 10;
        float actual = arithmetic.subtract(15,5);
        assertEquals(expected,actual);
    }
}
