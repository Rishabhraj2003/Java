package Searching.linear;
import java.util.*;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of 2D array
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Linear search in 2D array
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at position: Row " + i + ", Column " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
