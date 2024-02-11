package ru.job4j.collection;

import java.util.*;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftArr = left.split("/");
        String[] rightArr = right.split("/");
        int result = rightArr[0].compareTo(leftArr[0]);
        return result != 0 ? result : left.compareTo(right);
    }
}
