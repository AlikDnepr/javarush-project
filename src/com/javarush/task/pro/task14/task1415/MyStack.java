package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0,s);
    }

    public String pop() {
        String a = storage.get(0);
        storage.remove(0);
        return a;
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        boolean a = storage.isEmpty();
        return a;
    }

    public int search(String s) {
        if (storage.contains(s)){
            return storage.indexOf(s);
        }
        else{
            return -1;
        }
    }
}
