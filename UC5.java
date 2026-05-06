package org.example;

public class UC5 {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        int row = 1, col = 1;
        System.out.println(isValidMove(row, col));
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     */
    static boolean isValidMove(int row, int col) {

        // Check boundaries (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}
