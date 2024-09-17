import java.util.Scanner;

public class Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinarySearchTree T = new BinarySearchTree();

        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("Enter" + "\n"
                    + "1 to insert Node" + "\n"
                    + "2 to Preorder Traversal" + "\n"
                    + "3 to Inorder Traversal" + "\n"
                    + "4 to Postorder Traversal" + "\n"
                    + "5 to exit");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Enter data to insert");
                    int y = sc.nextInt();
                    T.insert(y);
                    break;
                case 2:
                    System.out.println("Preorder is");
                    T.preOrder(T.root);
                    break;
                case 3:
                    System.out.println("Inorder is");
                    T.inOrder(T.root);
                    break;
                case 4:
                    System.out.println("Postorder is");
                    T.postOrder(T.root);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice, please enter again.");
                    break;
            }
        }
        sc.close();
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

    // PreOrder
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + "-");
        preOrder(root.left);
        preOrder(root.right);
    }

    // InOrder
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "-");
        inOrder(root.right);
    }

    // PostOrder
    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "-");
    }
}
