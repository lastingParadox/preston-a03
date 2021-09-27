/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.Scanner;

public class Solution28 {

    private static final int LOOPNUM = 5;
    private static final Scanner input = new Scanner(System.in);

    //Takes in the user's input and validates if it is an integer. If not, tells the user to enter a number. Returns the response.
    private int takeIntInput() {
        String response;
        int intResponse;

        //Prompts the user and stores their response.
        System.out.print("Enter a number: ");
        response = input.nextLine();

        //Validator; Tries to convert the response to an integer. If it cannot, prompts the user to enter a number and stores the input.
        while(true) {
            try {
                intResponse = Integer.parseInt(response);
                return intResponse;
            }
            catch (NumberFormatException e) {
                System.out.printf("%s is not a number.%nEnter a number: ", response);
                response = input.nextLine();
            }

        }
    }

    //Prompts the user to enter a number LOOPNUM times and gets the total of the user's inputs.
    public int addTotal() {
        int total = 0;

        for (int i = 0; i<LOOPNUM; i++)
            total += takeIntInput();

        return total;
    }

    //Overloaded addTotal() method that takes in an array of integers instead of user input.
    public int addTotal(int[] array) {
        int total = 0;

        for (int i = 0; i<LOOPNUM; i++)
            total += array[i];

        return total;
    }

    //Sets an integer equal to the total of the user's responses and prints it out.
    public static void main(String[] arg) {
        Solution28 numCalculator = new Solution28();

        int total = numCalculator.addTotal();

        System.out.printf("The total is %d.", total);
    }
}
