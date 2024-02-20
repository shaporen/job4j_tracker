package ru.job4j.stream;

import java.util.*;
import java.util.stream.*;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 4, -9, 5, -1, 3, -3);
        List<Integer> positive = numbers.stream().filter(number -> number > 0).
                collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
