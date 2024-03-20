package ru.job4j.stream.builderinstream;

import java.util.*;
import java.util.stream.*;

public class StreamBuilderPatternExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        Stream<Person> filteredAndSortedPeople = new PersonStreamBuilder(people)
                .filterByAge(35)
                .sortByAge()
                .build();

        List<Person> result = filteredAndSortedPeople.toList();

        result.forEach(System.out::println);
    }
}
