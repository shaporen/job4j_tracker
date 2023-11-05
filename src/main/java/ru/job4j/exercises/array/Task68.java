package ru.job4j.exercises.array;

import java.util.StringJoiner;

public class Task68 {
    public static void array(int[] arr) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int ar : arr) {
            stringJoiner.add(Integer.toString(ar));
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 0};
        array(arr);
    }
}
