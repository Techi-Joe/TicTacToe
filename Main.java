package com.company.games.Games;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        board b = new board();
        System.out.println(b);
        boolean player = true;
        while (!logic.winState(b)) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter tile number: ");
            int input = scan.nextInt();
            b.place(player, input-1);
            player = !player;
            System.out.println();
            System.out.println(b);
        }
    }
}
