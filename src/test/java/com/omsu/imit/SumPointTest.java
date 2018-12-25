package com.omsu.imit;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumPointTest {
    @Test
    public void decideFanctionalTest(){
        SumPoint processor = new SumPoint(1,5);
        LineEquation fun = new LineEquation(1,2,1,5);
        assertEquals( 15.00, processor.decideFanctional(fun),0.001);
    }
    @Test
    public void decideFanctionalTest1(){
        SumPoint processor = new SumPoint(1,5);
        SinEquation fun = new SinEquation (1,2,-100,100);
        assertEquals( 0.0, processor.decideFanctional(fun),0.1);
    }
}