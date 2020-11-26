package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted Item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        Output out = new StubOutput();
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced Item"));
        String replacedName = "New Item Name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        Output out = new StubOutput();
        UserAction[] actions = {
                new EditAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenAddItem() {
        Output out = new ConsoleOutput();
        Input input = new StubInput(
                new String[] {"Fix PC"}
                );
        Tracker tracker = new Tracker();
        UserAction add = new CreateAction(out);
        add.execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "replaced item"
        };
        Input input = new StubInput(answers);
        Output out = new ConsoleOutput();
        UserAction edit = new EditAction(out);
        edit.execute(input, tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(),is("replaced item"));
    }

    @Test
    public void whenDelItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("item");
        tracker.add(item);
        Input input = new StubInput(new String[] {
                String.valueOf(item.getId())
        });
        Output out = new ConsoleOutput();
        UserAction delete = new DeleteAction(out);
        delete.execute(input, tracker);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted, is(nullValue()));
    }

    @Test
    public void whenShowAll() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("item1"));
        tracker.add(new Item("item2"));
        String[] answers = {
                "0", "1"
        };
        Input input = new StubInput(answers);
        Output output = new StubOutput();
        UserAction[] actions = {
                new ShowAllAction(output),
                new ExitAction()
        };
        String s = System.lineSeparator();
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is("Menu:" + s +
                "0. Show all items" + s +
                "1. Exit Programm" + s +
                "item1" + s + "item2" + s +
                "Menu:" + s +
                "0. Show all items" + s +
                "1. Exit Programm" + s));
    }

    @Test
    public void whenFindItems() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Sergey"));
        tracker.add(new Item("Tatyana"));
        tracker.add(new Item("Sergey"));
        String[] answers = {"0", "Sergey", "1"};
        Input input = new StubInput(answers);
        Output output = new StubOutput();
        UserAction[] actions = {
                new FinaItemAction(output),
                new ExitAction()
        };
        String s = System.lineSeparator();
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is("Menu:" + s +
                "0. Find items by name" + s +
                "1. Exit Programm" + s +
                "Sergey" + s + "Sergey" + s +
                "Menu:" + s +
                "0. Find items by name" + s +
                "1. Exit Programm" + s));
    }

    @Test
    public void whenFindID() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Sergey"));
        tracker.add(new Item("Tatyana"));
        tracker.add(new Item("Sergey"));
        String[] answers = {"0", "2", "1"};
        Input input = new StubInput(answers);
        Output output = new StubOutput();
        UserAction[] actions = {
                new FindIDAction(output),
                new ExitAction()
        };
        String s = System.lineSeparator();
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is("Menu:" + s +
                "0. Find item by ID" + s +
                "1. Exit Programm" + s +
                "Tatyana" + s +
                "Menu:" + s +
                "0. Find item by ID" + s +
                "1. Exit Programm" + s));
    }
}