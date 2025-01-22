package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(cube(44));
    }

    public  static long cube(long a){
        a = a * a * a;
        return a;
    }
}
