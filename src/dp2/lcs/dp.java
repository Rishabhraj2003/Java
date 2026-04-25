package dp2.lcs;

import java.util.Scanner;

public class dp  {

    // Memoized LCS function
    public static int lcs(String str1, String str2, int n, int m, int[][] dp) {

        // Base case: if either string length becomes 0
        if (n == 0 || m == 0) {
            return 0;
        }

        // If value already computed, return it
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        // If last characters match, include this character and move both indices
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            dp[n][m] = 1 + lcs(str1, str2, n - 1, m - 1, dp);
        } else {
            // If last characters don't match, try two possibilities:
            // 1) Remove last char of str1
            // 2) Remove last char of str2
            // Take the maximum of the two
            int option1 = lcs(str1, str2, n - 1, m, dp);
            int option2 = lcs(str1, str2, n, m - 1, dp);
            dp[n][m] = Math.max(option1, option2);
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.println("Enter the first string:");
        String str1 = sc.next();

        System.out.println("Enter the second string:");
        String str2 = sc.next();

        int n = str1.length();
        int m = str2.length();

        // Create DP array and fill with -1 (meaning uncomputed)
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }

        // Compute and print LCS
        System.out.println("Length of LCS (Memoized): " + lcs(str1, str2, n, m, dp));
    }
}
