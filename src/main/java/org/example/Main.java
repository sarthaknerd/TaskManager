package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();


        taskManager.addTask("Study");
        taskManager.addTask("Code");
        taskManager.displayTask();
        taskManager.removeTask("Study");

    }
}