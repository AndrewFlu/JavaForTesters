package com.javafortesters.chapter010;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class Sets {

    @Test
    public void setDoesNotAllowDuplicates(){
        Set<String> workDays = new HashSet<String>();
        workDays.add("Monday");
        workDays.add("Monday");
        workDays.add("Monday");
        workDays.add("Tuesday");

        assertEquals(2, workDays.size());
    }

    @Test
    public void homeTask_10chapter_Sets(){
        Set<User> users = new HashSet<User>();
        User user1 = new User("Madonna", 61);
        users.add(user1);
        users.add(user1);
        assertEquals(1, users.size());
    }


}
