package com.javafortesters.chapter008;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTests {

    private String url = "www.moneta.ru";

    private String addHttp(String url){
        return "https://" + url;
    }

    @Test
    public void moreTernary(){
        url = url.startsWith("https://") ? url : addHttp(url);

        assertTrue(url.startsWith("https://"));
        assertEquals("https://www.moneta.ru", url);
    }

    @Test
    public void catOrCatsTest(){
        assertEquals("If pet > 1 then pet = cats else - cat","cat", catOrCats(1));
    }

    public String catOrCats(int numberOfCats){
        String pet = numberOfCats == 1 ? "cat" : "cats";
        return pet;
    }

    @Test
    public void ifAddHttp(){
        String url = "demo.moneta.ru";
        if(!url.startsWith("http://")){
            url = addHttp(url);
        }
        assertTrue("Адрес должен начинаться с https://", url.startsWith("https://"));
        assertEquals("https://demo.moneta.ru",url);
    }

    @Test
    public void assertTrueIfTrue(){
        boolean truthy = false;
        if (truthy) assertTrue(truthy);
        if (!truthy) assertFalse(truthy);
    }

    @Test
    public void ifElseAddHttp(){
        String url = "demo.moneta.ru";
        if (url.startsWith("https://")){

        } else{
            url = addHttp(url);
        }
        assertTrue(url.startsWith("https://"));
        assertEquals("https://demo.moneta.ru", url);
    }

    @Test
    public void ifElseTrueFalse(){
        boolean truthy = false;
        if(truthy){

        } else {
            truthy = true;
        }
        assertTrue("Truethy should be true", truthy == true);
        assertEquals(true, truthy);
    }

    @Test
    public void ifElseTrueFalseWithoutCurlyBraces(){
        boolean truthy = true;
        if(truthy) {
            if(!truthy) {
                assertFalse(truthy);
            }
            assertTrue(truthy);
        } else assertFalse(truthy);
    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "moneta.ru";
        if (url.startsWith("https://")){
            // do nothing the url is fine
        } else {
            if(!url.startsWith("www.")){
                url = "www." + url;
            }
            url = addHttp(url);
        }
        assertTrue("shoud starts with \"https://\"", url.startsWith("https://"));
        assertEquals("https://www.moneta.ru", url);
    }

    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    private String likelyGenderIs(String title) {
        String likelyGender;

        switch (title.toLowerCase()){
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }

    @Test
    public void switchCountry(){
        assertEquals("United States of America", getFullCountry("USA"));
        assertEquals("Sweden", getFullCountry("SE"));
        assertEquals("Rest of the World", getFullCountry("GB"));
        assertEquals("France", getFullCountry("fr"));
    }


    private String getFullCountry(String abbCountry){
        String fullCountryName;

        switch (abbCountry.toUpperCase()){
            case "USA":
                fullCountryName = "United States of America";
                break;
            case "US":
                fullCountryName = "United States of America";
                break;
            case "SE":
                fullCountryName = "Sweden";
                break;
            case "UK":
                fullCountryName = "United Kindom";
                break;
            case "FR":
                fullCountryName = "France";
                break;
            default:
                fullCountryName = "Rest of the World";
                break;
        }
        return fullCountryName;
    }

    @Test
    public void switchDigits(){
        assertEquals("One", getStringNameOfDigit(1));
        assertEquals("Two", getStringNameOfDigit(2));
        assertEquals("Too long", getStringNameOfDigit(10));
        assertEquals("Too small",getStringNameOfDigit(0));
    }
    
//    private String getStringNameOfDigit(int digit){
//        String digitName = null;
//
//        switch (digit){
//            case 1:
//                digitName = "One";
//                break;
//            case 2:
//                digitName = "Two";
//                break;
//            default:
//                if (digit < 1){
//                    digitName = "Too small";
//                    break;
//                } else if (digit >= 3){
//                    digitName = "Too long";
//                    break;
//                }
//        }
//        return digitName;
//    }
        private String getStringNameOfDigit(int digit){
            String digitName = null;

            switch (digit){
                case 1:
                    return digitName = "One";
                case 2:
                    return digitName = "Two";
                default:
                    if (digit < 1){
                        return digitName = "Too small";
                    } else if (digit >= 3){
                        return digitName = "Too long";
                    }
            }
            return digitName;
        }

}
