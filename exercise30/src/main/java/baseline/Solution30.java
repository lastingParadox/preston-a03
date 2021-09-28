/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

public class Solution30 {

    private static final int TABLESIZE = 12;

    public int multiply(int num1, int num2) {
        //Simply multiplies two numbers and returns their product.
        //Used for easier comprehension in the multiplication table and unit testing.
        return num1 * num2;
    }

    public String createMultiplicationTable (int tableSize) {
        //Loops for each row and column of a multiplication table, getting the product for each cell.
        //Appends each row and column to a string and returns it.
        int product;
        StringBuilder table = new StringBuilder();

        for (int i = 1; i<=tableSize; i++) {
            for (int j = 1; j<=tableSize; j++) {
                product = multiply(i, j);
                table.append(String.format("%5d", product));
            }
            table.append("\n");
        }
        return String.valueOf(table);
    }

    public static void main(String[] arg) {
        //Create new instance Solution30 "printer"

        //Output printer.createMultiplicationTable()
    }
}
