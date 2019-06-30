package com.javagames.chess;

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
                System.out.print(symbols.get(board[i][j]));
            }
            System.out.println("");
        }
//        for(String pos : board)

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



}
