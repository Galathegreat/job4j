package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenA8B2C5Max8() {
        int a = 3;
        int b = 6;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenA8B8C8Max8() {
        int a = 1;
        int b = 4;
        int c = 10;
        int result = Max.max(a, b, c);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }
}
