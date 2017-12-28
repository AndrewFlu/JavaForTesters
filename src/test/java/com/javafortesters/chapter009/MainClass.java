package com.javafortesters.chapter009;

import static junit.framework.TestCase.assertEquals;

public class MainClass {
    public static void main(String[] args) {
        // создаем экземпляр класса
        UserTests array = new UserTests();

        // объявляем многомерный массив
        int [][] triangleArray = new int[15][];

        // определяем вторую размерность массива
        for (int i = 0; i<triangleArray.length; i++){
            triangleArray[i] = new int[i+1];
        }

        triangleArray[0][0] = 0;
        triangleArray[1][0] = 0;
        triangleArray[1][1] = 1;
        triangleArray[2][0] = 1;
        int i = 0;
        // заполняем многомерный массив


//        for( int [] outer : triangleArray){
//            if (outer == null){
//                System.out.println("Null");
//                break;
//            } else{
//                for (int inner : outer){
//
//                    i++;
//                }
//            }
//        }


        array.print2DIntArray(triangleArray);
    }

}
