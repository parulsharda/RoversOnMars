package com.marsrover;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DispatcherTest {

    @Test
    public void xyz() {
        Dispatcher dispatcher = new Dispatcher();
        Movements movements = new Movements();

        assertEquals('W', dispatcher.dispatch("1", "1", 'N', "LMLM", movements));
    }
}
