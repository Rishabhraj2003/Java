package arrays.quetions;
import java.util.*;
public class swapelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input positions to swap
        System.out.print("Enter index 1 to swap: ");
        int i1 = sc.nextInt();

        System.out.print("Enter index 2 to swap: ");
        int i2 = sc.nextInt();

        // Validate indices
        if (i1 >= 0 && i1 < n && i2 >= 0 && i2 < n) {
            // Swap
            int temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;

            // Print array after swap
            System.out.println("Array after swapping:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Invalid indices.");
        }

        sc.close();
    }
}
