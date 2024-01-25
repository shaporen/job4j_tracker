package ru.job4j.tracker;

import java.util.*;
import org.junit.jupiter.api.Test;
import static java.util.Collections.sort;
import static org.assertj.core.api.Assertions.*;

public class ItemTest {
    @Test
    public void whenItemSortAscByName() {
        List<Item> items = Arrays.asList(
                new Item("Petrov Alexey", 2),
                new Item("Shaporenko Sergey", 1),
                new Item("Rudenko Georgij", 3),
                new Item("Maul Alexander", 4),
                new Item("Maul Tatiana", 5)
        );
        List<Item> expected = Arrays.asList(
                new Item("Maul Alexander", 4),
                new Item("Maul Tatiana", 5),
                new Item("Petrov Alexey", 2),
                new Item("Rudenko Georgij", 3),
                new Item("Shaporenko Sergey", 1)
        );
        sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemSortDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Petrov Alexey", 2),
                new Item("Shaporenko Sergey", 1),
                new Item("Rudenko Georgij", 3),
                new Item("Maul Alexander", 4),
                new Item("Maul Tatiana", 5)
        );
        List<Item> expected = Arrays.asList(
                new Item("Shaporenko Sergey", 1),
                new Item("Rudenko Georgij", 3),
                new Item("Petrov Alexey", 2),
                new Item("Maul Tatiana", 5),
                new Item("Maul Alexander", 4)
        );
        sort(items, new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}