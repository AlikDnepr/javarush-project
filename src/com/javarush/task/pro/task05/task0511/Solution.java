package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        multiArray = new int[console.nextInt()][];

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[console.nextInt()];
            for (int j = 0; j < multiArray[i].length; j++){
                System.out.print( "[]" );
            }
            System.out.println();
        }
    }
}
