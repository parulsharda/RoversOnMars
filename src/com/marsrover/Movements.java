package com.marsrover;

public class Movements {

    public char direction;


    public char turnLeft(char direction) {
        this.direction = direction;
        if (direction == 'N')
            this.direction = 'W';
        else if (direction == 'E')
            this.direction = 'N';
        else if (direction == 'S')
            this.direction = 'E';
        else if (direction == 'W')
            this.direction = 'S';
        return this.direction;
    }


    public char turnRight(char direction) {
        this.direction = direction;
        if (direction == 'W')
            this.direction = 'N';
        else if (direction == 'S')
            this.direction = 'W';
        else if (direction == 'N')
            this.direction = 'E';
        else if (direction == 'E')
            this.direction = 'S';
        return this.direction;
    }
}
