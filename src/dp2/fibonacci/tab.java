package dp2.fibonacci;

public class tab {

        public static int fib(int n) {

            // Create DP array
            int[] dp = new int[n + 1];

            // Base cases
            dp[0] = 0;
            if (n > 0) dp[1] = 1;

            // Fill the table bottom-up
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }

        public static void main(String[] args) {
            int n = 5;
            System.out.println(fib(n));  // Output: 5
        }
    }

