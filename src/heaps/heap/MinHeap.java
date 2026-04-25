package heaps.heap;

import java.util.ArrayList;

public class MinHeap {

    private ArrayList<Integer> heap;

    // Constructor must match class name
    public MinHeap() {
        heap = new ArrayList<>();
    }

    // Get parent index
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Get left child index
    private int left(int i) {
        return 2 * i + 1;
    }

    // Get right child index
    private int right(int i) {
        return 2 * i + 2;
    }

    // Swap values at two indexes
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Insert a new element
    public void insert(int value) {
        heap.add(value);  // add at the end
        heapifyUp(heap.size() - 1);
    }

    // Heapify upwards
    private void heapifyUp(int index) {
        while (index > 0 && heap.get(parent(index)) > heap.get(index)) {
            swap(parent(index), index);
            index = parent(index);
        }
    }

    // Remove and return min element (root)
    public int remove() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty!");
        }

        int min = heap.get(0);

        // Move last to root, delete last
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        heapifyDown(0);

        return min;
    }

    // Heapify downwards
    private void heapifyDown(int index) {
        int smallest = index;

        int leftChild = left(index);
        int rightChild = right(index);

        if (leftChild < heap.size() && heap.get(leftChild) < heap.get(smallest)) {
            smallest = leftChild;
        }

        if (rightChild < heap.size() && heap.get(rightChild) < heap.get(smallest)) {
            smallest = rightChild;
        }

        if (smallest != index) {
            swap(smallest, index);
            heapifyDown(smallest);
        }
    }

    // Return root
    public int peek() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty!");
        }
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public void printHeap() {
        System.out.println(heap);
    }

    // Test the MinHeap
    public static void main(String[] args) {
        MinHeap mh = new MinHeap();

        mh.insert(50);
        mh.insert(20);
        mh.insert(30);
        mh.insert(10);
        mh.insert(40);

        mh.printHeap();

        System.out.println("Min removed: " + mh.remove());
        mh.printHeap();

        System.out.println("Peek: " + mh.peek());
    }
}



//
//🎯 Explanation
//✔ Insert
//
//Add element at end
//
//Push up using heapifyUp
//
//✔ Remove
//
//Replace root with last element
//
//Remove last
//
//Push down using heapifyDown
//
//✔ Time Complexity
//Operation	Complexity
//Insert	O(log n)
//Remove	O(log n)
//Peek	O(1)