package org.example;

public class UC6 {

    static char[][] board = new char[3][3];

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {

        // Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        placeMove(0, 0, 'X');
        System.out.println(board[0][0]);
    }

    /**
     * Updates the board by placing the given symbol
     * at the specified row and column.
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}
