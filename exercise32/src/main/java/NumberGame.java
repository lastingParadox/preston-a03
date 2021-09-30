/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

public class NumberGame {
    //Create static int guessCount = 0
    //Create static int difficulty

    //Create instance of Solution32 "inputter"

    public void setDifficulty() {
        //Prompts the user to enter the difficulty level: 1, 2, or 3
        //Validates the user's input is numerical and is between 1 and 3
        //Stores user's input in String "response"
            //While the user's input breaks this criteria:
                //Tell the user that their input is invalid.
                //Prompts the user to enter the difficulty level: 1, 2, or 3
                //Stores the input in "response"
        //Store casted String to int chosenDifficulty
        //difficulty is equal to chosenDifficulty
    }

    public int validateInt() {
        //Take user's input, data goes into string response
            //While the user's input is not numerical:
                //guessCount++
                //Prompt "Invalid guess! Guess again:"
        //Take in user's input, stored in response.
        //Store casted String to int playerGuessNum
        //Return playerGuessNum
        return 0;
    }

    public void playGame() {
        //Declare a new Random class named "random"
        //Integer chosenNum is equal to a random number between 1 and 10^(difficulty).
            //i.e., A number between 1 and Math.pow(10, difficulty)
        //String playerGuess and integer playerGuessNum are made.
        //Prompt "I have my number. What's your guess? "
        //Take in user's input and validate it's a number (i.e., validateInt())
        //While playerGuessNum does not equal to chosenNum:
            //If playerGuessNum < chosenNum:
                //guessCount++
                //Prompt "Too low! Guess again: "
                //Take in user's input and validate it's a number.
            //If playerGuessNum > chosenNum:
                //guessCount++
                //Prompt "Too high! Guess again: "
                //Take in user's input and validate it's a number.
        //Print "You got it in 'guessCount' guesses!"
        //guessCount is set to 0
    }

    public int getGuessCount() {
        //returns guessCount
        return 0;
    }
}
