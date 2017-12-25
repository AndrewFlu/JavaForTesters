package com.javafortesters.chapter003;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo (){
        int answer = 2+2;
        assertEquals("Подсказка для утверждения", 4, answer);
    }

    @Test
    public void canSubtractTwoMinusTwo(){
        int result = 2-2;
        assertEquals("2-2=0", 0, result);
    }

    @Test
    public void canDivideFourByTwo(){
        int result = 4/2;
        assertEquals("4/2=2", 2, result);
    }

    @Test
    public void canMultiplyTwoByTwo(){
        int result = 2*2;
        assertEquals("2*2=4", 4, result);
    }

}
