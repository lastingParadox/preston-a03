/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.Scanner;

public class Solution26 {

    Solution26 reader = new Solution26();
    Scanner input = new Scanner(System.in);

    //Prompts the user for an input and returns it.
    private String storeInput(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }

    //Validates if the user's response is a number. If not, prompts the user to enter a number.
    private double validateResponse(String response) {
        while(true) {
            try {
                return Double.parseDouble(response);
            }
            //If the user's response is not a number, skips the error and prompts the user to enter a number.
            catch (NumberFormatException e) {
                System.out.printf("%s is not a number. Please enter a value: ", response);
                response = input.nextLine();
            }
        }
    }

    public static void main(String[] arg) {
        //Prompt the user for their balance and verify it is a number. (double balance)
        //Prompt the user for the APR on the card and verify it is a number. (double apr)
        //Prompt the user for the monthly payment and verify it is a number. (double monthPayment)

        //Create new instance of PaymentCalculator called "calculator" with constructors balance, apr, monthPayment.
        //Integer variable months is set equal to calculator's calculateMonthsUntilPaidOff().

        //Output "It will take you 'months' months to pay off this card."

    }

}
