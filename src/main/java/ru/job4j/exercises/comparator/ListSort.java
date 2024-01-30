package ru.job4j.exercises.comparator;

import java.util.*;

public class ListSort {
    public static List<String> sorting(List<String> data) {
        data.sort(Comparator.nullsFirst(Collections.reverseOrder()));
        return data;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList(null, "a", "b", "c");
        List<String> result = ListSort.sorting(input);
        System.out.println(result);
    }
}
