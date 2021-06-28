package com.company.games.Games;

import java.util.Arrays;

public class board {
    private final String[] board = new String[9];
    private static int count = 0;

    public board() {
        // clear board
        for (int i = 0; i < 9; i++) {
            board[i] = String.format("%d", i+1);
        }
    }

    public static boolean isFull() {
        return count == 9;
    }

    public String[] getBoard() {
        return board;
    }

    public void place(boolean p, int x) {
        count++;
        if (p) {
            board[x] = "X";
        } else {
            board[x] = "O";
        }
    }

    @Override
    public String toString() {
        return String.format("""

                         %s | %s | %s\s
                        ——————————————
                         %s | %s | %s
                        ——————————————
                         %s | %s | %s\s
                        """,
                board[0], board[1], board[2], board[3], board[4], board[5], board[6], board[7], board[8]);
    }
}
