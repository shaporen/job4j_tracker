package ru.job4j.collection;

import java.util.*;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("shaporen@yandex.ru", "Sergey Shaporenko");
        map.put("g.rudenko@yandex.ru", "Georgi Rudenko");
        map.put("g.rudenko@yandex.ru", "Galina Rudenko");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(value);
        }
    }
}
