package com.marsrover;


public class Forward {

    public int yCoordinate;
    public int xCoordinate;

    public int move(String xCoordinatefor, String yCoordinatefor, char direction) {

        this.xCoordinate = (Integer.parseInt(xCoordinatefor));
        this.yCoordinate = (Integer.parseInt(yCoordinatefor));
        if (direction == 'N')
            return this.yCoordinate += 1;
        else if (direction == 'S')
            return this.yCoordinate -= 1;
        else if (direction == 'E')
            return this.xCoordinate += 1;
        else if (direction == 'W')
            return this.xCoordinate -= 1;
        return 0;
    }
}
