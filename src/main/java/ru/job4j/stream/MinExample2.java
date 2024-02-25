package ru.job4j.stream;

import java.util.*;
import java.util.stream.*;

public class MinExample2 {
    public static void main(String[] args) {
        OptionalInt min = IntStream
                .rangeClosed(1, 5)
                .min();
        System.out.println(min.getAsInt());
    }
}
