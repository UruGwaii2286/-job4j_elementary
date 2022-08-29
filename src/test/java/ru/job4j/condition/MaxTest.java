package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax50To10Then50() {
        int left = 50;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax40To120Then120() {
        int left = 40;
        int right = 120;
        int result = Max.max(left, right);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax40To40Then40() {
        int left = 40;
        int right = 40;
        int result = Max.max(left, right);
        int expected = 40;
        assertThat(result).isEqualTo(expected);

    }
}