package dp2.knasack;

public class dp {
    // Memo table: dp[n][W]
    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]) {

        // Base case
        if (W == 0 || n == 0) {
            return 0;
        }

        // If already computed → return stored value
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        // If current item can be included
        if (wt[n - 1] <= W) {

            // Include
            int include = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1, dp);

            // Exclude
            int exclude = knapsack(val, wt, W, n - 1, dp);

            // Store best result
            dp[n][W] = Math.max(include, exclude);
        }
        else {
            // Too heavy → skip item
            dp[n][W] = knapsack(val, wt, W, n - 1, dp);
        }

        return dp[n][W];
    }

    public static void main(String[] args) {

        int val[] = {15, 14, 10, 45, 30};
        int wt[]  = { 2,  5,  1,  3,  4};
        int W = 7;
        int n = val.length;

        // Create dp array
        int dp[][] = new int[n + 1][W + 1];

        // Initialize dp array with -1
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Maximum value = " + knapsack(val, wt, W, n, dp));
    }
}
