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
        String response = "";
        int responseInt = 0;
        List<Integer> tempList = new ArrayList<>();

        //Input loop
        while (!response.equals("done") && responseInt != DONE) {
            //Breaks the loop if response equals "done" or validation returns DONE (-1).

            System.out.print("Enter a number: ");
            response = takeInput();

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
        //Tells the user to input response time
        //Returns the average, minimum, maximum, and standard deviation of the times provided
        Solution36 lister = new Solution36();

        System.out.println("Enter one response time in milliseconds per line. Type \"done\" when you are finished.");

        List<Integer> temp = lister.createTempList();

        while (temp.isEmpty()) {
            System.out.println("Please input at least one response time.");
            temp = lister.createTempList();
        }

        int[] responseArray = lister.createArray(temp);

        ResponseStats calculator = new ResponseStats(responseArray);

        //I wanted to use a StringBuilder but IntelliJ thinks this is better
        String output = calculator.printList() +
                String.format("%nThe average is %.2f", calculator.average()) +
                String.format("%nThe minimum is %d", calculator.min()) +
                String.format("%nThe maximum is %d", calculator.max()) +
                String.format("%nThe standard deviation is %.2f", calculator.std());

        System.out.println(output);

    }
}
