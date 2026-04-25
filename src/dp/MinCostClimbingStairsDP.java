package dp;
import java.util.Arrays;

public class MinCostClimbingStairsDP {

    // Recursive function with memoization
    static int minCost(int[] cost, int i, int[] dp) {
        // Base case: if beyond last step
        if (i >= cost.length)
            return 0;

        // If already computed
        if (dp[i] != -1)
            return dp[i];

        // Recursive relation
        int oneStep = cost[i] + minCost(cost, i + 1, dp);
        int twoStep = cost[i] + minCost(cost, i + 2, dp);

        // Store and return the result
        return dp[i] = Math.min(oneStep, twoStep);
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        int n = cost.length;
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1); // Initialize dp array with -1

        int result = Math.min(minCost(cost, 0, dp), minCost(cost, 1, dp));
        System.out.println("Minimum cost to reach the top: " + result);
    }
}
