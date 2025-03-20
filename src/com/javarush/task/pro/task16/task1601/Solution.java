package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(93,2,5);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
        System.out.println(birthDate.getDay());
    }

    static String getDayOfWeek(Date date) {
        if (date.getDay() == 1){
            return "понедельник";
        }
        else if (date.getDay() == 2){
            return "вторник";
        }
        else if(date.getDay() == 3){
            return "среда";
        }
        else if (date.getDay() == 4){
            return  "четверг";
        }
        else if (date.getDay() == 5){
            return "пятница";
        }
        else if (date.getDay() == 6){
            return "суббота";
        }
        else if (date.getDay() == 0){
            return "воскресенье";
        }
        else
            return null;
    }
}
