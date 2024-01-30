package ru.job4j.exercises.loop;

import java.util.*;

public class Task34 {
    public static void loop(int num) {
        int count = 5;
        StringJoiner joiner = new StringJoiner(" ");
        while (count > 0) {
            num++;
            if (num % 2 == 1) {
                joiner.add(Integer.toString(num));
                count--;
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(6);
    }
}
