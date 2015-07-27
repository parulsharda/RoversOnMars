package com.marsrover;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DispatcherTest {

    @Test
    public void shouldTurnToWestWheninitiallyWasFacingNAndInstructionIsLeft() {
        Dispatcher dispatcher = new Dispatcher();
        Movements movements = new Movements();

        assertEquals('W', dispatcher.dispatch("1", "1", 'N', "LMLM", movements));
    }


    @Test
    public void shouldTurnToWestWheninitiallyWasFacingNAndInstructionIsRight() {
        Dispatcher dispatcher = new Dispatcher();
        Movements movements = new Movements();

        assertEquals('E', dispatcher.dispatch("1", "1", 'N', "RMLM", movements));
    }
}


