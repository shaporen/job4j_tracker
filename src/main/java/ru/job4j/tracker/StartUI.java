package ru.job4j.tracker;

public class StartUI {

    public void showMenu(UserAction[] actions) {
        System.out.println("Menu:");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + ". " + actions[i].name());
        }
    }

    public void init (Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = Integer.valueOf(input.askStr("Select: "));
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input input = new ConsoleInput();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllAction(),
                new EditAction(),
                new DeleteAction(),
                new FindIDAction(),
                new FinaItemAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
