import java.util.Scanner;

public class TreeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Insert Element  ");
            a[i] = sc.nextInt();
        }

        Tree T = new Tree();
        T.root = T.ConstructTree(a, 0);
        System.out.println();
        System.out.print("PreOrder: ");
        T.preOrder(T.root);
        System.out.println();
        System.out.println();
        System.out.print("InOrder: ");
        T.inOrder(T.root);
        System.out.println();
        System.out.println();
        System.out.print("PostOrder: ");
        T.postOrder(T.root);
        
    }    
}
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
    
}
class Tree{
    Node root;
    public Node ConstructTree(int a[] , int i){
        if(i >= a.length){
            return null;
        }
        Node temp = new Node(a[i]);
        temp.left = ConstructTree(a, (i*2)+1);
        temp.right = ConstructTree(a, (i*2)+2);
        return temp;
    }

    public void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + "-");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "-");
        inOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "-");
    }
    
}
