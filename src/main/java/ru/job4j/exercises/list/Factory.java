package ru.job4j.exercises.list;

import java.util.*;

public class Factory {
    /**
     * Заполнение списка фабричным методом .of
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third",
                "fourth", "fifth");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
