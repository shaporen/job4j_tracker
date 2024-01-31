package ru.job4j.exercises.array;

import java.util.*;

public class Task71 {
    public static void array(int[] arr) {
        StringJoiner joiner1 = new StringJoiner(" ");
        StringJoiner joiner2 = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                joiner1.add(Integer.toString(arr[i]));
            } else {
                joiner2.add(Integer.toString(arr[i]));
            }
        }
        System.out.println(joiner1);
        System.out.println(joiner2);
    }
}
