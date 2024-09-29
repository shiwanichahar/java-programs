package practice4.project;


import java.util.Scanner;
import java.util.ArrayList;

public class NumberGuessingGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberToGuess = (int) (Math.random() * 100) + 1;
    int numberOfTries = 0;
    int maxTries = 6;
    ArrayList<Integer> previousGuesses = new ArrayList<>();

    while (true) {
      System.out.println("Guess a number between 1 and 100 (or type 'quit' to stop playing):");
      String input = scanner.next();

      if (input.equalsIgnoreCase("quit")) {
        System.out.println("Thanks for playing!");
        break;
      }

      int guess = Integer.parseInt(input);
      numberOfTries++;

      if (previousGuesses.contains(guess)) {
        System.out.println("You already guessed that number! Try again.");
        continue;
      }

      previousGuesses.add(guess);

      if (guess == numberToGuess) {
        System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
        break;
      } else if (guess < numberToGuess) {
        System.out.println("Your guess is too low. Try again!");
      } else {
        System.out.println("Your guess is too high. Try again!");
      }

      if (numberOfTries >= maxTries) {
        System.out.println("Sorry, you ran out of tries! The number was " + numberToGuess + ".");
        break;
      }

      if (numberOfTries == maxTries - 2) {
        System.out.println("Hint: the number is higher than " + (numberToGuess - 10) + ".");
      }
    }
  }
}

