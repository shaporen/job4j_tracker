package ru.job4j.stream;

import java.util.*;

public class PeekExample {
    public static void main(String[] args) {
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Михаил"), new StringBuilder("Иван"), new StringBuilder("Елена"));
        List<StringBuilder> editedNames = names
                .stream()
                .peek((element) -> element.append(" (Ученик Job4j)"))
                .sorted()
                .toList();
        System.out.println(editedNames);
    }
}
