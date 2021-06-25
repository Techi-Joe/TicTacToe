package com.company.games.Games;

public class logic {

    public static int winState(board b) {
        String[] board = b.getBoard();
        if (board[0].equals(board[1]) && board[1].equals(board[2])) {
            return 1;
        }
        return 0;
    }
}
