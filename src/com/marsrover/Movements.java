package com.marsrover;

public class Movements {


    public char moveleft(char direction) {
        if(direction == 'N')
            direction = 'W';
        else if(direction == 'E')
            direction = 'N';
        else if(direction == 'S')
            direction = 'E';
        else
            direction='S';
        return direction;
    }


    public char moveright(char direction) {
        if(direction == 'W')
            direction = 'N';
        else if(direction == 'S')
            direction = 'W';
        else if(direction == 'N')
            direction = 'E';
        else
            direction = 'S';
        return direction;
    }
}
