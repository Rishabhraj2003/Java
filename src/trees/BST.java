package trees;
// Node class
class Nodes {
    int data;
    Node left, right;

    public Nodes(int value) {
        data = value;
        left = right = null;
    }
}

// BST implementation
class BST {
    Node root;

    // Insert a new node
    Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    void insert(int value) {
        root = insert(root, value);
    }

    // Search for a value
    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }

    // Find minimum value (helper for delete)
    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Delete a node
    Node delete(Node root, int key) {
        if (root == null) return root;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node found
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children: get inorder successor
            Node temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    void delete(int value) {
        root = delete(root, value);
    }

    // Inorder Traversal (for checking)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder before deletion: ");
        tree.inorder(tree.root);
        System.out.println();

        // Search
        System.out.println("Searching 40: " + tree.search(tree.root, 40));
        System.out.println("Searching 90: " + tree.search(tree.root, 90));

        // Delete
        tree.delete(20);  // Leaf node
        tree.delete(30);  // Node with one child
        tree.delete(50);  // Node with two children

        System.out.print("Inorder after deletion: ");
        tree.inorder(tree.root);
        System.out.println();
    }
}
