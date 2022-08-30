package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ThreeMaxTest {
    @Test
    public void firstMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void secondMax() {
        int first = 60;
        int second = 150;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void thirdMax() {
        int first = 2;
        int second = 5;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void allEq() {
        int first = 12;
        int second = 19;
        int third = 11;
        int result = ThreeMax.max(first, second, third);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void firstEqSecond() {
        int first = 8;
        int second = 10;
        int third = 5;
        int result = ThreeMax.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void firstEqThird() {
        int first = 55;
        int second = 66;
        int third = 44;
        int result = ThreeMax.max(first, second, third);
        int expected = 44;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void secondEqThird() {
        int first = 1;
        int second = 100;
        int third = 10;
        int result = ThreeMax.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}