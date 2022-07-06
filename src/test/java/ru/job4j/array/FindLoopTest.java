package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 8;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void whenDiapasonHas6Then4() {
        int[] data = new int[]{1, 2, 10, 8, 6, 4, 5};
        int el = 6;
        int start = 3;
        int finish = 6;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}