package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant time = Instant.ofEpochMilli(Long.MAX_VALUE);

        return time;
    }

    static Instant getMaxFromSeconds() {
        Instant time = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());

        return time;
    }

    static Instant getMaxFromSecondsAndNanos() {
        Instant time = Instant.ofEpochSecond(Instant.MAX.getEpochSecond(),999999999);

        return time;
    }
}
