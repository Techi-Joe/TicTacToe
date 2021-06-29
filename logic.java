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


    public static boolean isValidInput(board b, int in) {
        String[] board = b.getBoard();
//        System.out.println((!board[in].equals("X") && !board[in].equals("O")));
//        System.out.println((Integer.parseInt(board[in]) <= 9 && Integer.parseInt(board[in]) >= 1));

        try {
            return ((Integer.parseInt(board[in]) <= 9 && Integer.parseInt(board[in]) >= 1) &&
                    (!board[in].equals("X") && !board[in].equals("O")));
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

}
