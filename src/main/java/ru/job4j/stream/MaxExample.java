package ru.job4j.stream;

import ru.job4j.stream.mapto.*;
import java.util.*;

public class MaxExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        Optional<Person> youngestPerson = people.stream()
                .max(Comparator.comparing(Person::getAge));
        System.out.println(youngestPerson.get().getAge());
    }
}
