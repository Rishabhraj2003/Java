package threading.threadinterface;

public class main implements Runnable {

    private String taskName;

    // Constructor
    public main(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        // Simple task
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Step " + i);
        }
    }

    public static void main(String[] args) {
        // Create runnable objects
        main task1 = new main("Task 1");
        main task2 = new main("Task 2");
        main task3 = new main(" Task 3");

        // Create Thread objects and pass runnable
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        // Start threads
        System.out.println("Starting threads...");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main method completed!");
    }
}
