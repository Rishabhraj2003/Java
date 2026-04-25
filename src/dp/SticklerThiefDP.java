package dp;
import java.util.Arrays;

public class SticklerThiefDP {

    // Recursive function with memoization
    static int maxLoot(int[] houses, int i, int[] dp) {
        // Base case
        if (i >= houses.length) return 0;

        // If already computed, return it
        if (dp[i] != -1) return dp[i];

        // Choice 1: Rob this house and skip next
        int rob = houses[i] + maxLoot(houses, i + 2, dp);

        // Choice 2: Skip this house
        int skip = maxLoot(houses, i + 1, dp);

        // Store the result in dp array
        dp[i] = Math.max(rob, skip);

        return dp[i];
    }

    public static void main(String[] args) {
        int[] houses = {6, 7, 1, 3, 8, 2, 4};
        int n = houses.length;
        int[] dp = new int[n + 1];

        // Initialize dp array with -1 (means not calculated yet)
        Arrays.fill(dp, -1);

        int result = maxLoot(houses, 0, dp);
        System.out.println("Maximum loot possible: " + result);
    }
}

