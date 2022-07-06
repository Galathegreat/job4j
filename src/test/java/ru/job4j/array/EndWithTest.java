package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EndWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] post = {'l', 'o'};
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        boolean result = EndWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}