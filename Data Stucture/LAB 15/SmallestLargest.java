import java.util.Scanner;

class BST {
    static class Node {
        int val;
        Node left, right;

        Node(int item) {
            val = item;
            left = right = null;
        }
    }

    Node root;

    public Node constTree(int[] arr) {
        for (int num : arr) {
            root = insert(root, num);
        }
        return root;
    }

    private Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
}

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        BST t = new BST();
        BST.Node root = t.constTree(arr);

        // Find smallest
        int min = findMin(root);
        // Find largest
        int max = findMax(root);

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
        sc.close();
    }

    private static int findMin(BST.Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    private static int findMax(BST.Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }
}
