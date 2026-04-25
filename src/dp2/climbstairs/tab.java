
package dp2.climbstairs;
import  java.util.*;
public class tab {
    public static int countWays(int n) {

        // dp[i] will store the number of ways to reach step i
        int dp[] = new int[n + 1];

        // Base cases
        dp[0] = 1;  // 1 way to stay on step 0
        if (n >= 1) dp[1] = 1; // 1 way to reach step 1

        // Fill the table from 2 to n
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n]; // Final answer
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(countWays(n));

        sc.close();
    }
}
