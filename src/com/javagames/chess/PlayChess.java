package com.javagames.chess;

import java.util.Scanner;

public class PlayChess {
    public static void playChess() {

        Scanner in = new Scanner(System.in);
        String from = "";
        String to = "";

        do {
            ChessBoard.displayBoard();
            try {
                System.out.println("Select piece you want to move. (e.g. 'b7')");
                from = in.nextLine();
                System.out.println("Now select where you want to move that piece. (e.g. 'c7')");
                to = in.nextLine();
                System.out.println(from);
                System.out.println(to);
                ChessBoard.updateBoard(from, to);


            } catch (Exception invalid) {
                System.out.println("Could not handle input. Exiting");
                System.exit(1);
            }
        }
        while(true);

    }
}
