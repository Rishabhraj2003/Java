package dp2.lcs;

import java.util.Scanner;

public class tab {

    // Tabulation method for LCS (Bottom-Up DP)
    public static int lcsTabulation(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();

        // Create DP table (n+1 x m+1)
        int[][] dp = new int[n + 1][m + 1];

        // Build the DP table from top-left to bottom-right
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                // If characters match, add 1 to diagonal value
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // If no match, take the maximum from top or left cell
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The last cell contains the LCS length
        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.next();

        System.out.println("Enter the second string:");
        String str2 = sc.next();

        System.out.println("Length of LCS (Tabulation): " +
                lcsTabulation(str1, str2));
    }
}
