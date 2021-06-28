package com.softwaretesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Unit test cases for the triangle problem using Boundary value analysis
 */

public class AppTest {
    
    String type=null;

    @Test     //Test case ID 1
    public void testIsosceles1() {
        type = App.classify(1, 5, 5);
        assertEquals("Isosceles", type);
    }

    @Test       //Test case ID 2
    void testIsosceles2() {
        type = App.classify(2, 5, 5);
        assertEquals("Isosceles", type);
    }

    @Test       //Test case ID 3 
    void testIsosceles3() {
        type = App.classify(9, 5, 5);
        assertEquals("Isosceles", type);
    }

    @Test          //Test case ID 5
    void testIsosceles4() {
        type = App.classify(5, 1, 5);
        assertEquals("Isosceles", type);
    }

    @Test           //Test case ID 6
    void testIsosceles5() {
        type = App.classify(5, 2, 5);
        assertEquals("Isosceles", type);
    }

    @Test       //Test case ID 7
    void testIsosceles6() {
        type = App.classify(5, 9, 5);
        assertEquals("Isosceles", type);
    }

    @Test        //Test case ID 9
    void testIsosceles7() {
        type = App.classify(5, 5, 1);
        assertEquals("Isosceles", type);
    }

    @Test       //Test case ID 10
    void testIsosceles8() {
        type = App.classify(5, 5, 2);
        assertEquals("Isosceles", type);
    }

    @Test       //Test case ID 11
    void testIsosceles9() {
        type = App.classify(5, 5, 9);
        assertEquals("Isosceles", type);
    }

    @Test        //Test case ID 4
    void testNotTriangle1() {
        type = App.classify(10, 5, 5);
        assertEquals("Not a triangle", type);
    }

    @Test           //Test case ID 8
    void testNotTriangle2() {
        type = App.classify(5, 10, 5);
        assertEquals("Not a triangle", type);
    }
 
    @Test           //Test case ID 12
    void testNotTriangle3() {
        type = App.classify(5, 5, 10);
        assertEquals("Not a triangle", type);
    }

    @Test           //Test case ID 13
    void Equilateral() {
        type = App.classify(5, 5, 5);
        assertEquals("Equilateral", type);
    }
   
}
