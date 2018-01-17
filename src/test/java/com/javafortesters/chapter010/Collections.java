package com.javafortesters.chapter010;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void simpleCollectionExample(){
        String [] numbers0123Array = {"zero", "one", "two", "three"};
        List<String> numbers0123 = Arrays.asList(numbers0123Array);
        for (String number:numbers0123) {
            System.out.println(number);
        }
        Assert.assertEquals("zero", numbers0123.get(0));
        Assert.assertEquals("two", numbers0123.get(2));
        Assert.assertEquals(4, numbers0123.size());
    }

    
}
