package ru.job4j.tracker;

public class EditAction implements UserAction {

    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id:"));
        String newName = input.askStr("=== Enter New name ===");
        Item item = new Item(newName);
        if (tracker.replace(id, item)) {
            out.println("Item №" + id + " has been sucessfully edited");
        } else {
            out.println("Item is not found");
        }
        return true;
    }
}
