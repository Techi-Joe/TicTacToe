package com.company.games.Games;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        board b = new board();
        int input = 1;
        System.out.println(b);
        boolean player = true;

        while (!logic.winState(b) && !board.isFull()) {
            System.out.print("Enter tile number: ");

            while (true) {
                try {
                    input = scan.nextInt();
                } catch (InputMismatchException e) {
                    input = -1;
                }
                if (logic.isValidInput(b, input - 1)) {
                    break;
                } else if (input != -1) {
                    System.out.print("\n\nError: incorrect user input!\nPlease try again: ");
                }
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
