package dp2.coinexchange;

public class tab {

    // Function to count ways to make 'sum' using unlimited coins
    public static int coinchanfge(int coins[], int sum) {

        int n = coins.length;

        // Create DP table of size (n+1) x (sum+1)
        int dp[][] = new int[n + 1][sum + 1];

        // ------------------------
        // BASE CASES
        // ------------------------

        // If sum = 0 -> There is always exactly 1 way (choose nothing)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // If we have 0 coins but sum > 0 -> No way to form the sum
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = 0;
        }

        // ------------------------
        // FILL DP TABLE
        // dp[i][j] = number of ways to make sum 'j' using first 'i' coins
        // ------------------------

        for (int i = 1; i <= n; i++) {               // Loop over coins
            for (int j = 1; j <= sum; j++) {         // Loop over possible sums

                // If coin value is <= current sum j, we have 2 choices:
                if (coins[i - 1] <= j) {

                    // 1) Include the coin -> stay in same row (i), reduce sum
                    // 2) Exclude the coin -> move to previous row (i-1)
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                }
                else {
                    // If coin value is greater than sum j, we cannot include it
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Answer stored at dp[n][sum]
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        int sum = 4;

        // Print number of ways
        System.out.println(coinchanfge(coins, sum));
    }
}
