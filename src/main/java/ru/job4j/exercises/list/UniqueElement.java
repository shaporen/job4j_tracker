package ru.job4j.exercises.list;

import java.util.*;

public class UniqueElement {
    /**
     * Метод проверяет элемент списка на уникальность
     * @param list список элементов
     * @param str проверяемый элемент
     * @return true в случае уникальности элемента и наличия в списке в принципе
     */
    public static boolean checkList(List<String> list, String str) {
        if (list.contains(str)) {
            int a = list.indexOf(str);
            int b = list.lastIndexOf(str);
            if (a == b) {
                return true;
            }
        }
        return false;
    }
}
