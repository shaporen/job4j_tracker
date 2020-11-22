package ru.job4j.tracker;

public class FindIDAction implements UserAction {
    @Override
    public String name() {
        return "Find item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getName());
        } else {
            System.out.println("Item is not found");
        }
        return true;
    }
}
