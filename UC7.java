package org.example;

import java.util.Random;

public class UC7 {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        computerMove();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random rand = new Random();
        int slot, row, col;

        while (true) {
            // Generate slot (1–9)
            slot = rand.nextInt(9) + 1;

            // Convert to row and column
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Check if valid move
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                System.out.println("Computer placed at slot: " + slot);
                break;
            }
        }
    }
}
