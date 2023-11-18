package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {

    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Fact().calc(-1));
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0");
    }

    @Test
    public void when5Than120() {
        int in = 5;
        int out = new Fact().calc(in);
        int expected = 120;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when8Than40320() {
        int in = 8;
        int out = new Fact().calc(in);
        int expected = 40320;
        assertThat(out).isEqualTo(expected);
    }
}