package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BackArrayTest {

    @Test
    public void whenInputArrayHasEvenAmountElements() {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        String[] result = new BackArray().turn(names);
        String[] expected = {"Vasya", "Nik", "Ivan", "Petr"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenInputArrayHasNotEvenAmountElements() {
        String[] names = {"Petr", "Ivan", "Andrey", "Nik", "Vasya"};
        String[] result = new BackArray().turn(names);
        String[] expected = {"Vasya", "Nik", "Andrey", "Ivan", "Petr"};
        assertThat(result).isEqualTo(expected);
    }
}