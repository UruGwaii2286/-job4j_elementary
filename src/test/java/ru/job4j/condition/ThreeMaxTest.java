package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ThreeMaxTest {
    @Test
    public void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void secondMax() {
        int first = 60;
        int second = 150;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 150;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void thirdMax() {
        int first = 2;
        int second = 5;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void firstEqSecond() {
        int first = 8;
        int second = 8;
        int third = 5;
        int result = ThreeMax.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void firstEqThird() {
        int first = 55;
        int second = 44;
        int third = 3;
        int result = ThreeMax.max(first, second, third);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void secondEqThird() {
        int first = 1;
        int second = 100;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }
}