import java.util.Scanner;

public class MethodsOfLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        System.out.println("Enter ");
        System.out.println("1 for insert at first \n" + "2 for insert at last \n" + "3 for insert in order \n"
                + "4 to Delete an Element\n" + "5 for count Node\n" + "6 for break");
        int temp = sc.nextInt();

        boolean Flag = true;
        while (Flag) {
            switch (temp) {
                case 1:
                    System.out.println();
                    System.out.println("Enter element to insert at first");
                    int x = sc.nextInt();
                    l1.insertAtFirst(x);
                    l1.display();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Enter element to insert at last");
                    int x1 = sc.nextInt();
                    l1.insertAtLast(x1);
                    l1.display();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Enter element to insert in order");
                    int o = sc.nextInt();
                    l1.insertInOrder(o);
                    l1.display();
                case 4:
                System.out.println("Enter elemnet to delete");
                int d = sc.nextInt();
                    l1.deleteElement(d);
                    l1.display();
                case 5:
                    l1.CountNodes();
                case 6:
                    Flag = false;
                    break;
            }
        }

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

    public void insertAtFirst(int data) {
        Node n1 = new Node(data);

        if (first == null) {
            first = n1;
            return;
        } else {
            n1.link = first;
            first = n1;
        }
    }

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

    public void insertInOrder(int data) {
        Node n1 = new Node(data);

        if (first == null) {
            n1.link = null;
            return;
        }
        if (n1.info <= first.info) {
            n1.link = first;
            return;
        }
        Node save = first;
        while (save.link != null && n1.info >= save.link.info) {
            save = save.link;
        }
        n1.link = save.link;
        save.link = n1;
        return;
    }

    public void deleteElement(int d) {

        if (first == null) {
            System.out.println("Under-Flow");
            return;
        }
        Node save = first;
        Node pred = save;
        while (save.info != d && save != null) {
            pred = save;
            save = save.link;
        }
        if (save.info != d) {
            System.out.println("Node Not Found");
            return;
        }
        if (first.info == d) {
            first = first.link;
        } else {
            pred.link = save.link;
        }
    }

    public void CountNodes() {
        if (first == null) {
            System.out.println("Under-Flow");
            return;
        }
        Node save = first;
        int count = 0;
        while (save.link != null) {
            save = save.link;
            count++;
        }
        System.out.println("Total nodes is =" + count);
    }

    public void display() {
        if (first == null) {
            System.out.println("Circular Linked List is empty");
            return;
        }
        Node temp = first;
        do {
            System.out.print(temp.info + " -> ");
            temp = temp.link;
        } while (temp != first);
        System.out.println("(back to start)");
        System.out.println();
    }
}