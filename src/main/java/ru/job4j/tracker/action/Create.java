package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.output.*;
import ru.job4j.tracker.input.*;

public class Create implements UserAction {
    private final Output out;

    public Create(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Добавить новую заявку";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        out.println("Добавленная заявка: " + item);
        return true;
    }
}
