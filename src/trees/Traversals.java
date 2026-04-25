package trees;

// Node class
class node {
    int data;
    Node left, right;

    public node(int value) {
        data = value;
        left = right = null;
    }
}

class Traversals {

    // ----------------- INORDER -----------------
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // ----------------- PREORDER -----------------
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // ----------------- POSTORDER -----------------
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // ----------------- MAIN -----------------
    public static void main(String[] args) {
        // Create tree manually (no insert function)
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        Traversals t = new Traversals();

        System.out.print("Inorder: ");
        t.inorder(root);
        System.out.println();

        System.out.print("Preorder: ");
        t.preorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        t.postorder(root);
        System.out.println();
    }
}

