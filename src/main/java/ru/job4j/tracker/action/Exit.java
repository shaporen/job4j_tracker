package ru.job4j.tracker.action;

import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;

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
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Завершение программы ===");
        return false;
    }
}
