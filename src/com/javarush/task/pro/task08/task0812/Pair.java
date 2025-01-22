package com.javarush.task.pro.task08.task0812;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        x ^= y;
        y ^= x;
        x ^= y;
    }
}
//4=00100
//5=00101

// 4 ^ 5 = 00100 ^ 00101 = 0001
// 4 ^ 4 = 00100 ^ 00100 = 0000 ^ 00100 = 0100
// 5 ^ 5 = 00101 ^ 00101 = 0000