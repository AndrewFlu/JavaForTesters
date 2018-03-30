package com.javafortesters.chapter010;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Collections {
    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero", "one", "two", "three"};
        for (String number : numbers0123) {
            System.out.println(number);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void simpleCollectionExample(){
        String [] numbers0123Array = {"zero", "one", "two", "three"};
        List<String> numbers0123 = Arrays.asList(numbers0123Array);
        for (String number:numbers0123) {
            System.out.println(number);
        }
        assertEquals("zero", numbers0123.get(0));
        assertEquals("two", numbers0123.get(2));
        assertEquals(4, numbers0123.size());
    }

    @Test
    public void simpleDynamicCollectionExample(){
        List <String> numbers0123 = new ArrayList<>();
        numbers0123.add("zero");
        numbers0123.add("one");
        numbers0123.add("two");
        numbers0123.add("three");
        for (String number : numbers0123){
            System.out.println(number);
        }
        assertEquals("one", numbers0123.get(1));
        assertEquals("three", numbers0123.get(3));
    }

    @Test
    public void homeTask_10chapter_Collection(){
        Collection<User> users = new ArrayList<User>();

        assertEquals(0, users.size());
        assertTrue(users.isEmpty());

        User user1 = new User("Bob", 70);
        User user2 = new User("Marley", 25);
        users.add(user1);
        users.add(user2);

        assertEquals(2, users.size());
        assertFalse(users.isEmpty());

        Collection<User> users2 = new ArrayList<User>();
        User jenifer = new User("Jenifer", 18);
        users2.add(jenifer);
        User andrew = new User("Andrew", 30);
        users2.add(andrew);
        users.addAll(users2);

        assertTrue(users.containsAll(users2));

        users2.remove(jenifer);
        users2.remove(andrew);
        assertTrue(users2.isEmpty());

        users.clear();
        assertTrue(users.isEmpty());
    }

    @Test
    public void homeTask_10Chapter_List(){
        List<User> users = new ArrayList<User>();
        User user1 = new User("Helen", 27);
        User user2 = new User ("Jenifer", 28);

        users.add(user1);
        assertEquals(1, users.size());

        users.add(0, user2);
        assertEquals("Jenifer", users.get(0).getName());
        assertEquals(1, users.indexOf(user1));
        assertEquals(2, users.size());

        users.remove(0);
        assertEquals(1, users.size());
        assertEquals(0, users.indexOf(user1));
    }

}
