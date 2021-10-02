/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution38 {

    private static final Scanner input = new Scanner(System.in);

    private int validateValue(String response, int index) {
        int indexValue;

        while (true) {
            try {
                indexValue = Integer.parseInt(response);
                return indexValue;
            }
            catch (IllegalArgumentException e) {
                System.out.printf("Invalid input %s for index %d. Please input a single integer.", response, index);
                response = input.nextLine();
            }
        }
    }

    public int[] convertToArray(String response) {
        String[] tempArray = response.split(" ", 0);
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < tempArray.length; i++)
            tempList.add(validateValue(tempArray[i], i+1));

        int[] numArray = new int[tempList.size()];

        for (int i = 0; i < tempList.size(); i++)
            numArray[i] = tempList.get(i);

        return numArray;
    }

    public int[] filterEvenNumbers(int[] original) {
        List<Integer> tempList = new ArrayList<>();

        for (int value : original) {
            if (value % 2 == 0)
                tempList.add(value);
        }

        int[] filtered = new int[tempList.size()];

        for(int i = 0; i < tempList.size(); i++)
            filtered[i] = tempList.get(i);

        return filtered;
    }

    public String printArray(int[] array) {
        StringBuilder output = new StringBuilder();

        output.append(array[0]);

        for (int i = 1; i<array.length; i++)
            output.append(String.format(" %d", array[i]));

        return String.valueOf(output);
    }

    public static void main(String[] arg) {
        //Create new instance Solution38 "filterer"

        //Prompt the user to enter a list of numbers, separated by spaces.
        //String response is set equal to user's input.
        //Loop:
            //If user's input is blank:
                //Output "Please input at least one integer value."
                //Response is set equal to user's input.

        //Array of ints responseArray is equal to filterer.convertToArray(response)
        //responseArray is set equal to filterer.filterEvenNumbers(responseArray)

        //Print "The even numbers are 'printArray(responseArray)'."
    }
}
