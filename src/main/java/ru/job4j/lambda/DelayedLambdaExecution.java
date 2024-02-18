package ru.job4j.lambda;

import java.util.*;

public class DelayedLambdaExecution {
    public static void main(String[] args) {
        String[] names = {
                "Ivan",
                "Petr"
        };
        Comparator<String> lengthComparator = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthComparator);
    }
}
