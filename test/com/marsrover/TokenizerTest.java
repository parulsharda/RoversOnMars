package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class TokenizerTest {


    @Test
    public void shouldReturnTokens55AsGridSizeWhenInput55() {
        Tokenizer tokenizer = new Tokenizer();

        String[] tokens = tokenizer.parse("5 5");

        assertArrayEquals(new String[] {"5","5"},tokens);

    }

    @Test
    public void shouldReturnTokens11andNWhenInputIs11N() {
        Tokenizer tokenizer = new Tokenizer();

        String[] tokens = tokenizer.parse("1 1 N");

        assertArrayEquals(new String[] {"1","1","N"},tokens);

    }

    @Test
    public void shouldReturnTokens55andSWhenInputIs55S() {
        Tokenizer tokenizer = new Tokenizer();

        String[] tokens = tokenizer.parse("5 5 S ");

        assertArrayEquals(new String[] {"5","5","S"},tokens);

    }

    @Test
    public void shouldReturnTokensOfMovementsCommand() {
        Tokenizer tokenizer = new Tokenizer();

        String[] tokens = tokenizer.parse("l m l m l m");

        assertArrayEquals(new String[] {"l","m","l","m","l","m"},tokens);

    }

}
