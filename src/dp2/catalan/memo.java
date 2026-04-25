package dp2.catalan;
import java.util.Arrays;

public class memo{

    // Memoization array
    static long[] dp;

    // Recursive function with memoization
    public static long catalan(int n) {
        // If value already computed, return it
        if (dp[n] != -1)
            return dp[n];

        long result = 0;

        for (int i = 0; i < n; i++) {
            result += catalan(i) * catalan(n - 1 - i);
        }

        dp[n] = result; // store computed result
        return result;
    }

    public static void main(String[] args) {
        int n = 20;  // Example

        dp = new long[n + 1];
        Arrays.fill(dp, -1);

        // Base cases
        dp[0] = 1;
        dp[1] = 1;

        System.out.println("Catalan number C(" + n + ") = " + catalan(n));
    }
}
