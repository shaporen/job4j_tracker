package ru.job4j.exercises.array;

import java.util.*;

public class Task78 {
    public static void array(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        String ln = System.lineSeparator();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    break;
                } else if (j == nums.length - 1) {
                    joiner.add(Integer.toString(nums[i]));
                }
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 3, 3};
        array(arr);
    }
}
