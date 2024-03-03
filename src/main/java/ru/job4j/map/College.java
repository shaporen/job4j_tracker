package ru.job4j.map;

import java.util.*;

public class College {
    private final Map<ru.job4j.map.Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(student -> student.account().equals(account))
                .findFirst();
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> st = findByAccount(account);
        if (st.isPresent()) {
            return students.get(st.get())
                    .stream()
                    .filter(subject -> subject.name().equals(name))
                    .findFirst();
        }
        return Optional.empty();
    }
}
