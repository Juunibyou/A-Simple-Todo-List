package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Todo list = new Todo();
      
      // Add tasks
      list.add("Buy milk");
      list.add("Buy eggs");
      list.add("Prepare a lesson for CSC 122");
      list.add("Sow beet seeds");

      // Mark task as completed
      list.complete("Buy eggs");
      
      // Show all tasks
      System.out.println("All tasks:");
      list.all();
      
      // Show completed tasks
      System.out.println("\nCompleted tasks:");
      list.complete();
      
      // Show incomplete tasks
      System.out.println("\nIncomplete tasks:");
      list.incomplete();
      
      // Clear the to-do list
      list.clear();
      
      // Show all tasks again (should be empty)
      System.out.println("\nAfter clearing, all tasks:");
      list.all();
  }

}
