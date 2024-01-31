package ru.job4j.exercises.array;

import java.util.*;

public class Task73 {
    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner("");
        for (int i = 0; i < arr.length / 2; i++) {
            sj.add((arr[i] + " " + arr[arr.length - 1 - i] + "\n"));
        }
        System.out.print(sj);
        if (arr.length % 2 != 0) {
            System.out.println(arr[arr.length / 2]);
        }
    }
}
