/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

import java.util.List;

public class Solution37 {

    //Private static final Scanner "input"

    private String takeInput(String prompt) {
        //Print the prompt.
        //Return the user's input.
        return "";
    }

    private int validateNumber(String prompt, String response) {
        //Try to cast the response to an integer
        //While the response cannot be cast to an integer:
            //Output that the response was invalid.
            //Output the prompt.
            //Response will store the user's new input.
        //Return the integer value of the response.
        return 0;
    }

    public List<Character> createAlphabet() {
        //Uppercase and lowercase alphabet
        //The ASCII values (decimal) for the alphabet are 65-90 (capital) and 97-122 (lowercase)
        //Create List of characters "alphabetList"
        //Create character "alpha"

        //For values 65 through 90 (i):
            //alpha is equal to the character cast of i.
            //Add alpha to the list.

        //For values 97 through 122 (i):
            //alpha is equal to the character cast of i.
            //Add alpha to the list.

        //return alphabetList
        return null;
    }

    public List<Character> createSpecialList() {
        //"!"#$%&'()*+-./" ":;<=>?@" "[\]^_`" "{|}~"
        //ASCII values (decimal) for special characters include 33-47, 58-64, 91-96, and 123-126
        //Create List of characters "specialList"
        //Create character "special"

        //For values 33 through 47 (i):
            //special is equal to the character cast of i.
            //Add special to the list.

        //For values 58 through 64 (i):
            //special is equal to the character cast of i.
            //Add special to the list.

        //For values 91 through 96 (i):
            //special is equal to the character cast of i.
            //Add special to the list.

        //For values 123 through 126 (i):
            //special is equal to the character cast of i.
            //Add special to the list.

        //return specialList
        return null;
    }

    public List<Integer> createNumberList() {
        //Numbers 0-9 will be included in this list.
        //Create List of integers "numberList"

        //For values 0 through 9 (i):
            //Add value to the list.

        //return numberList
        return null;
    }

    public static void main(String[] arg) {
        //Create integer minLength
        //Create integer numSpecial
        //Create integer numNumbers

        //minLength is equal to the validated number of the user's input
            //After the prompt: "What's the minimum length?"

        //numSpecial is equal to the validated number of the user's input
        //After the prompt: "How many special characters?"

        //numNumbers is equal to the validated number of the user's input
        //After the prompt: "How many numbers?"

        //List of Characters alphabet = createAlphabet()
        //List of Characters special = createSpecialList()
        //List of Integers numbers = createNumberList()

        //Create new instance Password "passwordCreator" with constructors alphabet, special, and numbers

        //String password is equal to the password passwordCreator makes from the criteria given by the user.

        //Output "Your password is 'password'"
    }

}
