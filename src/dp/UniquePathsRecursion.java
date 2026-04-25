package dp;
public class UniquePathsRecursion {

    // Recursive function to count unique paths
    static int countPaths(int i, int j, int m, int n) {
        // Base case 1: reached destination
        if (i == m - 1 && j == n - 1)
            return 1;

        // Base case 2: out of grid boundary
        if (i >= m || j >= n)
            return 0;

        // Move right and down
        int right = countPaths(i, j + 1, m, n);
        int down = countPaths(i + 1, j, m, n);

        // Total paths from this cell
        return right + down;
    }

    public static void main(String[] args) {
        int m = 3, n = 3; // Grid size
        int totalPaths = countPaths(0, 0, m, n);
        System.out.println("Total unique paths: " + totalPaths);
    }
}
