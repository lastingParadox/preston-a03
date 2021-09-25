/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.Scanner;

public class Solution24 {

    static final Scanner input = new Scanner(System.in);
    Solution24 reader = new Solution24();

    private String takeInput(String position) {
        System.out.printf("Enter the %s string: ", position);
        return input.nextLine().toLowerCase();
    }

    public static void main(String[] args) {

        //Create new instance of Anagram "sorter".
        //Create string variables "firstString" and "secondString".

        //Set "firstString" equal to takeInput("first").
        //Set "secondString equal to takeInput("second).

        //If sorter's isAnagram(firstString, secondString) is true:
            //Output "\"firstString\" and "\secondString\" are anagrams."
        //Else:
            //Output "\"firstString\" and "\secondString\" are not anagrams."
    }

}
