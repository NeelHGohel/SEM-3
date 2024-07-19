
import java.util.Scanner;



public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        
        boolean Flag = true;

        while(Flag){
            System.out.println("Enter" +"\n"
        + "1 For insert a node At first" + "\n"
        + "2 For insert a node At Last" + "\n"
        + "3 For insert a node At Specific Position" + "\n"
        + "4 For Delete a node " + "\n"
        + "5 For Stop"
        ); 
        int x = sc.nextInt();
            switch(x){
            case 1:
                    System.out.println("Enter an element : ");
                    x = sc.nextInt();
                    l1.InsertAtFirst(x);
                    l1.display();
                    break;
                case 2:
                    System.out.println("Enter an element : ");
                    x = sc.nextInt();
                    l1.InsertAtLast(x);
                    l1.display();
                    break;
                case 3:
                    System.out.println("Enter an element : ");
                    x = sc.nextInt();
                    System.out.println("Enter an Position ");
                    int x1 = sc.nextInt();
                    l1.InsertAtPosition(x , x1);
                    l1.display();
                    break;
                case 4:
                    System.out.println("Enter a position : ");
                    x = sc.nextInt();
                    l1.delete(x);
                    l1.display();
                    break;
                case 5:
                    l1.display();
                    break;
                case 6:
                    Flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
        }
    }
}
static class LinkedList {
    class Node {
        int info;
        Node lptr;
        Node rptr;

        Node(int data) {
            this.info = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    public Node L;
    public Node R;
    public LinkedList(){
        this.L = null;
        this.R = null;
    }
    public void InsertAtFirst(int data){
        Node n1 = new Node(data);

        if(L == null){
            L = n1;
            R = n1;
        }
        else{
            n1.rptr = L;
            L.lptr = n1;
            L = n1;
        }
    }

    public void InsertAtLast(int data){
        Node n1 = new Node(data);

        n1.info = data;
        if(R == null){
            L = n1;
            R = n1;
        }
        else{
            R.rptr = n1;
            n1.lptr = R;
            R = n1;
        }
    }
    public void InsertAtPosition(int data , int position){
        Node n1 = new Node(data);

        if(position == 1){
            InsertAtFirst(data);
        }
        else{
            Node current = L;
            int currPosition = 1;

            while(current != null && currPosition<position){
                current = current.rptr;
                currPosition++;
            }
            if(current == null){
                InsertAtLast(data);
            }
            else{
                n1.rptr = current;
                n1.lptr = current.lptr;
                current.lptr.rptr = n1;
                current.lptr = n1;
            }
        }
    }
    public void delete(int position){
        Node Old = null;
        if(R == null){
            System.out.println("Under-Flow");
        }
        if(L ==R){
            L = R = null;
        }
        else if(Old == L){
            L = L.rptr;
            L.lptr = null;
        }
        else if(Old == R){
            R = R.lptr;
            R.rptr = null;
        }
        else{
            Old.lptr.rptr = Old.rptr;
            Old.rptr.lptr = Old.lptr;
        }
        System.out.println("Node Deleted SucessFully");
    }

    public void display() {
        Node temp = L;
        while (temp != null) {
            System.out.print(temp.info + " -> ");
            temp = temp.rptr;
        }
        System.out.println(); // Print new line after displaying all elements
    }
}
}
