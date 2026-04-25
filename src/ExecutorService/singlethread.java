package ExecutorService;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task class
class PrintTask implements Runnable {
    private final String taskName;

    public PrintTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Step " + i);
        }
        System.out.println(taskName + " Completed!");
    }
}


public class singlethread {
    public static void main(String[] args) {
        // Create a single-threaded executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Create tasks
        Runnable task1 = new PrintTask("Task 1");
        Runnable task2 = new PrintTask("Task 2");
        Runnable task3 = new PrintTask("Task 3");

        System.out.println("Submitting tasks to single-thread executor...");

        // Submit tasks (will run one by one)
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);

        // Shutdown executor
        executor.shutdown();

        System.out.println("All tasks submitted. Executor will shut down after completing them.");
    }
}

