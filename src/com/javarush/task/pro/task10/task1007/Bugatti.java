package com.javarush.task.pro.task10.task1007;

/* 
С крышей или без? Вот в чем вопрос
*/

import java.time.Year;

public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public  int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getBody(){
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
