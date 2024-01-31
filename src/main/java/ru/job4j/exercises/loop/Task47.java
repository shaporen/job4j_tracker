package ru.job4j.exercises.loop;

import java.util.*;

public class Task47 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1345; i < 1445; i++) {
            int num1 = (i / 1000) + ((i % 1000) / 100);
            int num2 = ((i % 100) / 10) + (i % 10);
            if (num1 == num2) {
                joiner.add(Integer.toString(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
