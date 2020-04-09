package com.sapient.week1;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;

    @Before
    public void setup()
    {
    	app = new App();
    }


    @Test
    public void checkEvenTest1() {
        boolean result = app.checkEven(87);
        assertTrue(result == false);
    }

    @Test
    public void checkEvenTest2() {
        boolean result = app.checkEven(1002);
        assertTrue(result);
    }

    @Test
    public void checkEvenTest3() {
        boolean result = app.checkEven(29);
        assertTrue(result == false);
    }

    @Test
    public void checkEvenTest4() {
        boolean result = app.checkEven(8);
        assertTrue(result);
    }
}