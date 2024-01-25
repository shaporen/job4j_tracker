package ru.job4j.collection;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static java.util.Collections.sort;

public class JobTest {

    @Test
    public void whenCompareAcsByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Shaporenko Sergey", 1),
                new Job("Rudenko Georgij", 2),
                new Job("Arsentev Petr", 1),
                new Job("Maul Alexandr", 2),
                new Job("Bardurkin Victor", 3)
        );
        List<Job> expected = Arrays.asList(
                new Job("Arsentev Petr", 1),
                new Job("Bardurkin Victor", 3),
                new Job("Maul Alexandr", 2),
                new Job("Rudenko Georgij", 2),
                new Job("Shaporenko Sergey", 1)
        );
        sort(jobs, new JobAscByName());
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenCompareDecsByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Shaporenko Sergey", 1),
                new Job("Rudenko Georgij", 2),
                new Job("Arsentev Petr", 1),
                new Job("Maul Alexandr", 2),
                new Job("Bardurkin Victor", 3)
        );
        List<Job> expected = Arrays.asList(
                new Job("Shaporenko Sergey", 1),
                new Job("Rudenko Georgij", 2),
                new Job("Maul Alexandr", 2),
                new Job("Bardurkin Victor", 3),
                new Job("Arsentev Petr", 1)
        );
        sort(jobs, new JobDescByName());
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenCompareAcsByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Shaporenko Sergey", 4),
                new Job("Rudenko Georgij", 2),
                new Job("Arsentev Petr", 3),
                new Job("Maul Alexandr", 1),
                new Job("Bardurkin Victor", 5)
        );
        List<Job> expected = Arrays.asList(
                new Job("Maul Alexandr", 1),
                new Job("Rudenko Georgij", 2),
                new Job("Arsentev Petr", 3),
                new Job("Shaporenko Sergey", 4),
                new Job("Bardurkin Victor", 5)
        );
        sort(jobs, new JobAscByPriority());
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenCompareDecsByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Shaporenko Sergey", 2),
                new Job("Rudenko Georgij", 4),
                new Job("Arsentev Petr", 3),
                new Job("Maul Alexandr", 5),
                new Job("Bardurkin Victor", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("Maul Alexandr", 5),
                new Job("Rudenko Georgij", 4),
                new Job("Arsentev Petr", 3),
                new Job("Shaporenko Sergey", 2),
                new Job("Bardurkin Victor", 1)
        );
        sort(jobs, new JobDescByPriority());
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenCompareAscByNameAndAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Shaporenko Sergey", 2),
                new Job("Shaporenko Sergey", 1),
                new Job("Rudenko Georgij", 4),
                new Job("Rudenko Georgij", 3),
                new Job("Maul Alexandr", 5),
                new Job("Maul Alexandr", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("Maul Alexandr", 1),
                new Job("Maul Alexandr", 5),
                new Job("Rudenko Georgij", 3),
                new Job("Rudenko Georgij", 4),
                new Job("Shaporenko Sergey", 1),
                new Job("Shaporenko Sergey", 2)
        );
        sort(jobs, new JobAscByName().thenComparing(new JobAscByPriority()));
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenCompareAscByNameAndDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Shaporenko Sergey", 2),
                new Job("Maul Alexandr", 5),
                new Job("Shaporenko Sergey", 1),
                new Job("Rudenko Georgij", 4),
                new Job("Maul Alexandr", 1),
                new Job("Rudenko Georgij", 3)
        );
        List<Job> expected = Arrays.asList(
                new Job("Maul Alexandr", 5),
                new Job("Maul Alexandr", 1),
                new Job("Rudenko Georgij", 4),
                new Job("Rudenko Georgij", 3),
                new Job("Shaporenko Sergey", 2),
                new Job("Shaporenko Sergey", 1)
        );
        sort(jobs, new JobAscByName().thenComparing(new JobDescByPriority()));
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenCompareAscByPriorityAndDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Shaporenko Sergey", 2),
                new Job("Maul Alexandr", 5),
                new Job("Shaporenko Sergey", 1),
                new Job("Rudenko Georgij", 4),
                new Job("Maul Alexandr", 1),
                new Job("Rudenko Georgij", 3)
        );
        List<Job> expected = Arrays.asList(
                new Job("Shaporenko Sergey", 1),
                new Job("Maul Alexandr", 1),
                new Job("Shaporenko Sergey", 2),
                new Job("Rudenko Georgij", 3),
                new Job("Rudenko Georgij", 4),
                new Job("Maul Alexandr", 5)
        );
        sort(jobs, new JobAscByPriority().thenComparing(new JobDescByName()));
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenCompareDescByPriorityAndDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Shaporenko Sergey", 2),
                new Job("Maul Alexandr", 5),
                new Job("Shaporenko Sergey", 1),
                new Job("Rudenko Georgij", 4),
                new Job("Maul Alexandr", 1),
                new Job("Rudenko Georgij", 3)
        );
        List<Job> expected = Arrays.asList(
                new Job("Maul Alexandr", 5),
                new Job("Rudenko Georgij", 4),
                new Job("Rudenko Georgij", 3),
                new Job("Shaporenko Sergey", 2),
                new Job("Shaporenko Sergey", 1),
                new Job("Maul Alexandr", 1)
        );
        sort(jobs, new JobDescByPriority().thenComparing(new JobDescByName()));
        assertThat(jobs).isEqualTo(expected);
    }
}