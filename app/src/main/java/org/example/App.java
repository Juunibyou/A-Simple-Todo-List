package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Todo list = new Todo();
    Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.println("Welcome to the ToDo List!");
      System.out.println("What Would you like to do?\n");
      System.out.println("A) Add new task");
      System.out.println("B) Mark task as complete");
      System.out.println("C) View all task");
      System.out.println("D) Display only complete task");
      System.out.println("E) Display only incomplete task");
      System.out.println("F) Clear all task");
      System.out.println("G) Exit");

      System.out.println("User input: ");
      char input = scanner.next().charAt(0);
      scanner.nextLine();

      switch(input){
        case 'A': //Add new task
          System.out.print("Enter: ");
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

      // // Add tasks
      // list.add("Buy milk");
      // list.add("Buy eggs");
      // list.add("Prepare a lesson for CSC 122");
      // list.add("Sow beet seeds");

      // // Mark task as completed
      // list.complete("Buy eggs");
      
      // // Show all tasks
      // System.out.println("All tasks:");
      // list.all();
      
      // // Show completed tasks
      // System.out.println("\nCompleted tasks:");
      // list.complete();
      
      // // Show incomplete tasks
      // System.out.println("\nIncomplete tasks:");
      // list.incomplete();
      
      // // Clear the to-do list
      // list.clear();
      
      // // Show all tasks again (should be empty)
      // System.out.println("\nAfter clearing, all tasks:");
      // list.all();
  }

}
