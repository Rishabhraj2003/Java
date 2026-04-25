package dp2.fibonacci;

import java.util.Arrays;

public class dp {
    static int fibonacci(int n, int[] dp) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // If already calculated, return from dp array
        if (dp[n] != -1)
            return dp[n];

        // Store the result and return
        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10; // Example
        int[] dp = new int[n + 1];

        // Initialize dp array with -1 (means not calculated yet)
        Arrays.fill(dp, -1);

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i, dp) + " ");
        }
    }

}
