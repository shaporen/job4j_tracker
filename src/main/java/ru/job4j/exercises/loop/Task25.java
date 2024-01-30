package ru.job4j.exercises.loop;

import java.util.*;

public class Task25 {
    public static void loop(int num) {
        int first = 7;
        int count = num;
        StringJoiner joiner = new StringJoiner(" ");
        while (count > 0) {
            joiner.add(Integer.toString(first));
            first = first + 4;
            count--;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}
