package com.marsrover;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MovementsTest {

    @Test
    public void shouldPointToWestWhenInitiallyWasAtNorthAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.moveleft('N');

        assertEquals('W', newDirection);
    }
}
