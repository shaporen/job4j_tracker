package ru.job4j.collection;

import java.util.*;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("Petr");
        users.add("Ivan");
        users.add("Stepan");
        for (String u : users) {
            System.out.println(u);
        }
    }
}
