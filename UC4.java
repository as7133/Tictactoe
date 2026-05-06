package org.example;

public class UC4 {

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        int slot = 7;

        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    /**
     * Converts slot number into row index using zero-based indexing.
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /**
     * Converts slot number into column index using modulo operation.
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}