import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> done = new ArrayList<>();

        System.out.println("Welcome to my Todo App");

        while (true) {
            System.out.println();
            System.out.println("1. Add a task");
            System.out.println("2. Mark a task as done");
            System.out.println("3. Show tasks");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter the task: ");
                tasks.add(scanner.nextLine());
                done.add(false);

            } else if (choice.equals("2")) {
                System.out.print("Enter the task number: ");
                try {
                    int number = Integer.parseInt(scanner.nextLine());
                    if (number >= 1 && number <= tasks.size()) {
                        done.set(number - 1, true);
                    } else {
                        System.out.println("No task with that number.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please type a number.");
                }

            } else if (choice.equals("3")) {
                for (int i = 0; i < tasks.size(); i++) {
                    String mark = done.get(i) ? "[x] " : "[ ] ";
                    System.out.println((i + 1) + ". " + mark + tasks.get(i));
                }
                System.out.println("Total tasks: " + tasks.size());

            } else if (choice.equals("4")) {
                break;

            } else {
                System.out.println("Please choose 1, 2, 3 or 4.");
            }
        }
    }
}