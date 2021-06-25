package com.company.games.Games;

public class Main {

    public static void main(String[] args) {
        board b = new board();
        b.place(true, 1);
        b.place(true, 0);
        b.place(true, 2);
        System.out.println(b + "\n" + logic.winState(b));
    }
}
