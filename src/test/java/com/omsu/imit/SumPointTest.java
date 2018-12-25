package com.omsu.imit;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumPointTest {
    @Test
    public void decideFanctionalTest(){
        SumPoint processor = new SumPoint(1,2);
        LineEquation fun = new LineEquation(1,2,1,5);
        assertEquals("Тестирование 4.1 не пройдено![1/2]", 10.5, processor.decideFanctional(fun),0.001);

    }
    @Test(expected = IllegalArgumentException.class)
    public void decideFanctionalTest2() {
        SumPoint processor = new SumPoint(1,2);
        LineEquation fun = new LineEquation(1, 2, 10, 10);
        assertEquals("Тестирование 4.1 не пройдено![2/2]", 10.5, processor.decideFanctional(fun), 0.001);
    }
}