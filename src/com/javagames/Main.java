package com.javagames;

import com.javagames.chess.PlayChess;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer selection = 0;

        do {
            System.out.println("Would you like to play a game?");
            System.out.println("Java Games");
            System.out.println("__________");
            System.out.println("1) Chess");
            System.out.println("2) Black Jack");
            System.out.println("3) Exit");
            System.out.println("");
            System.out.println("Please enter a selection");

            try {
                selection = in.nextInt();

                if (selection < 1 || selection > 3) {
                    System.out.println("Please choose a number between 1 and 2");
                }

                switch (selection) {
                    case 1:
                        PlayChess.playChess();
                    case 2:
                        System.out.println("Black Jack is not implemented yet. Please choose another game.");
                        selection = 0;
                        continue;
                    case 3:
                        System.out.println("Thank you for playing!");
                }

            } catch (Exception invalid) {
                System.out.println("Could not handle input. Exiting");
                System.exit(1);
            }
        }
        while(selection < 1 || selection > 3);
    }
}