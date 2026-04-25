package arrays;
import  java.util.*;
public class implementation {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[3]; // fixed-size array
    int size = 0; // current number of elements

    // Insert elements
        System.out.println("Enter 3 elements:");
        for (int i = 0; i < 3; i++) {
        arr[i] = sc.nextInt();
        size++;
    }

    // Display elements
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
        System.out.print(arr[i] + " ");
    }
        System.out.println();

    // Search element
        System.out.print("Enter element to search: ");
    int search = sc.nextInt();
    boolean found = false;
        for (int i = 0; i < size; i++) {
        if (arr[i] == search) {
            System.out.println("Element found at index " + i);
            found = true;
            break;
        }
    }
        if (!found) {
        System.out.println("Element not found.");
    }

    // Update element
        System.out.print("Enter index to update (0-2): ");
    int idx = sc.nextInt();
        if (idx >= 0 && idx < size) {
        System.out.print("Enter new value: ");
        arr[idx] = sc.nextInt();
        System.out.println("Element updated.");
    } else {
        System.out.println("Invalid index.");
    }

    // Delete element (by shifting)
        System.out.print("Enter index to delete (0-2): ");
    int del = sc.nextInt();
        if (del >= 0 && del < size) {
        for (int i = del; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Element deleted.");
    } else {
        System.out.println("Invalid index.");
    }

    // Final array
        System.out.println("Final array:");
        for (int i = 0; i < size; i++) {
        System.out.print(arr[i] + " ");
    }

        sc.close();
}
}
