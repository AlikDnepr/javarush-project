package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int indexStr = path.indexOf("jdk");
        int indexEnd = path.indexOf("/",indexStr + 2 );
        String first = path.substring(0, indexStr);
        String last = path.substring(indexEnd);
        String result = first + jdk + last;
        return result;
    }
}
