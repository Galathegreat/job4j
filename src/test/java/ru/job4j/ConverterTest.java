package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RblThen2dot3333Euro() {
    }

    @Test
    public void rubleToDollar() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RblThen3dot3333Dlr() {
    }
}