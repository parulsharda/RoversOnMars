package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class TokenizerTest {

    @Test
    public void shouldReturnTokens11andNWhenInputIs11N() {
        Tokenizer tokenizer = new Tokenizer();

        String[] tokens = tokenizer.parse("1 1 N");

        assertArrayEquals(new String[] {"1","1","N"},tokens);

    }

    @Test
    public void shouldReturnTokens55andSWhenInputIs55S() {
        Tokenizer tokenizer = new Tokenizer();

        String[] tokens = tokenizer.parse("5 5 S");

        assertArrayEquals(new String[] {"5","5","S"},tokens);

    }
}
