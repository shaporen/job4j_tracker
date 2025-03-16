package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.output.*;
import ru.job4j.tracker.input.*;
import java.util.*;

public class FindAll implements UserAction {
    private final Output out;

    public FindAll(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Показать все заявки";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Вывод всех заявок ===");
        List<Item> items = tracker.findAll();
        if (items.size() > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
