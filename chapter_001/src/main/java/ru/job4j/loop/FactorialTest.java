package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
    int rsl = Factorial.calc(5);
    int expected = 120;
    assertThat(rsl, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(1);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenCalculateFactorialForFourThenTwentyFour() {
        int rsl = Factorial.calc(4);
        int expected = 24;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCalculateFactorialForFourThenSevenHundredsTwenty() {
        int rsl = Factorial.calc(6);
        int expected = 720;
        assertThat(rsl, is(expected));
    }


}
