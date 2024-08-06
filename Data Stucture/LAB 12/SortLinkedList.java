import java.util.Scanner;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in 1st Linked List:");
        System.out.println("Enter -1 to stop:");
        int x;
        while (true) {
            x = sc.nextInt();
            if (x == -1) {
                break;
            } else {
                l1.insertAtLast(x);
            }
        }
        System.out.println("Original Linked List:");
        l1.printList();

        l1.SortLinkedList();
        
        System.out.println("Sorted Linked List:");
        l1.printList();
    }
}

class LinkedList {

    class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtLast(int info) {
        Node n1 = new Node(info);

        if (first == null) {
            first = n1;
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = n1;
    }
    public void SortLinkedList(){
        Node save = first;
        if(first == null){
            System.out.println("Only one element");
            return;
        }
        while(save.link != null){
            if(save.info > save.link.info){
                int temp = save.info;
                save.info = save.link.info;
                save.link.info = temp;
            }
            else{
            save = save.link;
            }
        }
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}
