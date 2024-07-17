import java.util.*;

public class StackWithSLL {

    public static void main(String[] args) {
        System.out.println("1 : push" + "\n" + "2 : pop" + "\n" + "3 : display");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1 = new LinkedList();
        switch (n) {
            case 1:
                System.out.println("Enter no to push");
                int x = sc.nextInt();
                l1.insertAtLast(x);
                break;

            case 2:
                l1.deleteLast();
                break;
            case 3:
                l1.display();
        }
    }
}

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    Node first;

    public void insertAtLast(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;

        }
    }

    public void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }

    public void deleteLast() {
        if (first == null) {
            System.out.println("Empty linkedlist");
        }
        Node temp = first;
        Node previous = null;
        while (temp.link != null) {
            previous = temp;
            temp = temp.link;
        }
        previous.link = null;
    }
}