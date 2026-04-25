package  trees;
class ArrayBinaryTree {
    int[] tree;
    int size;

    // Constructor
    public ArrayBinaryTree(int capacity) {
        tree = new int[capacity];
        size = 0;
    }

    // Insert element in level-order fashion
    public void insert(int value) {
        if (size >= tree.length) {
            System.out.println("Tree is full, cannot insert " + value);
            return;
        }
        tree[size] = value;
        size++;
    }

    // Display the tree as array
    public void display() {
        System.out.print("Tree (Array Representation): ");
        for (int i = 0; i < size; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

    // Traverse Inorder (using array indexes)
    public void inorder(int index) {
        if (index >= size) return;
        inorder(2 * index + 1);  // left
        System.out.print(tree[index] + " "); // root
        inorder(2 * index + 2);  // right
    }

    // Traverse Preorder
    public void preorder(int index) {
        if (index >= size) return;
        System.out.print(tree[index] + " "); // root
        preorder(2 * index + 1);  // left
        preorder(2 * index + 2);  // right
    }

    // Traverse Postorder
    public void postorder(int index) {
        if (index >= size) return;
        postorder(2 * index + 1);  // left
        postorder(2 * index + 2);  // right
        System.out.print(tree[index] + " "); // root
    }

    public static void main(String[] args) {
        ArrayBinaryTree bt = new ArrayBinaryTree(10);

        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);
        bt.insert(6);

        bt.display();

        System.out.print("Inorder Traversal: ");
        bt.inorder(0);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        bt.preorder(0);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        bt.postorder(0);
        System.out.println();
    }
}
