package dp2.sumofsubset;

public class rec {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int k = 9;

        boolean result = subsetSum(arr, arr.length - 1, k);
        System.out.println("Subset with sum " + k + " exists: " + result);
    }

    // 0/1 Knapsack style recursive function
    static boolean subsetSum(int[] arr, int index, int target) {

        // Base conditions
        if (target == 0)
            return true;

        if (index < 0)
            return false;

        // If current element is greater than target, skip it
        if (arr[index] > target)
            return subsetSum(arr, index - 1, target);

        // Choices: include or exclude the current element
        boolean include = subsetSum(arr, index - 1, target - arr[index]);
        boolean exclude = subsetSum(arr, index - 1, target);

        return include || exclude;
    }
}
