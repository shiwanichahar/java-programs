
package practice4.project;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
  private static ArrayList<String> tasks = new ArrayList<>();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("To-Do List");
      System.out.println("1. Add task");
      System.out.println("2. View tasks");
      System.out.println("3. Delete task");
      System.out.println("4. Exit");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter task:");
          String task = scanner.next();
          tasks.add(task);
          break;
        case 2:
          System.out.println("Tasks:");
          for (String tasks : tasks) {
            System.out.println(tasks);
          }
          break;
        case 3:
          System.out.println("Enter task number to delete:");
          int taskNumber = scanner.nextInt() - 1;
          tasks.remove(taskNumber);
          break;
        case 4:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice!");
      }
    }
  }
}

