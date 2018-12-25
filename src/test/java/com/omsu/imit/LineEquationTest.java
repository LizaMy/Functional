package com.omsu.imit;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineEquationTest {
    @Test
    public void decideFunctionTest(){
        LineEquation fun = new LineEquation(1,2,1,5);
        assertEquals( 4, fun.decideFunction(2),0.000001);
        assertEquals( 5, fun.decideFunction(3),0.000001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void decideFunctionTest1(){
        LineEquation fun = new LineEquation(1,2,3,4);
        fun.decideFunction(8);
    }
}