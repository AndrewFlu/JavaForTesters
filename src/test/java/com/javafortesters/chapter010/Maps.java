package com.javafortesters.chapter010;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Maps {

    @Test
    public void mapExample(){
        Map<String, User> map1 = new HashMap<String, User>();

        User user1, user2, user3;
        user1 = new User("Helen", 20);
        user2 = new User("Ivy", 32);
        user3 = new User("Jesika", 29);

        map1.put("1", user1);
        map1.put("2", user2);
        map1.put("3", user3);

        assertEquals(3, map1.size());

        map1.put("3", user1);
        assertEquals(user1, map1.get("3"));
        assertEquals(3, map1.size());

        assertEquals(null, map1.get("4"));

        map1.remove("2");
        assertEquals(2, map1.size());
        assertEquals(user1, map1.get("1"));

        map1.clear();
        assertEquals(0, map1.size());
        assertTrue(map1.isEmpty());
    }

    @Test
    public void mapKeyValueContainsTest(){
        Map<Integer, String> numbers = new HashMap<Integer, String>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");

        assertTrue(numbers.containsValue("one"));
        assertFalse(numbers.containsValue("four"));
        assertTrue(numbers.containsKey(1));
        assertFalse(numbers.containsKey(4));

        Map<Integer, String> numbersToAdd = new HashMap<>();
        numbersToAdd.put(2, "this is new Two");
        numbersToAdd.put(4, "four");
        numbersToAdd.put(5, "five");

        numbers.putAll(numbersToAdd);

        assertEquals(5, numbers.size());
        assertTrue(numbers.containsValue("this is new Two"));
        assertFalse(numbers.containsValue("two"));
    }

    @Test
    public void testMapValues(){
        Map<Integer, String> numbers = new HashMap<Integer, String>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");

        Collection<Integer> digitsOfNumbers = numbers.keySet();
        for (Integer digit : digitsOfNumbers){
            System.out.println(digit);
        }
        System.out.println("\n");

        Collection<String> stringOfNubers = numbers.values();
        for (String number : stringOfNubers){
            System.out.println(number);
        }
    }

    @Test
    public void entrySet(){
        Map<Integer, String> motorEngineValues = new HashMap<>();
        motorEngineValues.put(1100, "BMW R1100R");
        motorEngineValues.put(1200, "BMW K1100GS");
        motorEngineValues.put(1900, "Yamaha Raider");

        Set<Map.Entry<Integer, String>> bikes = motorEngineValues.entrySet();
        for (Map.Entry<Integer, String> bike : bikes){
            System.out.println(bike);
            System.out.println(bike.getValue());
            System.out.println(bike.getKey() + "\n");
        }
    }

    @Test
    public void homeTask_10Chapter(){
        Map<Integer, User> users = new HashMap<>();
        User Masha = new User("Masha", 28);
        User Ulchya = new User("Ulcha", 27);
        User Helen = new User ("Helen", 25);

        users.put(1, Masha);
        users.put(1, Ulchya);
        users.put(2, Helen);

        assertEquals(2, users.size());
        assertTrue(users.containsValue(Ulchya));
        assertTrue(users.containsValue(Helen));
        assertFalse(users.containsValue(Masha));
    }


}
