/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

import java.util.Random;

public class NumberGame {
    private int guessCount = 0;
    private int difficulty;

    private final Solution32 inputter = new Solution32();
    private final Random random = new Random();

    public void setDifficulty() {
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        String response = inputter.takeInput();
        int chosenDifficulty = 0;

        while (chosenDifficulty < 1 || chosenDifficulty > 3) {
            try {
                chosenDifficulty = Integer.parseInt(response);
            }
            catch (NumberFormatException e) {
                System.out.printf("Invalid difficulty!%n");
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                response = inputter.takeInput();
            }
        }
        difficulty = chosenDifficulty;
    }

    public int validateInt(String response) {
        int responseInt;

        while(true) {
            try {
                responseInt = Integer.parseInt(response);
                return responseInt;
            }
            catch (NumberFormatException e) {
                guessCount++;
                System.out.print("Invalid guess! Guess again: ");
                response = inputter.takeInput();
            }
        }
    }

    public int getRandomNumber(int difficulty) {
        //Created to simplify the random number getting process.
        //Returns the chosenNum for the game.
        return random.nextInt((int)(Math.pow(10, difficulty) + 1));
    }

    public void playGame() {
        int chosenNum = getRandomNumber(difficulty);
        int playerGuessNum;
        String response;

        System.out.print("I have my number. What's your guess? ");
        response = inputter.takeInput();
        playerGuessNum = validateInt(response);

        while(playerGuessNum != chosenNum) {
            guessCount++;
            if (playerGuessNum < chosenNum) {
                System.out.print("Too low! Guess again: ");
            }
            else {
                System.out.print("Too high! Guess again: ");
            }
            response = inputter.takeInput();
            playerGuessNum = validateInt(response);
        }
        System.out.printf("You got it in %d guesses!%n%n", guessCount);
        guessCount = 0;
    }

}
