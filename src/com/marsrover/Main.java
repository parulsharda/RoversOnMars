package com.marsrover;

import com.marsrover.Tokenizer;
import com.marsrover.View;

public class Main {

    public static void main(String args[]) {

        View view = new View();
       // Tokenizer tokenizer = new Tokenizer();
        Dispatcher dispatcher = new Dispatcher();
        Movements movements = new Movements();
        //System.out.println(tokenizer.arr[2].charAt(0));
        view.acceptInput();
        char finalDirection = dispatcher.dispatch("1","1",'N',"L R L R",movements);
        System.out.println(finalDirection);
    }
}
