package Searching.binary;
import java.util.Scanner;
import java.util.Arrays;

public class onedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array (required for binary search)
        Arrays.sort(arr);

        // Element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Binary search
        int left = 0, right = n - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoid overflow

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
