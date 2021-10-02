/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution36 {

    private static final int DONE = -1;
    private static final Scanner input = new Scanner(System.in);

    private String takeInput() {
        //Takes and returns the user's input.
        return input.nextLine().toLowerCase();
    }

    private int validateNum(String response) {
        //Validates that the response was an integer and returns the integer.
        int responseNum;

        while(true) {
            try {
                //If the user inputs done within this loop, return a value to finish the list.
                if (response.equals("done")) {
                    return DONE;
                }

                responseNum = Integer.parseInt(response);

                //Validation that the number was not negative.
                if (responseNum < 0) throw new IllegalArgumentException();

                return responseNum;
            }
            //Gets a new response if response is not an integer or is negative.
            catch (IllegalArgumentException e) {
                System.out.println("Invalid response: Please input a response time in a positive integer format.");
                System.out.print("Enter a number: ");
                response = takeInput();
            }
        }
    }

    private List<Integer> createTempList() {
        //Creates a temporary list to be converted to an array of integers.
        String response;
        int responseInt = 0;
        List<Integer> tempList = new ArrayList<>();

        //Input loop
        while(true) {
            System.out.print("Enter a number: ");
            response = takeInput();

            //Breaks the loop if response equals "done" or validation returns DONE.
            if (response.equals("done") || responseInt == DONE) {
                break;
            }

            //Validates that the response was an integer and returns it.
            responseInt = validateNum(response);

            if (responseInt != DONE) {
                tempList.add(responseInt);
            }
        }
        return tempList;
    }

    public int[] createArray(List<Integer> tempList) {
        //Creates and returns an array containing the values in the temporary list.
        int[] timeArray = new int[tempList.size()];

        for(int i = 0; i < tempList.size(); i++) {
            timeArray[i] = tempList.get(i);
        }

        return timeArray;
    }

    public static void main(String[] arg) {
        //Create instance Solution36 "lister"

        //Print "Enter one response time in milliseconds per line. Type "done" when you are finished."

        //List of integers temp is equal to createTempList()
        //Array of integers responseArray is equal to createArray(temp)

        //Create instance ResponseStats "calculator" with constructor responseArray

        //Create stringBuilder output

        //Append calculator.printList() to output
        //Append "The average is 'calculator.average()'" to output
        //Append "The minimum is 'calculator.min()'" to output
        //Append "The maximum is 'calculator.max()'" to output
        //Append "The standard deviation is 'calculator.std()'" to output

        //Print output
    }
}
