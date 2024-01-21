package ru.job4j.collection;

import java.util.*;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> tasks = new HashSet<>();
        for (Task task : list) {
            tasks.add(task.getNumber());
        }
        return tasks;
    }
}
