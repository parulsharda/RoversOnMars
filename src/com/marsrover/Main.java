package com.marsrover;

import com.marsrover.Tokenizer;
import com.marsrover.View;

public class Main {

    public static void main(String args[]) {

        View view = new View();
        Dispatcher dispatcher = new Dispatcher();
        Movements movements = new Movements();
        Forward forward = new Forward();
        view.acceptInput();
        char finalDirection = dispatcher.dispatch("1", "1", 'E', "L R L R", movements, forward);
        System.out.println(finalDirection);
    }
}
