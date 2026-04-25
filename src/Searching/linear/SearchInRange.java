package Searching.linear;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Input range (start and end index)
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Validate range
        if (start < 0 || end >= n || start > end) {
            System.out.println("Invalid range!");
            sc.close();
            return;
        }

        // Linear search in range
        boolean found = false;
        for (int i = start; i <= end; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break; // stop after first match
            }
        }

        if (!found) {
            System.out.println("Element not found in the given range.");
        }

        sc.close();
    }
}
