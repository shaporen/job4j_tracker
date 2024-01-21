package ru.job4j.collection;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

class NotifyAccountTest {

    @Test
    public void whenAddTwoDifferentAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "eDer3432f")
        );
        HashSet<Account> expected = new HashSet<>();
        expected.add(new Account("123", "Petr Arsentev", "eDer3432f"));
        expected.add(new Account("142", "Petr Arsentev", "eDer3432f"));
        assertThat(NotifyAccount.sent(accounts)).containsAll(expected);
    }

    @Test
    public void whenAddTwoDuplicateAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("123", "Ivan Ivanov", "000000001")
        );
        HashSet<Account> expected = new HashSet<>();
        expected.add(new Account("123", "Petr Arsentev", "eDer3432f"));
        assertThat(NotifyAccount.sent(accounts)).containsAll(expected);
    }

    @Test
    public void whenAddSomeDuplicateAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "eDer3432f"),
                new Account("123", "Ivan Ivanov", "000000001"),
                new Account("142", "Petr Petrov", "000000002"),
                new Account("123", "Mark Markov", "000000003")
        );
        HashSet<Account> expected = new HashSet<>();
        expected.add(new Account("123", "Petr Arsentev", "eDer3432f"));
        expected.add(new Account("142", "Petr Arsentev", "eDer3432f"));
        assertThat(NotifyAccount.sent(accounts)).containsAll(expected);
    }
}