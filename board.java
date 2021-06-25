package com.company.games.Games;

import java.util.Arrays;

public class board {
    private final String[] board = new String[9];

    public board() {
        // clear board
        for (int i = 0; i < 9; i++) {
            board[i] = "";
        }
    }

    public String[] getBoard() {
        return board;
    }

    public void place(boolean p, int x) {
        if (p) {
            board[x] = "X";
        } else {
            board[x] = "O";
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(board);
    }
}
