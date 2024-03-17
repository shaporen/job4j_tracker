package ru.job4j.exercises.list;

import java.util.*;

public class AddIndexElement {
    /**
     * Метод добавляет элемент в список по индексу
     * Перед добавлением метод проверяет список на наличие дубликата
     * и соответствие индекса размерам списка
     * @param list исходный список
     * @param index индекс элемента
     * @param str добавляемый элемент
     * @return
     */
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if ((index > 0) && (index <= list.size())) {
            if (!list.contains(str)) {
                list.add(index, str);
            }
        }
        if (check.size() != list.size()) {
            return true;
        }
        return false;
    }
}
