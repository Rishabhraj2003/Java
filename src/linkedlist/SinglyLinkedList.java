package linkedlist;

public class SinglyLinkedList{

    // Node definition
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // LinkedList variables
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    // ----------------------------
    // INSERTION OPERATIONS
    // ----------------------------

    // Insert at front
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) { // first element
            tail = head;
        }
        size++;
    }

    // Insert at end
    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert at specific index (0-based)
    public void insertAt(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    // ----------------------------
    // DELETION OPERATIONS
    // ----------------------------

    // Delete first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        size--;
        if (head == null) { // list became empty
            tail = null;
        }
    }

    // Delete last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) { // only one node
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) { // stop at 2nd last
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    // Delete node at index
    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    // Delete first occurrence of a value
    public void deleteValue(int val) {
        if (head == null) return;
        if (head.val == val) {
            deleteFirst();
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.val != val) {
            temp = temp.next;
        }
        if (temp.next != null) { // found the value
            if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next;
            size--;
        } else {
            System.out.println("Value not found!");
        }
    }

    // ----------------------------
    // OTHER OPERATIONS
    // ----------------------------

    // Print linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Search for a value
    public boolean search(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }

    // Get size of list
    public int getSize() {
        return size;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // ----------------------------
    // MAIN METHOD (Demo)
    // ----------------------------
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insertions
        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(40);
        list.insertAt(2, 30); // insert in middle

        System.out.println("After insertions:");
        list.display(); // 10 -> 20 -> 30 -> 40 -> NULL

        // Deletions
        list.deleteFirst();
        System.out.println("\nAfter deleting first:");
        list.display(); // 20 -> 30 -> 40 -> NULL

        list.deleteLast();
        System.out.println("\nAfter deleting last:");
        list.display(); // 20 -> 30 -> NULL

        list.deleteAt(1);
        System.out.println("\nAfter deleting at index 1:");
        list.display(); // 20 -> NULL

        list.insertLast(50);
        list.insertLast(60);
        list.deleteValue(50);
        System.out.println("\nAfter deleting value 50:");
        list.display(); // 20 -> 60 -> NULL

        // Searching
        System.out.println("\nSearch 60: " + list.search(60)); // true
        System.out.println("Search 100: " + list.search(100)); // false

        // Size & Empty check
        System.out.println("\nSize of list: " + list.getSize());
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
