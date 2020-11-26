package ru.job4j.tracker;

public class FinaItemAction implements UserAction {

    private final Output out;

    public FinaItemAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                out.println(items[i].getName());
            }
        } else {
            out.println("Item is not found");
        }
        return true;
    }
}
