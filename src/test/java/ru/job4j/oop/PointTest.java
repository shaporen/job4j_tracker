package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    public void when00to20Than2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when35to37Than4dot47() {
        Point a = new Point(3, 3);
        Point b = new Point(5, 7);
        double expected = 4.47;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when15to89Than8dot06() {
        Point a = new Point(1, 5);
        Point b = new Point(8, 9);
        double expected = 8.06;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when510to69Than1dot41() {
        Point a = new Point(5, 10);
        Point b = new Point(6, 9);
        double expected = 1.41;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when000to138Than8dot60() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 3, 8);
        double expected = 8.60;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when257to339Than3dot0() {
        Point a = new Point(2, 5, 7);
        Point b = new Point(3, 3, 9);
        double expected = 3.00;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when111to583Than8dot30() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(5, 8, 3);
        double expected = 8.30;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}