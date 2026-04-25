package dp;
import java.util.Arrays;

public class UniquePathsDP {

    // Recursive function with memoization
    static int countPaths(int i, int j, int m, int n, int[][] dp) {
        // Base case 1: reached destination
        if (i == m - 1 && j == n - 1)
            return 1;

        // Base case 2: out of grid boundary
        if (i >= m || j >= n)
            return 0;

        // If already computed
        if (dp[i][j] != -1)
            return dp[i][j];

         // Move right and down
        int right = countPaths(i, j + 1, m, n, dp);
        int down = countPaths(i + 1, j, m, n, dp);

        // Store the result and return
        dp[i][j] = right + down;
        return dp[i][j];
    }

    public static void main(String[] args) {
        int m = 3, n = 3; // Grid size
        int[][] dp = new int[m][n];

        // Initialize dp array with -1 (unvisited)
        for (int[] row : dp)
            Arrays.fill(row, -1);

        int totalPaths = countPaths(0, 0, m, n, dp);
        System.out.println("Total unique paths: " + totalPaths);
    }
}
