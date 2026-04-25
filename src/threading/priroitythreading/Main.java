package threading.priroitythreading;

public class Main implements Runnable {
    private String taskName;

    // Constructor
    public Main(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        // Simple task
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Step " + i);
        }
        System.out.println(taskName + " finished!");
    }

    public static void main(String[] args) {
        // Create runnable objects
        Main task1 = new Main("Low Priority Task");
        Main task2 = new Main("Normal Priority Task");
        Main task3 = new Main("High Priority Task");

        // Create Thread objects and pass Runnable
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        // Set priorities
        t1.setPriority(Thread.MAX_PRIORITY);   // 10
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MIN_PRIORITY);   // 1

        // Start threads
        System.out.println("Starting threads with different priorities...\n");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("\nMain method completed!");
    }
}
