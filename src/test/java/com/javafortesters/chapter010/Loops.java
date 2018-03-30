package com.javafortesters.chapter010;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
        assertEquals("Monday should be in 3 index position in the array \"days\"", 3, dayIndex);
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
        assertEquals("Sunday should be in 6 index position in the array \"days\"", 6, dayIndex);
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
        assertEquals("Friday should be in 2 index position in the array \"days\"", 2, dayIndex);
        assertEquals("Friday", days.get(dayIndex));
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
        assertEquals("Wednesday should be in 0 index position in the array \"days\"", 0, dayIndex);
    }

    @Test
    public void whileLoopExample1(){
        String[] bikes = {"Bimmer", "Bandit", "Raider", "Warrior"};
        List<String> listOfBikes = Arrays.asList(bikes);
        int doCount = 0;
        while(!listOfBikes.get(doCount).equals("Raider")){
            doCount ++;
        }
        assertEquals("Rider should be at the 2 index position in array of Bikes", 2, doCount);
    }

    @Test
    public void forLoopExample1(){
        String[] bikes = {"Bimmer", "Bandit", "Raider", "Warrior"};
        List<String> listOfBikes = Arrays.asList(bikes);
        int doCount  = 0;
        for (String bike : listOfBikes){
            if (bike.equals("Warrior")){
                break;
            }
            doCount ++;
        }
        assertEquals("Warrior should be at the 3 index position of the Bikes array", 3, doCount);
    }

    @Test
    public void doWhileLoopExample(){
        String[] bikes = {"Raider", "Warrior", "Bimmer", "Bandit"};
        List <String> listOfBikes = Arrays.asList(bikes);
        int doCount = -1;
        do {
            doCount ++;
        } while (!listOfBikes.get(doCount).equals("Bimmer"));
        System.out.println(doCount);
        assertEquals(2, doCount);
    }
}
