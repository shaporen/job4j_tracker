package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.*;

import static org.assertj.core.api.Assertions.*;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
            new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenMultiValidInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"2", "1", "4", "6"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(2);
        int selected1 = input.askInt("Выбрать: ");
        assertThat(selected1).isEqualTo(1);
        int selected2 = input.askInt("Выбрать: ");
        assertThat(selected2).isEqualTo(4);
        int selected3 = input.askInt("Выбрать: ");
        assertThat(selected3).isEqualTo(6);
    }

    @Test
    void whenOneValidInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(3);
    }

    @Test
    void whenOneValidNegativeInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"-3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(-3);
    }
}