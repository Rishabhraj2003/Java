package Backtracking;

import java.util.Scanner;

public class mazepathblock1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();

        // ✅ Create a grid for blocks
        boolean[][] blocked = new boolean[rows + 1][cols + 1];

        // 🧱 Example: set some blocks (you can modify these)
        // true = blocked cell
        blocked[2][2] = true; // block cell (2,2)
        blocked[3][1] = true; // block cell (3,1)

        System.out.println("All possible paths avoiding blocks:");
        print(1, 1, rows, cols, "", blocked);
    }

    // 🔁 Recursive function to print all paths (Down, Right only)
    private static void print(int r, int c, int rows, int cols, String path, boolean[][] blocked) {
        // 🚫 Out of bounds
        if (r > rows || c > cols) return;

        // 🚫 Blocked cell
        if (blocked[r][c]) return;

        // 🎯 Reached destination
        if (r == rows && c == cols) {
            System.out.println(path);
            return;
        }

        // ⬇️ Move Down
        print(r + 1, c, rows, cols, path + "D", blocked);

        // ➡️ Move Right
        print(r, c + 1, rows, cols, path + "R", blocked);
    }
}
