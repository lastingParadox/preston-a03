/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

public class Solution38 {

    private int validateValue(String response) {
        //Create integer indexValue.

        //Loop:
            //Try to cast tempArray[i] to an integer.
            //While tempArray[i] cannot be changed to an integer:
                //Output "Invalid input 'tempArray[i]' for value 'i+1'. Please input a single integer."
                //response is set to the user's input.
            //indexValue = casted int response.
        //return indexValue
        return 0;
    }

    public int[] convertToArray(String response) {
        //Create a string array "tempArray" and set it equal to the split response with a delimiter of a space
        //Create list of Integers "tempList"
        //Create int numValue

        //Loop for each value in tempArray  (i):
            //Add validateValue(tempArray[i]) to tempList

        //Create array of ints "numArray"
        //Loop for each value in "tempList" (i):
            //numArray[i] is set equal to tempList.get(i)

        //return numArray
        return null;
    }

    public int[] filterEvenNumbers(int[] original) {
        //Create list of Integers "tempList"

        //Loop for all values in original (value):
            //If value mod 2 is equal to zero:
                //Add value to tempList

        //Create array of integers "filtered"
        //Loop for each value in "tempList" (i):
            //filtered[i] is set equal to tempList.get(i)
        //return filtered
        return null;
    }

    public String printArray(int[] array) {
        //Create new StringBuilder output

        //Append "'array[0]'" to output
        //For each value in array except the first index (value):
            //Append " 'value'" to output.

        //return string value of output.
        return "";
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
        //responseArray is set equal to filterer.filterEvenNumbers(responseArray);

        //Print "The even numbers are 'printArray(responseArray)'."
    }
}
