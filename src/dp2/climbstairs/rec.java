package dp2.climbstairs;

import java.util.Scanner;

public class rec {

    // Function to count number of ways to reach the top
    public static int countways(int n) {

        // Base case: If exactly at step 0 → 1 valid way (stay there)
        if(n == 0) return 1;

        // Base case: If n becomes negative → no possible way
        if(n < 0) return 0;

        // Recursive relation:
        // From step n, you can come from:
        // - n-1 (taking 1 step)
        // - n-2 (taking 2 steps)
        return countways(n - 1) + countways(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        // Print total ways
        System.out.println("Total ways to climb = " + countways(n));
    }
}
