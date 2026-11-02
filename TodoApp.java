import java.util.ArrayList;

public class TodoApp {
    public static void main(String[] args) {
        System.out.println("Welcome to my Todo App");

        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> done = new ArrayList<>();

        tasks.add("Learn Git");
        done.add(false);
        tasks.add("Build a todo app");
        done.add(false);

        // Mark the first task as done
        done.set(0, true);

        for (int i = 0; i < tasks.size(); i++) {
            String mark = done.get(i) ? "[x] " : "[ ] ";
            System.out.println(mark + tasks.get(i));
        }

        System.out.println("Total tasks: " + tasks.size());
    }
}