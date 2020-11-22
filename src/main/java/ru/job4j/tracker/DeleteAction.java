package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id:"));
        if (tracker.delete(id)) {
            System.out.println("Item №" + id + " has been sucessfully deleted");
        } else {
            System.out.println("Item is not found");
        }
        return true;
    }
}
