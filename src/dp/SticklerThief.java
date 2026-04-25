package dp;
public class SticklerThief {

    // Recursive function to find maximum loot
    static int maxLoot(int[] houses, int i) {
        // Base cases
        if (i >= houses.length) return 0; // No houses left to rob

        // Choice 1: Rob this house and skip next
        int rob = houses[i] + maxLoot(houses, i + 2);

        // Choice 2: Skip this house
        int skip = maxLoot(houses, i + 1);

        // Return the maximum of both choices
        return Math.max(rob, skip);
    }

    public static void main(String[] args) {
        int[] houses = {6, 7, 1, 3, 8, 2, 4};
        int result = maxLoot(houses, 0);
        System.out.println("Maximum loot possible: " + result);
    }
}
