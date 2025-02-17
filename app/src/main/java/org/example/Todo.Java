package org.example;

import org.example.Todo;
import java.util.ArrayList; 

public class Todo {
    private ArrayList<Task> list = new ArrayList<>();

    //adding new task
    void add(String newtask){
        Task task = new Task(newtask);
        list.add(task);
    }

    //Complete a task
    void complete(String newtask){
        for (Task task : list){
            if(task.name.equals(newtask) && !task.complete){
                task.complete();
                return;
            }
        }
        else{System.out.println("Task not found or completed");}
    }

    void all(){
        if(list.isEmpty()){
            System.out.println("The list is empty...");
        }

        for (Task task : list){
            System.out.println(task);
        }
    }

    void complete(){
    boolean present = false;

        for (Task task : list){
            if(task.complete){
                System.out.println(task);
                present = true;
            }
        }
        if(!present){
            System.out.println("No task found");
        }
    }

    void incomplete(){
    boolean present = false;

        for (Task task : list){
            if(!task.complete){
                System.out.println(task);
                present = true;
            }
        }
        if(!present){
            System.out.println("No task found");
        }
    }

    void clear(){
        list.clear();
    }
}