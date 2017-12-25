package com.javafortesters.chapter005;

import static domainobject.TestAppEnv.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        getUrl();
        assertEquals("Correct url is: https://192.123.0.3:67", "https://192.123.0.3:67", getUrl());
    }


    @Test
    public void canGetDominAndPortStatically(){
        assertEquals("Just the DOMAIN", "192.123.0.3", DOMAIN);
        assertEquals("Just the port", "67", PORT);
    }
}
