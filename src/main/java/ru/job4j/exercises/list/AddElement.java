package ru.job4j.exercises.list;

import java.util.*;

public class AddElement {
    /**
     * Метод проверяет успешно ли добавлен элемент в список
     * @param list исходный список
     * @param str добавляемый элемент
     * @return результат добавления (true/false)
     */
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        int a = check.size();
        check.add(str);
        if (check.size() != list.size()) {
            return true;
        }
        return false;
    }
}
