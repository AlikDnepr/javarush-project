package com.javarush.task.pro.task18.task1811;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/* 
Получение потока Stream
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Зима", "Весна", "Лето", "Осень");

        Stream<String> stringStream = getStreamFromArrayList(strings);
        stringStream.forEach(System.out::println);

        var integers = new Integer[]{12, 34, 56, 78, 90};

        Stream<Integer> integerStream = getStreamFromArray(integers);
        integerStream.forEach(System.out::println);
    }

    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
        Stream<String> list1 = list.stream();
        return list1;
    }

    public static Stream<Integer> getStreamFromArray(Integer[] array) {
        Stream<Integer> array1 = Arrays.stream(array);
        return array1;
    }
}
