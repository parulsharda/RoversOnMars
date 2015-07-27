package com.marsrover;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MovementsTest {

    @Test
    public void shouldPointToWestWhenInitiallyWasAtNorthAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.turnLeft('N');

        assertEquals('W', newDirection);
    }

    @Test
    public void shouldPointToEastWhenInitiallyWasAtSouthAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.turnLeft('S');

        assertEquals('E', newDirection);
    }

    @Test
    public void shouldPointToNorthtWhenInitiallyWasAtEastAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.turnLeft('E');

        assertEquals('N', newDirection);
    }

    @Test
    public void shouldPointToSouthtWhenInitiallyWasAtWestAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.turnLeft('W');

        assertEquals('S', newDirection);
    }

    @Test
    public void shouldPointToNorthtWhenInitiallyWasAtWestAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.turnRight('W');

        assertEquals('N', newDirection);
    }

    @Test
    public void shouldPointToSouthtWhenInitiallyWasAtEastAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.turnRight('E');

        assertEquals('S', newDirection);
    }

    @Test
    public void shouldPointToEasttWhenInitiallyWasAtNorthAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.turnRight('N');

        assertEquals('E', newDirection);
    }
}


