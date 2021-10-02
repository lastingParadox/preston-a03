/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.List;

public class Solution36 {

    private String takeInput() {
        //Returns user's input
        return "";
    }

    private int validateNum(String response) {
        //Create integer responseNum
        //Loop until responseNum is filled:
            //Try to cast response to an integer
                //While response cannot be casted as an integer:
                    //Print "Invalid response: Please input a response time in an integer format."
                    //Print "Enter a number: "
                    //response stores the user's input.
            //responseNum is equal to the casted int value of response
        //return responseNum
        return 0;
    }

    public List<Integer> createTempList() {
        //Create String "listFinished"
        //Create String "response"
        //Create integer "responseInt"
        //Create list of integers called "tempList"

        //While listFinished is not equal to "done":
            //Print "Enter a number: "
            //response stores the user's input.
            //If response is equal to "done":
                //break the loop
            //responseInt is set equal to validateNum(response)
            //Add responseInt to tempList
        //return the list
        return null;
    }

    public int[] createArray(List<Integer> tempList) {
        //Create array of integers "timeArray" that is the size of tempList
        //Loop through all the values in tempList (i):
            //Add list index i to array index i.
        //return timeArray
        return null;
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
