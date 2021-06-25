package com.company.games.Games;

public class logic {

    // returns true if the game is won, false otherwise
    public static boolean winState(board b) {
        String[] board = b.getBoard();
        return (board[0].equals(board[1]) && board[1].equals(board[2])) || // first x
                (board[3].equals(board[4]) && board[4].equals(board[5])) ||
                (board[6].equals(board[7]) && board[7].equals(board[8])) ||
                (board[0].equals(board[3]) && board[3].equals(board[6])) || // first y
                (board[1].equals(board[4]) && board[4].equals(board[7])) ||
                (board[2].equals(board[5]) && board[5].equals(board[8])) ||
                (board[0].equals(board[4]) && board[4].equals(board[8])) || // first diagonal
                (board[2].equals(board[4]) && board[4].equals(board[6]));
    }
}
