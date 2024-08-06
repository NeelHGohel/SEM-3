
import java.util.Scanner;

public class CopyLinkedList {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

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

        l2.first = l1.copyLinkedList();

        System.out.println("Original Linked List:");
        l1.printList();

        System.out.println("Copied Linked List:");
        l2.printList();
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

    public Node copyLinkedList() {
        if (first == null) {
            return null;
        }
        Node temp = new Node(first.info);
        Node PRED = temp;
        Node save = first.link;

        while (save != null) {
            Node n = new Node(save.info);
            PRED.link = n;
            PRED = n;
            save = save.link;
        }

        return temp;
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
