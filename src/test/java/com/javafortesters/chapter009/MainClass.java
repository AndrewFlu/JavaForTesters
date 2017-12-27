package com.javafortesters.chapter009;

public class MainClass {
    public static void main(String[] args) {
        UserTests array = new UserTests();
        int [][] ragged2d = {
                {},
                {},
                {1,2    }
        };
        array.print2DIntArray(ragged2d);
    }
}
