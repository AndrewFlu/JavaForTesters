package com.javafortesters.chapter010;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Loops {
    @Test
    public void foreachLoopExample(){
        // создаем коллекцию дней через объявление списка
        String [] someDays = {"Wednesday", "Tuesday", "Friday", "Monday", "Saturday", "Thursday", "Sunday"};
        List<String> days = Arrays.asList(someDays);

        // цикл for each
        int dayIndex = 0;
        for (String day : days){
            if (day.equals("Monday")){
                break;
            }
            dayIndex ++;
        }
        System.out.println("Monday has " + dayIndex + " index in array");
        Assert.assertEquals("Monday should be in 3 index position in the array \"days\"", 3, dayIndex);
    }

    @Test
    public void forLoopExample(){
        // создаем коллекцию дней через объявление списка
        String [] someDays = {"Wednesday", "Tuesday", "Friday", "Monday", "Saturday", "Thursday", "Sunday"};
        List<String> days = Arrays.asList(someDays);

        // цикл for
        int dayIndex;
        for (dayIndex = 0; dayIndex < days.size(); dayIndex++){
            if (days.get(dayIndex).equals("Sunday")){
                break;
            }
        }
        System.out.println("Sunday has " + dayIndex + " index in array");
        Assert.assertEquals("Sunday should be in 6 index position in the array \"days\"", 6, dayIndex);
    }

    @Test
    public void whileLoopExample(){
        // создаем коллекцию дней через объявление списка
        String [] someDays = {"Wednesday", "Tuesday", "Friday", "Monday", "Saturday", "Thursday", "Sunday"};
        List<String> days = Arrays.asList(someDays);

        // цикл while
        int dayIndex = 0;
        while(! days.get(dayIndex).equals("Friday")){
            dayIndex++;
        }
        System.out.println("Friday has " + dayIndex + " index in array");
        Assert.assertEquals("Friday should be in 2 index position in the array \"days\"", 2, dayIndex);
        Assert.assertEquals("Friday", days.get(dayIndex));
    }

    @Test
    public void dowhileLoopExample(){
        // создаем коллекцию дней через объявление списка
        String [] someDays = {"Wednesday", "Tuesday", "Friday", "Monday", "Saturday", "Thursday", "Sunday"};
        List<String> days = Arrays.asList(someDays);

        // цикл do while
        int dayIndex = -1;
        do {
            dayIndex++;
        } while (! days.get(dayIndex).equals("Wednesday"));
        System.out.println("Wednesday has " + dayIndex + " index in array");
        Assert.assertEquals("Wednesday should be in 0 index position in the array \"days\"", 0, dayIndex);
    }
}
