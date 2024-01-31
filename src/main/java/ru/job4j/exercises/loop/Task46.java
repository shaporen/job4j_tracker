package ru.job4j.exercises.loop;

import java.util.*;

public class Task46 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1000; i < 1500; i++) {
            int num1 = (i % 1000) / 10;
            if (num == num1) {
                joiner.add(Integer.toString(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(23);
    }
}
