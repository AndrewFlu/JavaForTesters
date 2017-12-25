package com.javafortesters.chapter004;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class IntegerExamplesTest {
    String s = "4";

    @Test
    public void integerExplorations(){
        this.s = s;
        Integer four = new Integer(s);
        assertEquals("intValue(4) should return int 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue('5') should return int: 5", 5, five.intValue());

        Integer six = 6;
        assertEquals("Autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void integerHexExploration(){
        assertEquals("10 becomes a", "a", Integer.toHexString(10));
        assertEquals("11 becomes b", "b", Integer.toHexString(11));
        assertEquals("3 becomes 3", "3", Integer.toHexString(3));
        assertEquals("21 becomes 15", "15", Integer.toHexString(21));
    }

    @Test
    public void integerConstantsTest(){
        assertEquals(-2147483648, Integer.MIN_VALUE);
        assertEquals(2147483647, Integer.MAX_VALUE);
    }

    @Test
    public void objectAssertionsTest(){
        Integer value1 = new Integer(5);
        Integer value2 = new Integer(5);
        assertTrue(value1.equals(value2));
    }
}
