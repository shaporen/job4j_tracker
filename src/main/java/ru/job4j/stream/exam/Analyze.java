package ru.job4j.stream.exam;

import java.util.*;
import java.util.stream.*;

/**
 * Аттестация
 * Данный класс реализует подсчет статистики по аттестатам учеников
 */
public class Analyze {
    /**
     * Метод возвращает общий средний балл
     * @param stream поток учеников с их баллами по предметам
     * @return общий средний балл
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .mapToInt(Subject::score)
                .average()
                .orElse(0D);
    }

    /**
     * Метод возвращает средний балл по каждому ученику
     * @param stream поток учеников с их баллами по предметам
     * @return список всех учеников со средним баллом по предметам
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.name(), pupil.subjects().stream()
                        .mapToInt(Subject::score)
                        .average()
                        .orElse(0D))).toList();
    }

    /**
     * Метод возвращает средний балл по каждому предмету
     * @param stream поток учеников с их баллами по предметам
     * @return список предметов со средним баллом
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        Map<String, Double> map = stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name, LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::score)
                ));
        return map
                .entrySet()
                .stream()
                .map(subject -> new Tuple(subject.getKey(), subject.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Метод возвращает лучшего студента с его суммой баллов
     * @param stream поток учеников с их баллами по предметам
     * @return лучший студент с его суммой баллов
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.name(), pupil.subjects()
                        .stream()
                        .mapToInt(Subject::score)
                        .sum())).max(Comparator.comparing(Tuple::score))
                .orElse(null);
    }

    /**
     * Метод возвращает предмет с наибольшей суммой баллов среди студентов
     * @param stream поток учеников с их баллами по предметам
     * @return лучший предмет с суммой баллов по студентам
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        Map<String, Double> map = stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name, LinkedHashMap::new,
                        Collectors.summingDouble(Subject::score)
                ));
        return map
                .entrySet()
                .stream()
                .map(subject -> new Tuple(subject.getKey(), subject.getValue()))
                .max(Comparator.comparing(Tuple::score))
                .orElse(null);
    }
}
