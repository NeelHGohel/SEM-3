import java.util.Scanner;

public class SwapNodeInLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        System.out.println("Enter elements of linked list: ");
        System.out.println("Enter -1 to end input");

        int element;
        while (true) {
            element = sc.nextInt();
            if (element == -1) break;
            ll.insertAtLast(element);
        }

        System.out.println();
        System.out.println("Original LinkedList:");
        ll.display();

        SwapNode sn = new SwapNode();
        sn.swapNode(ll);

        System.out.println();
        System.out.println("After swapping nodes:");
        ll.display();

        sc.close();
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
        } else {
            Node last = first;
            while (last.link != null) {
                last = last.link;
            }
            last.link = n1;
        }
    }

    public void display() {
        if (first == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

class SwapNode {
    public void swapNode(LinkedList ll) {
        if (ll.first == null || ll.first.link == null) {
            return;
        }

        LinkedList.Node dummy = ll.new Node(0);
        dummy.link = ll.first;
        LinkedList.Node prev = dummy;
        LinkedList.Node curr = ll.first;

        while (curr != null && curr.link != null) {
            LinkedList.Node next = curr.link.link;

            prev.link = curr.link;
            curr.link.link = curr;
            curr.link = next;

            prev = curr;
            curr = next;
        }

        ll.first = dummy.link; 
    }
}
