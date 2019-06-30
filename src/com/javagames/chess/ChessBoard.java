package com.javagames.chess;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ChessBoard {

    private static String[][] board = {{ "R", "N", "B", "Q", "K", "B", "N", "R", },
                                       { "P", "P", "P", "P", "P", "P", "P", "P", },
                                       { "E", "E", "E", "E", "E", "E", "E", "E", },
                                       { "E", "E", "E", "E", "E", "E", "E", "E", },
                                       { "E", "E", "E", "E", "E", "E", "E", "E", },
                                       { "E", "E", "E", "E", "E", "E", "E", "E", },
                                       { "P", "P", "P", "P", "P", "P", "P", "P", },
                                       { "R", "N", "B", "Q", "K", "B", "N", "R", }
    };

    public static void displayBoard(){
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(j == 0) {
                    System.out.print(Math.abs(i - 8));
                }
                System.out.print(symbols.get(board[i][j]));
            }
            System.out.println("");
        }
//        for(String pos : board)
        System.out.println(" abcdefgh");
    }

    private static HashMap<String, String> symbols = createSymbols();

    private static HashMap<String, String> createSymbols(){
        HashMap<String, String> symbols = new HashMap<>();

        symbols.put("P", "\u265f");
        symbols.put("N", "\u265e");
        symbols.put("B", "\u265d");
        symbols.put("R", "\u265c");
        symbols.put("Q", "\u265b");
        symbols.put("K", "\u265a");
        symbols.put("E", "\u25a0");

        return symbols;
    }

    private static int[] parseInput(String input){
        String letter = input.substring(0, 1);
        String number = input.substring(1);
        int i = 8 - Integer.parseInt(number);
        int j = 0;

        switch(letter) {
            case "a":
                j = 0;
                break;
            case "b":
                j = 1;
                break;
            case "c":
                j = 2;
                break;
            case "d":
                j = 3;
                break;
            case "e":
                j = 4;
                break;
            case "f":
                j = 5;
                break;
            case "g":
                j = 6;
                break;
            case "h":
                j = 7;
                break;
        }
        int[] output = new int[] {i, j};
        return output;
    }

    public static void updateBoard(String from, String to){
        int[] parsedFrom = parseInput(from);
        int i = parsedFrom[0];
        int j = parsedFrom[1];
        String piece = board[i][j];

        int[] parsedTo = parseInput(to);



    }



}
