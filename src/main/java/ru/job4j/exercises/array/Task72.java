package ru.job4j.exercises.array;

import java.util.*;

public class Task72 {
    public static void array(int[] arr) {
        StringJoiner joiner1 = new StringJoiner(" ");
        StringJoiner joiner2 = new StringJoiner(" ");
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                joiner1.add(Integer.toString(arr[i]));
            } else {
                joiner2.add(Integer.toString(arr[i]));
            }
        }
        if (num1 == 0) {
            System.out.println(joiner2);
        } else if (num2 == 0) {
            System.out.println(joiner1);
        } else {
            System.out.println(joiner1);
            System.out.println(joiner2);
        }
    }
}
