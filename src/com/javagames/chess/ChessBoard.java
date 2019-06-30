package com.javagames.chess;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ChessBoard {

    private static String[][] board = {{ "BR", "BN", "BB", "BQ", "BK", "BB", "BN", "BR", },
                                       { "BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP", },
                                       { "E", "E", "E", "E", "E", "E", "E", "E", },
                                       { "E", "E", "E", "E", "E", "E", "E", "E", },
                                       { "E", "E", "E", "E", "E", "E", "E", "E", },
                                       { "E", "E", "E", "E", "E", "E", "E", "E", },
                                       { "WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP", },
                                       { "WR", "WN", "WB", "WQ", "WK", "WB", "WN", "WR", }
    };

    public static void displayBoard(){
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(j == 0) {
                    System.out.print(Math.abs(i - 8));
                }
                if(i % 2 == 0) {
                    if (j % 2 == 0) {
                        if (board[i][j].equals("E")) {
                            System.out.print("\u25a1");
                        } else {
                            System.out.print(symbols.get(board[i][j]));
                        }
                    }
                    else {
                        System.out.print(symbols.get(board[i][j]));
                    }
                }
                if(i % 2 == 1) {
                    if (j % 2 == 1) {
                        if (board[i][j].equals("E")) {
                            System.out.print("\u25a1");
                        }
                        else {
                            System.out.print(symbols.get(board[i][j]));
                        }
                    }
                else {
                    System.out.print(symbols.get(board[i][j]));
                }
                }
            }
            System.out.println("");
        }
        System.out.println(" abcdefgh");
    }

    private static HashMap<String, String> symbols = createSymbols();

    private static HashMap<String, String> createSymbols(){
        HashMap<String, String> symbols = new HashMap<>();

        symbols.put("WP", "\u2659");
        symbols.put("WN", "\u2658");
        symbols.put("WB", "\u2657");
        symbols.put("WR", "\u2656");
        symbols.put("WQ", "\u2655");
        symbols.put("WK", "\u2654");
        symbols.put("BP", "\u265f");
        symbols.put("BN", "\u265e");
        symbols.put("BB", "\u265d");
        symbols.put("BR", "\u265c");
        symbols.put("BQ", "\u265b");
        symbols.put("BK", "\u265a");
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
        board[i][j] = "E";

        int[] parsedTo = parseInput(to);
        i = parsedTo[0];
        j = parsedTo[1];
        board[i][j] = piece;

    }



}
