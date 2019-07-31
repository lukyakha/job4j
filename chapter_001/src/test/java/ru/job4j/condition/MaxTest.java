package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
        int result2 = max.max(3, 2);
        assertThat(result2, is(3));
        int result3 = max.max(4, 4);
        assertThat(result3, is(4));
    }
}