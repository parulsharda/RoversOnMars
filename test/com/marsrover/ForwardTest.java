package com.marsrover;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ForwardTest {

    @Test

    public void shouldMoveTheRoverInYdirectionIfInitialyWasFacingNorth() {
        Forward forward = new Forward();

        int newCoOrdinate = forward.move("1", "2", 'N');

        assertEquals(3, newCoOrdinate);
    }
}
