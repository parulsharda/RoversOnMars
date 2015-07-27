package com.marsrover;

public class Tokenizer {

    public String initialXPosition;
    public String initialYPosition;
    public String initialDirection;

    public String[] tokenize(String input) {
        String[] arr = input.split(" ");
        return arr;
    }
}



