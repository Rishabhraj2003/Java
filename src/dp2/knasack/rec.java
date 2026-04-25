package dp2.knasack;

public class rec {

    // Recursive 0/1 Knapsack function
    public static int knapsack(int val[], int wt[], int W, int n) {

        // Base case: no items left or no capacity left
        if (W == 0 || n == 0) {
            return 0;
        }

        // Check if the current item (n-1) can be included
        if (wt[n - 1] <= W) {

            // 1. Include the item:
            // Add its value + solve for remaining capacity and items
            int include = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);

            // 2. Exclude the item:
            // Do NOT reduce weight; just move to previous item
            int exclude = knapsack(val, wt, W, n - 1);

            // Return the best of include vs exclude
            return Math.max(include, exclude);
        }
        else {
            // If item is too heavy, you can ONLY exclude it
            return knapsack(val, wt, W, n - 1);
        }
    }

    public static void main(String[] args) {

        int val[] = {15, 14, 10, 45, 30};
        int wt[]  = { 2,  5,  1,  3,  4};
        int W = 7;

        System.out.println("Maximum value = " + knapsack(val, wt, W, val.length));
    }
}
