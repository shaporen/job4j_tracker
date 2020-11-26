package ru.job4j.tracker;

public class FindIDAction implements UserAction {

    private final Output out;

    public FindIDAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item.getName());
        } else {
            out.println("Item is not found");
        }
        return true;
    }
}
