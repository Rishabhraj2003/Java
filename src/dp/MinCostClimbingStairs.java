package dp;
public class MinCostClimbingStairs {

    // Recursive function to find min cost from index i
    static int minCost(int[] cost, int i) {
        // Base case: If we've reached or passed the last step
        if (i >= cost.length)
            return 0;

        // Recursive relation:
        // Take one step or two steps
        int oneStep = cost[i] + minCost(cost, i + 1);
        int twoStep = cost[i] + minCost(cost, i + 2);

        return Math.min(oneStep, twoStep);
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};

        // We can start from step 0 or step 1
        int result = Math.min(minCost(cost, 0), minCost(cost, 1));
        System.out.println("Minimum cost to reach the top: " + result);
    }
}
