import java.util.ArrayList;

public class TodoApp {
    public static void main(String[] args) {
        System.out.println("Welcome to my Todo App");

        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Learn Git");
        tasks.add("Build a todo app");

        for (String task : tasks) {
            System.out.println("- " + task);
        }
        System.out.println("Total tasks: " + tasks.size());
    }
}