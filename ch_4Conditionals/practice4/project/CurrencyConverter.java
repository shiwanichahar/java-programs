package practice4.project;


import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
  private static Map<String, Double> rates = new HashMap<>();

  static {
    rates.put("USD", 1.0);
    rates.put("EUR", 0.84);
    rates.put("JPY", 110.25);
    rates.put("GBP", 0.76);
    rates.put("AUD", 1.38);
    // add more currency rates here
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the currency converter!");

    while (true) {
      System.out.println("Enter the amount of money you want to convert:");
      double amount = scanner.nextDouble();

      System.out.println("Enter the currency you want to convert from (USD, EUR, JPY, etc.):");
      String fromCurrency = scanner.next();

      System.out.println("Enter the currency you want to convert to (USD, EUR, JPY, etc.):");
      String toCurrency = scanner.next();

      double result = convert(amount, fromCurrency, toCurrency);

      System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, result, toCurrency);

      System.out.println("Do you want to convert another amount? (yes/no)");
      String response = scanner.next();
      if (!response.equalsIgnoreCase("yes")) {
        break;
      }
    }
  }

  public static double convert(double amount, String fromCurrency, String toCurrency) {
    double rate = rates.get(fromCurrency) / rates.get(toCurrency);
    return amount * rate;
  }
}
