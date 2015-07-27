package com.marsrover;

public class Tokenizer {

    public String initialXPosition;
    public String initialYPosition;
    public String initialDirection;

    public String[] parse(String input) {
        String[] arr = input.split(" ");
        initialXPosition = arr[0];
        initialYPosition = arr[1];
        initialDirection = arr[2];
        return arr;
    }
}



