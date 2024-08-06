import java.util.Scanner;

public class ReverseLinkedList {
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

        l1.reverseLinkedList();
        System.out.println("Original Linked List:");
        l1.printList();
        System.out.println("Reversed Linked List:");
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

    public void reverseLinkedList() {
        if (first == null || first.link == null) {
            return; 
        }
        Node PRED = null;
        Node CURRENT = first;
        Node SAVE;

        while (CURRENT != null) {
            SAVE = CURRENT.link;
            CURRENT.link = PRED;
            PRED = CURRENT;
            CURRENT = SAVE;
        }
        first = PRED;
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
