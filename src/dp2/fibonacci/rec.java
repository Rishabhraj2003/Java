package dp2.fibonacci;

public class rec {
    static int fibonacci(int n) {
        if (n == 0)   // Base case 1
            return 0;
        if (n == 1)   // Base case 2
            return 1;

        // Recursive relation
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Example: find first 10 Fibonacci numbers

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
