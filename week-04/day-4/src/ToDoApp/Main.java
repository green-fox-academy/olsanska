package toDoApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (run()) {
        }
    }

    public static boolean run() {
        TaskManager task = new TaskManager();

        System.out.println("\nCommand Line Todo application\n" +
                "=============================\n");
        String menu = "Command line arguments:\n" +
                " -l   Lists all the tasks\n" +
                " -a   Adds a new task\n" +
                " -r   Removes a task\n" +
                " -c   Completes a task\n" +
                " -q   Quit the app\n" +
                "What do you wanna do?";
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("-l")) {

            task.listTask("ToDoAppFile.txt");

        } else if (input.equals("-a")) {

            System.out.println("Name your new task: ");
            String newTaskString = scanner.nextLine();
            System.out.println("Name of your new task: " + newTaskString);
            task.addTask(newTaskString);
            System.out.println("\n" + menu);

        } else if (input.equals("-r")) {

            System.out.println("Write a number of the task you want to remove: ");
            int numberOfTask = scanner.nextInt();
            System.out.println(task.removeTask(numberOfTask - 1));

        } else if (input.equals("-c")) {
            System.out.println("Write a number of the task you've completed: ");
            int numberOfCompletedTask = scanner.nextInt();
            System.out.println(task.completeTask(numberOfCompletedTask - 1));

        } else if (input.equals("-q")) {
            return false;
        } else {
            System.out.println("Not a legit command. Use one from the menu, please");
        }
        return true;
    }
}

