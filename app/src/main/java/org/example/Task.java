package org.example;
public class Task {
    String name;
    boolean complete;

    //Default incomplete
    public Task(String task){
        this.name = task;
        this.complete = false;
    }

    //Mark Complete
    public void complete() {
        complete = true;
    }

    @Override
    public String toString() {
        return (complete ? "[Completed] " : "[Incomplete] ") + name;
    }
}
