
import java.util.Scanner;

public class BST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BinarySearchTree T  = new BinarySearchTree();
        
            
                                boolean flag = true;
            while(flag){
                System.out.println("Enter" + "\n"
                                +"1 to insert Node" + "\n"
                                +"2 to delete Node" + "\n"
                                +"3 to search Node" + "\n"
                                +"4 to Exit");
                                int x = sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("Enter data");
                    int y = sc.nextInt();
                    T.insert(y);
                    break;
                case 3:
                    System.out.println("Enter data to search");
                    int s = sc.nextInt();
                    T.search(s); 
                    break;
                case 4:
                    flag = false;
                    break;

            }
        }
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
class BinarySearchTree{
    Node root;

    public BinarySearchTree(){
        root = null;
    }


   //Insert
   void insert(int data){
    root = insertData(root, data);
   }
    public Node insertData(Node root , int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insertData(root.left, data);
        }
        else if(data > root.data){
            root.right = insertData(root.right, data);
        }
        return root;
    }

    boolean search(int data) {
        return searchData(root, data);
    }
    boolean searchData(Node root , int data){
        if(root == null){
            return false;
        }
        else if(data == root.data){
            // System.out.println("Seached Node is root Node");
            return true;
        }
        else if(data > root.data){
            // System.out.println("Searched Node is at right subtree");
            return searchData(root.right, data);
        }
        else{
            // System.out.println("Searched Node is at left subtree");
            return searchData(root.left, data);
        }
    }
}

