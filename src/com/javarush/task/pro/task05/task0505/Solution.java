package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/*
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int variable = console.nextInt();
        if (variable > 0) {
            int[] number = new int[variable];

            if (variable % 2 != 0){
                for (int i = 0; i < variable; i++) {
                    number[i] = console.nextInt();
                    System.out.println(number[i]);
                }
            }
            if (variable % 2 == 0){
                for (int i = 0; i < variable; i++) {
                    number[i] = console.nextInt();
                }
                for (int i = variable - 1; i >= 0; i--) {
                    System.out.println(number[i]);
                }
            }
        }

    }
}

