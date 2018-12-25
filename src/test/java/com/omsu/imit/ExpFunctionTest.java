package com.omsu.imit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpFunctionTest {
    @Test
    public void decideFunctionTest(){
        ExpFunction fun = new ExpFunction(1,2,1,5);
        assertEquals( 9.38905609893, fun.decideFunction(2),0.000001);
        assertEquals( 22.0855369231, fun.decideFunction(3),0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void decideFunctionTest1(){
        ExpFunction fun = new ExpFunction(1,2,3,4);
        fun.decideFunction(8);
    }
}