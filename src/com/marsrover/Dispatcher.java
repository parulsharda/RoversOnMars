package com.marsrover;

public class Dispatcher {

    public char dispatch(String xCoOrdinate, String yCoOrdinate, char initial, String moves, Movements movements, Forward forward) {
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L')
                return movements.turnLeft(initial);
            else if (moves.charAt(i) == 'R')
                return movements.turnRight(initial);
           /* else if (moves.charAt(i) == 'M')
                return forward.move(xCoOrdinate,yCoOrdinate,initial);*/
        }
        return 'X';
    }
}
