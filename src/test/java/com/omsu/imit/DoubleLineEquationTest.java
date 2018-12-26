package com.omsu.imit;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleLineEquationTest {
    @Test
    public void decideFunctionTest(){
        DoubleLineEquation fun = new DoubleLineEquation(1,2,3,4,1,5);
        assertEquals( 0.38461538, fun.decideFunction(3),0.000001);
        assertEquals( 0.4, fun.decideFunction(2),0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void decideFunctionTest1(){
        DoubleLineEquation fun = new DoubleLineEquation(1,2,3,4,1,5);
        fun.decideFunction(8);


    }
}