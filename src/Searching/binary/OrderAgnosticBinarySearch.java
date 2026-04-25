package Searching.binary;
class OrderAgnosticBinarySearch {
    public static int search(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        // Step 1: Find order
        boolean isAscending = arr[start] < arr[end];

        // Step 2: Binary Search with order check
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (isAscending) { // ascending order
                if (key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // descending order
                if (key > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};       // Ascending
        int[] arr2 = {9, 7, 5, 3, 1};       // Descending

        System.out.println(search(arr1, 7)); // Output: 3
        System.out.println(search(arr2, 7)); // Output: 1
    }
}
