package Backtracking;

import java.util.Scanner;

public class mazepath4way {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns ");
        int cols = sc.nextInt();

        boolean[][] is_visited = new boolean[rows + 1][cols + 1];
        // ✅ using rows+1, cols+1 since we're using 1-based indexing

        print(1, 1, rows, cols, "", is_visited);
    }

    // 🔁 Recursive function to print all paths (4 directions)
    private static void print(int r, int c, int rows, int cols, String path, boolean[][] is_visited) {

        // 🚫 Out of bounds
        if (r < 1 || c < 1 || r > rows || c > cols) return;

        // 🚫 Already visited
        if (is_visited[r][c]) return;

        // 🎯 Reached destination
        if (r == rows && c == cols) {
            System.out.println(path);
            return;
        }

        // ✅ Mark current cell visited
        is_visited[r][c] = true;

        // ⬇️ Move Down
        print(r + 1, c, rows, cols, path + "D", is_visited);

        // ➡️ Move Right
        print(r, c + 1, rows, cols, path + "R", is_visited);

        // ⬅️ Move Left
        print(r, c - 1, rows, cols, path + "L", is_visited);

        // ⬆️ Move Up
        print(r - 1, c, rows, cols, path + "U", is_visited);

        // 🔙 Backtrack (unmark)
        is_visited[r][c] = false;
    }
}
