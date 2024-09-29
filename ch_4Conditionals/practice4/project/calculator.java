
package practice4.project;
import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    double num1 = scanner.nextDouble();

    System.out.println("Enter an operator (+, -, *, /):");
    String operator = scanner.next();

    System.out.println("Enter another number:");
    double num2 = scanner.nextDouble();

    double result = 0;

    switch (operator) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        result = num1 / num2;
        break;
      default:
        System.out.println("Invalid operator!");
        return;
    }

    System.out.println("Result: " + result);
  }
}

