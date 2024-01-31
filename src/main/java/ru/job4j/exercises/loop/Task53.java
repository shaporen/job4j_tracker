package ru.job4j.exercises.loop;

import java.util.*;

public class Task53 {
    public static void loop(int n) {
        StringJoiner joiner = new StringJoiner(" ");
        int base = 2;
        for (int i = 0; i < n; i++) {
            joiner.add(Integer.toString(base));
            base *= 2;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(4);
    }
}
