package ru.job4j.exercises.loop;

import java.util.*;

public class Task28 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i < 30; i++) {
            int num1 = i / 10;
            int num2 = i % 10;
            if (num == (num1 + num2)) {
                joiner.add(Integer.toString(i));
            }
        }
        System.out.println(joiner);
    }
}
