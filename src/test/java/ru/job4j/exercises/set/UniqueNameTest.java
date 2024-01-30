package ru.job4j.exercises.set;

import org.junit.jupiter.api.*;
import java.util.*;
import static org.assertj.core.api.Assertions.*;

public class UniqueNameTest {
    @Test
    public void collectUniqueName() {
        List<UniqueName.User> users = List.of(
                new UniqueName.User(1, "name1"),
                new UniqueName.User(2, "name2"),
                new UniqueName.User(3, "name1"),
                new UniqueName.User(4, "name3"),
                new UniqueName.User(5, "name5"),
                new UniqueName.User(6, "name3")
        );
        int rsl = UniqueName.collectUniqueName(users);
        int expected = 4;
        assertThat(expected).isEqualTo(rsl);
    }
}