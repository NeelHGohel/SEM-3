import java.util.Scanner;

public class AddGCDToLL {
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

        Logic logic = new Logic();
        logic.addGCD(ll);

        System.out.println();
        System.out.println("After adding GCD:");
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
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = n1;
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

class Logic {
    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void addGCD(LinkedList ll) {
        if (ll.first == null || ll.first.link == null) {
            return;
        }

        LinkedList.Node temp = ll.first;
        while (temp != null && temp.link != null) {
            int gcd = findGCD(temp.info, temp.link.info);
            LinkedList.Node gcdNode = ll.new Node(gcd);
            gcdNode.link = temp.link;
            temp.link = gcdNode;
            temp = gcdNode.link;
        }
    }
}
