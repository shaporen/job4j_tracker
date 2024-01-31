package ru.job4j.exercises.loop;

import java.util.*;

public class Task45 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 500; i++) {
            int num1 = i % 100;
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
