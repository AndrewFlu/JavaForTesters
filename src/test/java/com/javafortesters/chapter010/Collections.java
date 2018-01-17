package com.javafortesters.chapter010;

import org.junit.Assert;
import org.junit.Test;

public class Collections {
    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero", "one", "two", "three"};
        for (String number : numbers0123) {
            System.out.println(number);
        }
        Assert.assertEquals("zero", numbers0123[0]);
        Assert.assertEquals("three", numbers0123[3]);
    }
}
