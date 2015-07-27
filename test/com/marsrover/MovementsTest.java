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

    @Test
    public void shouldPointToEastWhenInitiallyWasAtSouthAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.moveleft('S');

        assertEquals('E', newDirection);
    }

    @Test
    public void shouldPointToNorthtWhenInitiallyWasAtEastAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.moveleft('E');

        assertEquals('N', newDirection);
    }

    @Test
    public void shouldPointToSouthtWhenInitiallyWasAtWestAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.moveleft('W');

        assertEquals('S', newDirection);
    }

    @Test
    public void shouldPointToNorthtWhenInitiallyWasAtWestAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.moveright('W');

        assertEquals('N', newDirection);
    }

    @Test
    public void shouldPointToSouthtWhenInitiallyWasAtEastAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.moveright('E');

        assertEquals('S', newDirection);
    }

    @Test
    public void shouldPointToEasttWhenInitiallyWasAtNorthAndAskedToMoveLeft() {
        Movements movements = new Movements();

        char newDirection = movements.moveright('N');

        assertEquals('E', newDirection);
    }


}

