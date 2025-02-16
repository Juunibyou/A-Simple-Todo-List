package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the ToDo List!");
    System.out.println("What Would you like to do?\n");

    System.out.println("A) Add new task");
    System.out.println("B) Mark task as complete");
    System.out.println("C) View all task");
    System.out.println("D) Display only complete task");
    System.out.println("E) Display only incomplete task");
    System.out.println("F) Clear all task");

    Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.println("User input: ");
      char input = scanner.next().charAt(0);

      switch(input){
        case 'A': //Add new task
          System.out.print("Enter new task: ");
          String A = scanner.nextLine();
          TaskList.add(A);
          break;

        case 'B': //Mark Task as complete
          System.out.print("Enter a task to mark as complete: ");
          String ToComplete = scanner.nextLine();
          TaskList.markCOMPLETE(ToComplete);
          break;

        case 'C': //View all task
          TaskList.displayALL();
          break;

        case 'D': //Display Complete
          TaskList.displayCOMPLETE();
          break;

        case 'E': //Display Incomplete
          TaskList.displayINCOMPLETE();
          break;

        case 'F': //Clear ALL
          TaskList.clearALL();
          break;
        
        default:
          System.out.println("Invalid input. Please choose a valid option.");
      }
    
    }
  }

}
