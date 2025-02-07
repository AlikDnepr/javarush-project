package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Сергей Пилипчук",4.9);
        grades.put("Дмитрий Сергевев",4.1);
        grades.put("Федор Евсеев",2.3);
        grades.put("Александр Федоров",3.9);
        grades.put("Илья Андреев",3.6);
    }
}
