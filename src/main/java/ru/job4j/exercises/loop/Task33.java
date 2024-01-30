package ru.job4j.exercises.loop;

import java.util.*;

public class Task33 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 160; i++) {
            if (i % 11 == 0) {
                joiner.add(Integer.toString(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
