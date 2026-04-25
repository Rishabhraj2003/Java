package Backtracking;

import java.util.Scanner;

public class MazePathPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns ");
        int cols = sc.nextInt();
        print(1, 1, rows, cols, "");
    }

    // 🔁 Recursive function to print all paths
    private static void print(int r, int c, int rows, int cols, String path) {

        // 🚫 Out of bounds
        if (r > rows || c > cols) return;

        // 🎯 Reached destination
        if (r == rows && c == cols) {
            System.out.println(path);
            return;
        }

        // ⬇️ Move Down
        print(r + 1, c, rows, cols, path + "D");

        // ➡️ Move Right
        print(r, c + 1, rows, cols, path + "R");
    }
}
