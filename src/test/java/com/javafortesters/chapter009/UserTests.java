package com.javafortesters.chapter009;

import domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class UserTests {

    @Test
    public void simpleArrayExample() {
        String[] numbers0123 = {"zero", "one", "two", "three"};

        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void arrayUsers() {
        String[] users = new String[3];
        users = new String[]{"admin", "user", "root"};
        assertEquals("user", users[1]);
        assertEquals("root", users[2]);
        for (String user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void arrayOfDays() {
        String days = "";
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        for (int i = 0; i < 5; i++) {
            days = days + "|" + i + "-" + workdays[i];
        }
        assertEquals("|0-Monday|1-Tuesday|2-Wednesday|3-Thursday|4-Friday", days);
    }

    @Test
    public void indexInForEachLoopExample() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int dayIndex = 0;
        for (String workday : workdays) {
            System.out.println("Found " + workday + " with index " + dayIndex);
            dayIndex++;
        }
    }

    @Test
    public void usersArrayTest() {

        User[] users = new User[100];

        for (int userIndex = 0; userIndex < users.length; userIndex++) {
            users[userIndex] = new User("user" + (userIndex + 1), "password" + (userIndex + 1));
            System.out.println("user = \"" + users[userIndex].getUserName() + "\" \"" + users[userIndex].getPassword() + "\"");
        }
        assertEquals("user1", users[0].getUserName());
        assertEquals("password81", users[80].getPassword());
        assertTrue("Размер массива должен быть равен 100", users.length == 100);
    }

    @Test
    public void arrayMethodsTest() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] weekdays = Arrays.copyOf(workdays, 7);
        assertEquals(null, weekdays[5]);
        assertEquals(null, weekdays[6]);

        String rangeOfdays[] = Arrays.copyOfRange(weekdays, 2, 5);
        for (String day : rangeOfdays) {
            System.out.println(day);
        }
        assertEquals(weekdays[2], rangeOfdays[0]);
        assertEquals(3, rangeOfdays.length);
    }

    @Test
    public void fillMethodExample() {
        int[] tenItems = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        // fill cells 5-9 with 5
        Arrays.fill(tenItems, 5, 9, 5);
        assertEquals(5, tenItems[8]);
        assertEquals(1, tenItems[9]);

        int[] outOfOrder = {5, 1, 7, 15, 25, -5};
        Arrays.sort(outOfOrder);
        assertEquals(-5, outOfOrder[0]);
        assertEquals(1, outOfOrder[1]);
        assertEquals(5, outOfOrder[2]);
        assertEquals(7, outOfOrder[3]);
        assertEquals(15, outOfOrder[4]);
        assertEquals(25, outOfOrder[5]);
    }

    @Test
    public void sortStrings() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);
        for (String sortDay : workdays) {
            System.out.println(sortDay);
        }
        assertEquals("Wednesday", workdays[4]);
    }

    @Test
    public void mixCaseLettersArraySort() {
        String[] mixLettersDays = {"mondAy", "Tuesday", "wedNEsday", "Thursday", "Friday"};
        String[] newSortedDays = new String[5];

        for (int i = 0; i < mixLettersDays.length; i++) {
            newSortedDays[i] = mixLettersDays[i].toLowerCase();
        }
        Arrays.sort(newSortedDays);
        assertEquals("friday", newSortedDays[0]);
    }

    @Test
    public void multyArrayExample() {
        int[][] multyArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9, 10}
        };
        assertEquals(4, multyArray[0].length);
        assertEquals(7, multyArray[1][2]);
        assertEquals(1, multyArray[0][0]);
        assertEquals(9, multyArray[1][4]);
        assertEquals(6, multyArray[1].length);
    }

    @Test
    public void multyDimentionalArray() {
        int[][][] multy3d = new int[2][4][7];
        assertEquals(2, multy3d.length);
        assertEquals(4, multy3d[0].length);
        assertEquals(4, multy3d[1].length);
        assertEquals(7, multy3d[0][1].length);
        assertEquals(7, multy3d[1][3].length);
        assertEquals(0, multy3d[1][1][6]);

    }

    @Test
    public void testragged2d() {
        int ragged2d[][] = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9, 10}
        };
        assertEquals(3, ragged2d[0].length);
        assertEquals(2, ragged2d[1].length);
        assertEquals(5, ragged2d[2].length);
        assertEquals(4, ragged2d[1][0]);
        assertEquals(10, ragged2d[2][4]);
    }

    @Test
    public void dynamicallyDefinedArray() {
        int[][] ragged2d = new int[10][];
        ragged2d[0] = new int[5];
        ragged2d[1] = new int[2];
        assertEquals(0, ragged2d[0][2]);
        assertEquals(10, ragged2d.length);
    }


    public void print2DIntArray(int[][] multi) {
        for (int[] outer : multi) {
            if (outer == null) {
                System.out.print("null");
            } else {
                for (int inner : outer) {
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }
}
