package dp2.catalan;
public class tab{

    public static long catalan(int n) {
        long[] dp = new long[n + 1];

        // Base cases
        dp[0] = 1;
        dp[1] = 1;

        // Fill the table bottom-up
        for (int i = 2; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 20; // Example
        System.out.println("Catalan number C(" + n + ") = " + catalan(n));
    }
}
