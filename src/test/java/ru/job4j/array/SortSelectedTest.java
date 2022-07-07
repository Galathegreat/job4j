package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf4elements() {
        int[] data = new int[] {6, 4, 8, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 6, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf8Elements() {
        int[] data = new int[] {12, 4, 8, 2, 6, 10, 11, 13};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 6, 8, 10, 11, 12, 13};
        Assert.assertArrayEquals(expected, result);
    }
}