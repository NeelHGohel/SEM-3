import java.util.Scanner;

public class TraversalToTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinarySearchTree T = new BinarySearchTree();

        System.out.println("Enter size");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element"+ " ");
            int x = sc.nextInt();
            T.insert(x);
        }
        System.out.println("PreOrder is");
        T.preOrder(T.root);
        System.out.println();

        System.out.println("InOrder is");
        T.inOrder(T.root);
        System.out.println();

        System.out.println("PostOrder is");
        T.postOrder(T.root);
        System.out.println();
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert
    void insert(int data) {
        root = insertData(root, data);
    }

    private Node insertData(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertData(root.left, data);
        } else if (data > root.data) {
            root.right = insertData(root.right, data);
        }
        return root;
    }

    //PreOrder
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + "-");
        preOrder(root.left);
        preOrder(root.right);
    }

    //InOrder
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "-");
        inOrder(root.right);
    }

    //PostOrder
    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "-");
    }
}