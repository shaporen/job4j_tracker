package ru.job4j.collection;

import java.util.*;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] lt : list) {
            for (int l : lt) {
                result.add(l);
            }
        }
        return result;
    }
}
