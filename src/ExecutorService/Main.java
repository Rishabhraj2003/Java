package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintRunnable implements Runnable {
    private final char targetChar;

    public PrintRunnable(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.printf("%d:%c ", i, targetChar);
        }
        System.out.printf("\n%c Task Done\n", targetChar);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a single-threaded executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Create task
        Runnable task = new PrintRunnable('R');

        // Submit task
        executor.submit(task);

        // Shutdown executor
        executor.shutdown();
    }
}
