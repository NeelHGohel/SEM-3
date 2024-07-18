
import java.util.Scanner;

public class CompareLinkedList {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element in 1st Linked List");
        System.out.println("Enter -1 for stop");
        int x;
        while (true) {
            x = sc.nextInt();
            if (x == -1) {
                break;
            } else {
                l1.insertAtLast(x);
            }
        }
        System.out.println("Enter element in 2nd Linked List");
        System.out.println("Enter -1 for stop");
        while (true) {
            x = sc.nextInt();
            if (x == -1) {
                break;
            } else {
                l2.insertAtLast(x);
            }

        }
        LinkedList.check(l1, l2);
    }
}

class LinkedList {
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtLast(int data) {
        Node n1 = new Node(data);

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

    public static void check(LinkedList l1, LinkedList l2) {

        if (l1.first == null && l2.first == null) {
            System.out.println("Both are same");
            return;
        }
        if (l1.first == null || l2.first == null) {
            System.out.println("Both are not same");
            return;
        }
        Node save1 = l1.first;
        Node save2 = l2.first;

        while (save1 != null && save2 != null) {
            if (save1.info != save2.info) {
                System.out.println("Both are not same");
                return;
            }
            save1 = save1.link;
            save2 = save2.link;
        }
        System.out.println("Both are same");
        return;

    }
}