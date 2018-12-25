package com.omsu.imit;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import junit.framework.AssertionFailedError;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;


public class IntegrateFuctionTest {
    @Test
    public void decideFanctionalTest(){
        IntegrateFuction processor = new IntegrateFuction(1,5);
        LineEquation fun = new LineEquation(1,2,1,5);
        assertEquals("Тестирование 4.2 не пройдено![1/2]", 20, processor.decideFanctional(fun),0.001);
    }
    @Test
    public void decideFanctionalTest1(){
        IntegrateFuction processor = new IntegrateFuction(0,Math.PI);
        SinEquation fun = new SinEquation(1,1,-100,100);
        assertEquals("Тестирование 4.2 не пройдено!---", 2.0, processor.decideFanctional(fun),1e-5);
    }
    @Test
    public void decideFanctionalTest2() {
        IntegrateFuction processor = new IntegrateFuction(1,5);
        LineEquation fun = new LineEquation(1, 2, 1, 15);
        assertEquals("Тестирование 4.2 не пройдено![2/2]", 20, processor.decideFanctional(fun), 0.001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void decideFanctionalTest3() throws IllegalArgumentException {

            IntegrateFuction processor = new IntegrateFuction(1, 5);
            LineEquation fun = new LineEquation(1, 2, 10, 15);
        fail();
            //assertEquals("Тестирование 4.2 не пройдено![2/2]", 20, processor.decideFanctional(fun), 0.001);

    }
}