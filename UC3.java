package org.example;

import java.util.Scanner;

/**
 * TicTacToe
 * UC3 reads a slot number (1–9) entered by the user.
 * This use case focuses only on input handling without validation.
 */
public class UC3 {

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     */
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");

        int slot = sc.nextInt();
        return slot;
    }
}


