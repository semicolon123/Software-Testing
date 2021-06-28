package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;
 
    @Before
    public void setUp() throws Exception {
    app = new App();
    }
     
    @After
    public void tearDown() throws Exception {
    }

    @Test
    //unit test case that will check whether the method returns
    //the anticipated output or not
    public void testMultiplication() {  
        int result = app.multiply(10, 5);
        assertEquals(result,50);
        }

    @Test               //write this annotation for each test case
    public void testDivision() {  
        int result1 = app.divide(10, 5);
        assertEquals(result1,2);
        }

    @Test
    public void testAddition() {  
        int result2 = app.add(10, 5);
        assertEquals(result2,15);
        }

    @Test
    public void testSubtraction() {  
        int result3 = app.subtract(10, 5);
        assertEquals(result3,5);
        }
}
