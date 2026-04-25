package dp2;

public class commonsubstring {

    public static int longestcommonsubstring(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];

        int ans = 0; // to store the longest length

        // Initialize first row and first column
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }

        // DP computation
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                // If characters match, increase length
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    ans = Math.max(ans, dp[i][j]);
                }
                else {
                    dp[i][j] = 0; // reset because substring must be continuous
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abfce";
        System.out.println("Longest Common Substring length = " + longestcommonsubstring(s1, s2));
    }
}
