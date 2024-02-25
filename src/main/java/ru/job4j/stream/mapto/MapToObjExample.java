package ru.job4j.stream.mapto;

import java.util.*;
import java.util.stream.*;

public class MapToObjExample {
    public static void main(String[] args) {
        List<String> list = IntStream.rangeClosed(1, 5)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
