package dp2.climbstairs;

import java.util.Arrays;
import java.util.Scanner;

public class dp {

    // Function to count total ways to reach the nth stair using memoization (DP - Top Down)
    public static int countways(int n, int ways[]) {

        // Base case: If you are at stair 0, there is exactly 1 way (do nothing).
        if (n == 0) return 1;

        // If steps become negative, no valid way.
        if (n < 0) return 0;

        // If already computed, directly return to avoid re-calculation
        if (ways[n] != -1) return ways[n];

        // Store the result in DP array: f(n) = f(n-1) + f(n-2)
        ways[n] = countways(n - 1, ways) + countways(n - 2, ways);

        return ways[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the number of stairs
        int n = sc.nextInt();

        // Create DP array initialized with -1 (meaning not computed yet)
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);

        // Print total ways to climb n stairs
        System.out.println(countways(n, ways));

        sc.close();
    }
}
