package ru.job4j.stream.builderinstream;

import java.util.*;
import java.util.stream.*;

import static java.util.Comparator.comparingInt;

public class PersonStreamBuilder {
    private Stream<Person> personStream;

    public PersonStreamBuilder(List<Person> people) {
        this.personStream = people.stream();
    }

    public PersonStreamBuilder filterByAge(int age) {
        this.personStream = personStream.filter(person -> person.age() == age);
        return this;
    }

    public PersonStreamBuilder sortByAge() {
        this.personStream = personStream.sorted(comparingInt(Person::age));
        return this;
    }

    public Stream<Person> build() {
        return personStream;
    }
}
