package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<String> content = new ArrayList<>();
    Path filePath = Paths.get("ToDoAppFile.txt");




    public void listTask(String filename) {
        try {
            content = Files.readAllLines(filePath);
            if (content.isEmpty()) {
                System.out.println("No todos for today! :)");
            }
        } catch (IOException ex) {
            System.out.println("Unable to read file: ToDoAppFile.txt");
        }

        for (int i = 0; i < content.size(); i++) {
            System.out.println(i + 1 + content.get(i));
        }
    }

    public void addTask(String name) {
        try {
            content = Files.readAllLines(filePath);
            content.add(" [ ] " + name);
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Unable to write to file: ToDoAppFile.txt");
        }

    }

    public String removeTask(int numberOfTask) {
        try {
            content = Files.readAllLines(filePath);
            content.remove(numberOfTask);
            Files.write(filePath, content);
            return "task " + (numberOfTask - 1) + " removed";
        } catch (Exception e) {
            System.out.println("Unable to remove: no index provided");
        }
        return "Unable to remove the task number " + (numberOfTask - 1);
    }

        //System.out.println("apples".substring(3)); -> les
        public String completeTask(int numberOfCompletedTask) {
            try {
                content = Files.readAllLines(filePath);
                content.set(numberOfCompletedTask, " [x" + content.get(numberOfCompletedTask).substring(3));
                Files.write(filePath, content);
                return "Task " + (numberOfCompletedTask - 1) + " completed";
            } catch (Exception e) {
                System.out.println("Unable to do changes in the file");
            }
            return "Nope";
        }

    }



/*

Command Line Todo application
=============================

Command line arguments:
 -l   Lists all the tasks
 -a   Adds a new task
 -r   Removes a task
 -c   Completes a task
 */