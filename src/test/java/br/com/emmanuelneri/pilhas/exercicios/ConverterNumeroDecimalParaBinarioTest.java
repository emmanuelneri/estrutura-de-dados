package br.com.emmanuelneri.pilhas.exercicios;

import org.junit.Assert;
import org.junit.Test;

public class ConverterNumeroDecimalParaBinarioTest {

    @Test
    public void deveConverter10ParaBinario() {
        Assert.assertEquals("1010", ConverterNumeroDecimalParaBinario.converter(10));
    }

    @Test
    public void deveConverter27ParaBinario() {
        Assert.assertEquals("11011", ConverterNumeroDecimalParaBinario.converter(27));
    }

    @Test
    public void deveConverter64ParaBinario() {
        Assert.assertEquals("1000000", ConverterNumeroDecimalParaBinario.converter(64));
    }

    @Test
    public void deveConverter256ParaBinario() {
        Assert.assertEquals("100000000", ConverterNumeroDecimalParaBinario.converter(256));
    }

}
