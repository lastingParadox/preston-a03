/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.Scanner;

public class Solution29 {

    private static final Scanner input = new Scanner(System.in);

    private String takeInput() {
        System.out.print("What is the rate of return? ");
        return input.nextLine();
    }

    public double validateIntResponse(String response) {
        double doubleResponse;
        while (true) {
            try {
                doubleResponse = Double.parseDouble(response);

                while (doubleResponse == 0) {
                    System.out.println("Please enter a value greater than zero.");
                    response = takeInput();
                    doubleResponse = Double.parseDouble(response);
                }

                return doubleResponse;
            }
            catch (NumberFormatException e) {
                System.out.println("Sorry, that's not a valid input.");
                response = takeInput();
            }
        }
    }

    public double calcDoubleTime (double rate) {
        return 72/rate;
    }

    public static void main(String[] arg) {
        //Creates a new instance of Solution29 "calculator"

        //double rate is equal to calculator.validateIntResponse()
            //Stores user's input for calculating double rate

        //Output "It will take 'calculator.calcDoubleTime(rate)' years to double your initial investment."
    }
}
