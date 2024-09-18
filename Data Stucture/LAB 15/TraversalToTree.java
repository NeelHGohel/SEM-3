import java.util.Scanner;

public class TraversalToTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node root;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
            root = null;
        }
    }

    static int preIndex = 0;
    static int postIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int size = sc.nextInt();
        int[] pre = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter data in preorder ");
            pre[i] = sc.nextInt();
        }
        System.out.println();
        int[] post = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter data in postorder ");
            post[i] = sc.nextInt();
        }

        Node root = createTreeFromPrePost(pre, post);

        System.out.print("\nIndorder: ");
        printInorder(root);
        System.out.print("\nPreorder: ");
        printPreorder(root);
        System.out.print("\npostorder: ");
        printPostorder(root);

        sc.close();
    }

    public static Node createTreeFromPrePost(int[] pre, int[] post) {
        if (preIndex >= pre.length || postIndex >= post.length) {
            return null;
        }

        Node root = new Node(pre[preIndex++]);

        if (root.data != post[postIndex]) {
            root.left = createTreeFromPrePost(pre, post);
        }

        if (root.data != post[postIndex]) {
            root.right = createTreeFromPrePost(pre, post);
        }

        postIndex++;

        return root;
    }

    
    public static void printPreorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "-");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + "-");
        printInorder(root.right);
    }

    public static void printPostorder(Node root) {
        if (root == null) {
            return;
        }
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data + "-");
    }
}
