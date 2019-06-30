package com.javagames.chess;

import java.util.Scanner;

public class PlayChess {
    public static void playChess() {

        Scanner in = new Scanner(System.in);
        String from = "";
        String to = "";
        Integer turn = 0;

        do {
            ChessBoard.displayBoard();
            try {
                turn++;
                System.out.println("Turn # " + turn);
                if(turn % 2 == 1) {
                    System.out.println("Player 1 (white): Select piece you want to move. (e.g. 'b7')");
                }
                else {
                    System.out.println("Player 2 (black): Select piece you want to move. (e.g. 'b7')");
                }
                from = in.nextLine();
                System.out.println("Now select where you want to move that piece. (e.g. 'c7')");
                to = in.nextLine();
                ChessBoard.updateBoard(from, to);


            } catch (Exception invalid) {
                System.out.println("Could not handle input. Exiting");
                System.exit(1);
            }
        }
        while(true);

    }
}
