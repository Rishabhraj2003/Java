//package heapds;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class MaxHeaps {
//    private ArrayList<Integer> heap;
//
//    // Constructor
//    public MaxHeaps() {
//        heap = new ArrayList<>();
//    }
//
//    // Get parent, left, and right indices
//    private int parent(int i) { return (i - 1) / 2; }
//    private int leftChild(int i) { return (2 * i) + 1; }
//    private int rightChild(int i) { return (2 * i) + 2; }
//
//    // Swap helper
//    private void swap(int i, int j) {
//        int temp = heap.get(i);
//        heap.set(i, heap.get(j));
//        heap.set(j, temp);
//    }
//
//    // Insert a new value
//    public void insert(int value) {
//        heap.add(value);
//        heapifyUp(heap.size() - 1);
//    }
//
//    // Heapify Up
//    private void heapifyUp(int i) {
//        while (i > 0 && heap.get(i) > heap.get(parent(i))) {
//            swap(i, parent(i));
//            i = parent(i);
//        }
//    }
//
//    // Extract (remove) max element
//    public int extractMax() {
//        if (heap.isEmpty()) {
//            System.out.println("Heap is empty!");
//            return -1;
//        }
//
//        int max = heap.get(0);
//        int last = heap.remove(heap.size() - 1);
//
//        if (!heap.isEmpty()) {
//            heap.set(0, last);
//            heapifyDown(0);
//        }
//
//        return max;
//    }
//
//    // Heapify Down
//    private void heapifyDown(int i) {
//        int size = heap.size();
//        int largest = i;
//        int left = leftChild(i);
//        int right = rightChild(i);
//
//        if (left < size && heap.get(left) > heap.get(largest))
//            largest = left;
//        if (right < size && heap.get(right) > heap.get(largest))
//            largest = right;
//
//        if (largest != i) {
//            swap(i, largest);
//            heapifyDown(largest);
//        }
//    }
//
//    // Display the heap
//    public void display() {
//        if (heap.isEmpty()) {
//            System.out.println("Heap is empty!");
//        } else {
//            System.out.println("Current Heap: " + heap);
//        }
//    }
//}
//
//public class MaxHeap {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        MaxHeap heap = new MaxHeaps();
//
//        int choice;
//        do {
//            System.out.println("\n--- MAX HEAP MENU ---");
//            System.out.println("1. Insert Element");
//            System.out.println("2. Extract Max");
//            System.out.println("3. Display Heap");
//            System.out.println("4. Exit");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter element to insert: ");
//                    int value = sc.nextInt();
//                    heap.insert(value);
//                    System.out.println(value + " inserted into the heap.");
//                    break;
//
//                case 2:
//                    int max = heap.extractMax();
//                    if (max != -1)
//                        System.out.println("Extracted Max: " + max);
//                    break;
//
//                case 3:
//                    heap.display();
//                    break;
//
//                case 4:
//                    System.out.println("Exiting... Thank you!");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice! Try again.");
//            }
//        } while (choice != 4);
//
//        sc.close();
//    }
//}
//
