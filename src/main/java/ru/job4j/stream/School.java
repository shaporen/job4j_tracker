package ru.job4j.stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * Фильтрация учеников
 */
public class School {
    /**
     * Метод фильтрует учеников по среднему баллу
     * @param students список учеников
     * @param predicate фильтр по среднему баллу
     * @return возвращает список в соответствии с установленным фильтром
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
