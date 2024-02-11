package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> departments) {
        Set<String> temp = new LinkedHashSet<>();
        for (String value : departments) {
            String[] firstDep = value.split("/");
            String start = firstDep[0];
            temp.add(start);
            for (String element : value.split("/")) {
                if (!start.equals(element)) {
                    String deps = String.join("/", start, element);
                    temp.add(deps);
                    start = deps;
                }
            }
        }
        return new ArrayList<>(temp);
    }

    public static void sortAsc(List<String> departments) {
        departments.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> departments) {
        departments.sort(new DepartmentsDescComparator());
    }
}
