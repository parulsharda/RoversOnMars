package com.marsrover;

import org.junit.Test;

import java.awt.event.FocusEvent;

import static junit.framework.TestCase.assertEquals;


public class DispatcherTest {

    @Test
    public void shouldTurnToWestWheninitiallyWasFacingNAndInstructionIsLeft() {
        Dispatcher dispatcher = new Dispatcher();
        Movements movements = new Movements();
        Forward forward = new Forward();

        assertEquals('W', dispatcher.dispatch("1", "1", 'N', "LMLM", movements,forward));
    }


    @Test
    public void shouldTurnToWestWheninitiallyWasFacingNAndInstructionIsRight() {
        Dispatcher dispatcher = new Dispatcher();
        Movements movements = new Movements();
        Forward forward = new Forward();

        assertEquals('E', dispatcher.dispatch("1", "1", 'N', "RMLM", movements,forward));
    }
}


