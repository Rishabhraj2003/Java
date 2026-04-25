package Backtracking;

import java.util.Scanner;

public class mazepathblock2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        // ✅ Create grid for blocks
        boolean[][] blocked = new boolean[rows + 1][cols + 1];

        // 🧱 Example blocks (true = blocked)
        blocked[2][2] = true; // block cell (2,2)
        blocked[3][1] = true; // block cell (3,1)

        // ✅ Create visited matrix to avoid cycles
        boolean[][] visited = new boolean[rows + 1][cols + 1];

        System.out.println("All possible paths avoiding blocks:");
        print(1, 1, rows, cols, "", blocked, visited);
    }

    // 🔁 Recursive function to print all paths (U, D, L, R)
    private static void print(int r, int c, int rows, int cols, String path,
                              boolean[][] blocked, boolean[][] visited) {

        // 🚫 Out of bounds
        if (r < 1 || c < 1 || r > rows || c > cols) return;

        // 🚫 Blocked cell
        if (blocked[r][c]) return;

        // 🚫 Already visited
        if (visited[r][c]) return;

        // 🎯 Reached destination
        if (r == rows && c == cols) {
            System.out.println(path);
            return;
        }

        // ✅ Mark current cell as visited
        visited[r][c] = true;

        // ⬇️ Move Down
        print(r + 1, c, rows, cols, path + "D", blocked, visited);

        // ➡️ Move Right
        print(r, c + 1, rows, cols, path + "R", blocked, visited);

        // ⬅️ Move Left
        print(r, c - 1, rows, cols, path + "L", blocked, visited);

        // ⬆️ Move Up
        print(r - 1, c, rows, cols, path + "U", blocked, visited);

        // 🔙 Backtrack (unmark)
        visited[r][c] = false;
    }
}
