package org.example;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasksList= new ArrayList<>();

    public void addTask(String desc){
        Task newTask = new Task(desc);
        tasksList.add(newTask);
        System.out.println("Task added:" + desc);
    }

    public void removeTask(String desc) {
        for (Task task : tasksList){
            if(task.getDesc().equals(desc)){
                tasksList.remove(task);
                System.out.println("Task removed: " + desc);
                return;
            }
        }
    }
    public void displayTask(){
        if(tasksList.isEmpty()) {
            System.out.println("Task list is empty");
        }else{
            System.out.println("Tasks:");
            int length = 1;
            for (Task task : tasksList) {
                System.out.println(length + ". " + task.getDesc());
                length++;
            }
        }
    }
}
