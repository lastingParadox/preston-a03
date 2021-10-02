package baseline;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution37 {

    private static final Scanner input = new Scanner(System.in);

    private String takeInput(String prompt) {
        //Prompts the user and takes in the user's input.
        System.out.println(prompt);
        return input.nextLine();
    }

    private int validateNumber(String prompt, String response) {
        //Validates that the user's response was a number.
        int responseNum;
        while(true) {
            try {
                responseNum = Integer.parseInt(response);
                return responseNum;
            }
            catch (IllegalArgumentException e) {
                System.out.println("Invalid response! Please input a whole number.");
                System.out.println(prompt);
                response = input.nextLine();
            }
        }
    }

    public List<Character> createAlphabet() {
        //Creates a list containing both the Uppercase and lowercase alphabet.
        //Simplified loops into a single array for the sake of memory
        Character[] tempArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
                                 'T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l',
                                 'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        List<Character> alphabetList = new ArrayList<>();

        Collections.addAll(alphabetList, tempArray);

        return alphabetList;
    }

    public List<Character> createSpecialList() {
        //Creates a list containing special characters.
        //"!"#$%&'()*+-./" ":;<=>?@" "[\]^_`" "{|}~"
        //Simplified loops into a single array for the sake of memory
        Character[] tempArray = {'!','"','#','$','%','&','\'','(',')','*','+',',','-','.','/',':',';','<','=',
                                 '>','?','@','[','\\',']','^','_','`','{','|','}','~'};
        List<Character> specialList = new ArrayList<>();

        Collections.addAll(specialList, tempArray);

        return specialList;
    }

    public List<Integer> createNumberList() {
        //Creates a list containing numbers 0-9
        //Simplified loop into a single array for the sake of memory
        Integer[] tempArray = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> numberList = new ArrayList<>();

        Collections.addAll(numberList,tempArray);

        return numberList;
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

        //Create new instance baseline.Password "passwordCreator" with constructors alphabet, special, and numbers

        //String password is equal to the password passwordCreator makes from the criteria given by the user.

        //Output "Your password is 'password'"
    }

}
