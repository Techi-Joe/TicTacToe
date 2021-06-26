package com.company.games.Games;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        board b = new board();
        System.out.println(b);
        boolean player = true;
        while (!logic.winState(b) && !logic.isFull(b)) {
            System.out.print("Enter tile number: ");
            int input = scan.nextInt();
            while (!logic.isValidInput(b, input)) {
                System.out.println("\n\nError: incorrect user input!\nPlease try again: ");
                input = scan.nextInt();
            }
            b.place(player, input-1);
            player = !player;
            System.out.println();
            System.out.println(b);
        }
        if (logic.winState(b)) {
            if (!player) {
                System.out.println("X has won the game!");
            } else {
                System.out.println("O has won the game!");
            }
        } else {
            System.out.println("Tie!");
        }
    }
}
