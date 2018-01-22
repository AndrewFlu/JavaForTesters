package com.javafortesters.chapter010;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class Interfaces {
    @Test
    public void collectionInterfacesExample(){
        Collection <String> workdays = new ArrayList<>();
        Collection<String> daysOfWeek = new ArrayList<>();
        Collection<String> weekendDays = new ArrayList<>();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        daysOfWeek.addAll(workdays);

        weekendDays.add("Saturday");
        weekendDays.add("Funday");
        weekendDays.remove("Funday");
        weekendDays.add("Sunday");
        daysOfWeek.addAll(weekendDays);
        for(String day : daysOfWeek) {
            System.out.println(day);
        }

        Assert.assertFalse(weekendDays.contains("Funday"));
        Assert.assertTrue("Bug fix. WeekendDays should contains 'Sunday'", weekendDays.contains("Sunday"));
        Assert.assertEquals(workdays.size()+ weekendDays.size(), daysOfWeek.size());
        Assert.assertTrue("Wednesday should be in WorkDays collection", daysOfWeek.contains("Wednesday"));

        daysOfWeek.clear();
        Assert.assertEquals(0, daysOfWeek.size());
        Assert.assertTrue(daysOfWeek.isEmpty());
    }

    @Test
    public void removeallCollectionsExample(){
        Collection<String>workdays = new ArrayList<>();
        Collection<String>weekendDays = new ArrayList<>();
        Collection<String>daysOfWeek = new ArrayList<>();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        daysOfWeek.addAll(workdays);
        daysOfWeek.addAll(weekendDays);
        Assert.assertEquals(7, daysOfWeek.size());

        daysOfWeek.removeAll(weekendDays);
        Assert.assertTrue(daysOfWeek.containsAll(workdays));
        Assert.assertFalse(daysOfWeek.containsAll(weekendDays));
        Assert.assertEquals(5, daysOfWeek.size());
    }

    @Test
    public void retainAllCollectionExamples(){
        Collection<String>workdays = new ArrayList<>();
        Collection<String>weekendDays = new ArrayList<>();
        Collection<String>daysOfWeek = new ArrayList<>();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        daysOfWeek.addAll(workdays);
        daysOfWeek.addAll(weekendDays);
        Assert.assertTrue(daysOfWeek.containsAll(workdays));
        Assert.assertTrue(daysOfWeek.containsAll(workdays));
        Assert.assertEquals(7, daysOfWeek.size());

        daysOfWeek.retainAll(weekendDays);
        Assert.assertTrue(daysOfWeek.contains("Sunday"));
        Assert.assertFalse(daysOfWeek.contains("Monday"));
        Assert.assertEquals(2, daysOfWeek.size());
    }

    @Test
    public void toArrayMethodExamples(){
        Collection<String>workdays = new ArrayList<>();
        Collection<String>weekendDays = new ArrayList<>();
        Collection<String>daysOfWeek = new ArrayList<>();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        daysOfWeek.addAll(workdays);
        daysOfWeek.addAll(weekendDays);

        Object[] days = daysOfWeek.toArray();
        Assert.assertEquals(7, days.length);
        Assert.assertEquals("Monday".length(),((String)days[0]).length());
    }

    @Test
    public void toArrayWithParamMethodExamples(){
        Collection<String>workdays = new ArrayList<>();
        Collection<String>weekendDays = new ArrayList<>();
        Collection<String>daysOfWeek = new ArrayList<>();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        daysOfWeek.addAll(workdays);
        daysOfWeek.addAll(weekendDays);

        String [] days = new String[daysOfWeek.size()];
        daysOfWeek.toArray(days);
        Assert.assertEquals(7, days.length);
        Assert.assertEquals("Monday", days[0]);
    }
}
