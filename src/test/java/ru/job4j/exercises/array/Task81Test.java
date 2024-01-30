package ru.job4j.exercises.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class Task81Test {
    @Test
    public void when5And4And3And3AndMinus1Then1And0And4() {
        int[] arr = {5, 4, 3, 3, -1};
        int[] expected = {1, 0, 4};
        assertThat(Task81.array(arr)).containsExactly(expected);
    }
}