package dp2.knasack;

public class tab {

    public static int knapsack(int val[], int wt[], int W) {

        int n = val.length;

        // Create DP table: (n+1) x (W+1)
        int dp[][] = new int[n + 1][W + 1];

        // dp[i][j] = max value using first i items with capacity j

        // Fill the table
        for (int i = 1; i <= n; i++) {          // items
            for (int j = 1; j <= W; j++) {      // capacities

                // If item weight <= current capacity j → include or exclude
                if (wt[i - 1] <= j) {

                    int include = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    int exclude = dp[i - 1][j];

                    dp[i][j] = Math.max(include, exclude);
                }
                else {
                    // Too heavy → exclude
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];  // Bottom-right cell = final answer
    }


    public static void main(String[] args) {

        int val[] = {15, 14, 10, 45, 30};
        int wt[]  = { 2,  5,  1,  3,  4};
        int W = 7;

        System.out.println("Maximum value = " + knapsack(val, wt, W));
    }

}
