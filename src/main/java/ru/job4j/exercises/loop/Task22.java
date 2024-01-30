package ru.job4j.exercises.loop;

import java.util.*;

public class Task22 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 300; i++) {
            if (i % 80 == 45) {
                joiner.add(Integer.toString(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
