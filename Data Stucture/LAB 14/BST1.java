import java.util.Scanner;

public class BST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinarySearchTree T = new BinarySearchTree();

        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("Enter" + "\n"
                    + "1 to insert Node" + "\n"
                    + "2 to delete Node" + "\n"
                    + "3 to search Node" + "\n"
                    + "4 to Exit");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Enter data to insert");
                    int y = sc.nextInt();
                    T.insert(y);
                    break;
                case 2:
                    System.out.println("Enter data to delete");
                    int d = sc.nextInt();
                    T.delete(d);
                    break;
                case 3:
                    System.out.println("Enter data to search");
                    int s = sc.nextInt();
                    boolean found = T.search(s);
                    if (found) {
                        System.out.println("Node found.");
                    } else {
                        System.out.println("Node not found.");
                    }
                    break;
                case 4:
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

    // Delete
    void delete(int data) {
        root = deleteData(root, data);
    }

    private Node deleteData(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = deleteData(root.left, data);
        } else if (data > root.data) {
            root.right = deleteData(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = deleteData(root.right, minNode.data);
        }
        return root;
    }

    private Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Search
    boolean search(int data) {
        return searchData(root, data);
    }

    private boolean searchData(Node root, int data) {
        if (root == null) {
            return false;
        } else if (data == root.data) {
            return true;
        } else if (data > root.data) {
            return searchData(root.right, data);
        } else {
            return searchData(root.left, data);
        }
    }
}
