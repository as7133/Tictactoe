package org.example;

public class UC8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human's turn");
                // simulate human move
            } else {
                System.out.println("Computer's turn");
                // simulate computer move
            }

            // Simulate win/draw condition (for now)
            // In future UC, replace with actual win/draw check
            gameOver = checkGameOver();

            // Switch turn
            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over!");
    }

    /**
     * Placeholder method for checking win/draw.
     * Currently stops after one loop for demonstration.
     */
    static boolean checkGameOver() {
        return true; // Replace with real logic later
    }
}