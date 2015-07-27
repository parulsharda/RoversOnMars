package com.marsrover;

import java.util.Scanner;


public class View {

    String plateauSize;
    String roverPosition;
    String roverMovements;

    public void acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        plateauSize = sc.nextLine();
        roverPosition = sc.nextLine();
        roverMovements = sc.nextLine();
    }
}
