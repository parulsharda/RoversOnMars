package com.marsrover;

public class Tokenizer {

    public String[] arr = null;

    public String initialXPosition;
    public String initialYPosition;
    public String initialDirection;

    public String[] tokenize(String input) {
        arr = input.split(" ");
        return arr;
    }
}



