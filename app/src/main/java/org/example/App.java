package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Todo list = new Todo();
    Scanner scanner = new Scanner(System.in);

    while(true){
    //Interface for User
      System.out.println("\n|----------ToDo-Option----------|");
      System.out.println("Welcome to the ToDo List!");
      System.out.println("What Would you like to do?\n");
      System.out.println("A) Add new task");
      System.out.println("B) Mark task as complete");
      System.out.println("C) View all task");
      System.out.println("D) Display only complete task");
      System.out.println("E) Display only incomplete task");
      System.out.println("F) Clear all task");
      System.out.println("G) Exit");

      System.out.print("User input: ");
      char input = scanner.next().charAt(0);
      scanner.nextLine();

      //handle both uppercase and lowercase
      input = Character.toUpperCase(input);

      switch(input){
        case 'A': //Add new task
          System.out.print("\nEnter: ");
          String A = scanner.nextLine();
          list.add(A);
          break;

        case 'B': //Mark Task as complete
          System.out.print("Enter a task to mark as complete: ");
          String ToComplete = scanner.nextLine();
          list.markComplete(ToComplete);
          break;

        case 'C': //View all task
          list.all();
          break;

        case 'D': //Display Complete
          list.complete();
          break;

        case 'E': //Display Incomplete
          list.incomplete();
          break;

        case 'F': //Clear ALL
          list.clear();
          break;

        case 'G': //Exit Program
          System.out.println("Exiting program....");
          System.exit(0);
        break;

        default:
          System.out.println("Invalid input. Please choose a valid option.");
      }
    }
  }

}
