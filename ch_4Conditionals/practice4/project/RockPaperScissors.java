package practice4.project;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Let's play Rock Paper Scissors!");
    System.out.println("Enter your choice (rock/paper/scissors):");

    String userChoice = scanner.next().toLowerCase();

    String[] choices = {"rock", "paper", "scissors"};
    String computerChoice = choices[random.nextInt(choices.length)];

    System.out.println("Computer chose: " + computerChoice);

    if (userChoice.equals(computerChoice)) {
      System.out.println("It's a tie!");
    } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
               (userChoice.equals("paper") && computerChoice.equals("rock")) ||
               (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
      System.out.println("You win!");
    } else {
      System.out.println("Computer wins!");
    }
  }
}
