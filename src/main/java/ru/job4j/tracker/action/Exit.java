package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.output.*;
import ru.job4j.tracker.input.*;

public class Exit implements UserAction {
    private final Output out;

    public Exit(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Завершить программу";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Завершение программы ===");
        return false;
    }
}
