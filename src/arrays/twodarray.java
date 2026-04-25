package arrays;
import java.util.*;
public class twodarray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Define a 2x3 2D array
    int[][] arr = new int[2][3];

    // Input elements
        System.out.println("Enter elements for 2x3 array:");
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("Element [" + i + "][" + j + "]: ");
            arr[i][j] = sc.nextInt();
        }
    }

    // Display array
        System.out.println("\nArray elements:");
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }

    // Search element
        System.out.print("\nEnter element to search: ");
    int key = sc.nextInt();
    boolean found = false;
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            if (arr[i][j] == key) {
                System.out.println("Element found at [" + i + "][" + j + "]");
                found = true;
            }
        }
    }
        if (!found) {
        System.out.println("Element not found.");
    }

    // Update element
        System.out.print("\nEnter row and column to update (0-based index): ");
    int row = sc.nextInt();
    int col = sc.nextInt();
        if (row >= 0 && row < 2 && col >= 0 && col < 3) {
        System.out.print("Enter new value: ");
        arr[row][col] = sc.nextInt();
        System.out.println("Element updated.");
    } else {
        System.out.println("Invalid position.");
    }

    // Delete element (set to 0)
        System.out.print("\nEnter row and column to delete: ");
    int drow = sc.nextInt();
    int dcol = sc.nextInt();
        if (drow >= 0 && drow < 2 && dcol >= 0 && dcol < 3) {
        arr[drow][dcol] = 0;
        System.out.println("Element deleted (set to 0).");
    } else {
        System.out.println("Invalid position.");
    }

    // Final array
        System.out.println("\nFinal array:");
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }

        sc.close();
}
}
