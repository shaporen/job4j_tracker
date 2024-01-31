package ru.job4j.exercises.loop;

import java.util.*;

public class Task44 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 1000; i++) {
            int num1 = i / 100;
            int num2 = (i % 100) / 10;
            int num3 = i % 10;
            int num4 = num3 * 100 + num2 * 10 + num1;
            double num5 = Math.sqrt(i * num4);
            boolean nulls = ((num1 == 0) && (num2 == 0)) || ((num2 == 0) && (num3 == 0));
            if ((num5 % 1 == 0) && (i != num4) && (!nulls)) {
                joiner.add(Integer.toString(i));
            }
        }
        System.out.println(joiner);
    }
}
