package ru.job4j.stream;

import java.util.*;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        long sum = numbers.stream()
                .filter(element -> element % 2 == 0)
                .count();
        System.out.println(sum);
    }
}
