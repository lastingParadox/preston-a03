/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution33 {

    Random random = new Random();
    Scanner input = new Scanner(System.in);

    private void takeQuestion() {
        //Prompts the user to enter a question and does nothing with their response.
        System.out.printf("What's your question?%n> ");
        input.nextLine();
        System.out.printf("%n");
    }

    public List<String> create8BallAnswers() {
        //Creates a list containing the 8ball's answers.
        List<String> ballAnswers = new ArrayList<>();

        ballAnswers.add("Yes.");
        ballAnswers.add("No.");
        ballAnswers.add("Ask again later.");

        return ballAnswers;
    }

    public int getRandNumber(List<String> answers) {
        //Gets a random number from 0 to the size of the 8ball answer list - 1.
        int range = answers.size();
        return random.nextInt(range);
    }

    public static void main(String[] args) {
        //Creates a list of 8ball responses, asks the user to enter a question, and responds with a random answer.
        //Create instance Solution33 "prompter"

        //Create a new list answers and have it contain the 8ball responses.

        //Ask the user for their question and take it.

        //Integer "index" is a random number between 0 and answers.size()-1
        //Print out the response based on the answer list index of "index"
    }
}
