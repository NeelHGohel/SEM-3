import java.util.Scanner;

public class CircularLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, temp;
        LinkedList cll = new LinkedList();
        boolean Flag = true;
        while (Flag) {
            System.out.println("Enter" + "\n" +
                    "1 for insert at first" + "\n" +
                    "2 for insert at last" + "\n" +
                    "3 for insert into Ordered Position" + "\n" +
                    "4 Delete a node at position" + "\n" +
                    "5 for display" + "\n" +
                    "6 for break");

            temp = sc.nextInt();

            switch (temp) {
                case 1:
                    System.out.println("Enter an element : ");
                    x = sc.nextInt();
                    cll.insertAtFirstInCLL(x);
                    cll.display();
                    break;
                case 2:
                    System.out.println("Enter an element : ");
                    x = sc.nextInt();
                    cll.insertAtLastInCLL(x);
                    cll.display();
                    break;
                case 3:
                    System.out.println("Enter an element : ");
                    x = sc.nextInt();
                    cll.insertInOrderInCLL(x);
                    cll.display();
                    break;
                case 4:
                    System.out.println("Enter a position : ");
                    x = sc.nextInt();
                    cll.deleteElementInCLL(x);
                    cll.display();
                    break;
                case 5:
                    cll.display();
                    break;
                case 6:
                    Flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
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
    public Node last = null;

    public void insertAtFirstInCLL(int data) {
        Node n1 = new Node(data);
        if (first == null) {
            first = n1;
            last = n1;
            last.link = first;
        } else {
            n1.link = first;
            last.link = n1;
            first = n1;
        }
    }

    public void insertAtLastInCLL(int data) {
        Node n1 = new Node(data);
        if (first == null) {
            first = n1;
            last = n1;
            last.link = first;
        } else {
            n1.link = first;
            last.link = n1;
            last = n1;
        }
    }

    public void insertInOrderInCLL(int data) {
        Node n1 = new Node(data);
        if (first == null) {
            first = n1;
            last = n1;
            last.link = first;
        } else if (n1.info <= first.info) {
            n1.link = first;
            last.link = n1;
            first = n1;
        } else {
            Node save = first;
            while (save.link != first && n1.info >= save.link.info) {
                save = save.link;
            }
            n1.link = save.link;
            save.link = n1;
            if (save == last) {
                last = n1;
            }
        }
    }

    public void deleteElementInCLL(int Position) {
        if (first == null) {
            System.out.println("Linked List is empty, no node to delete");
            return;
        }
        if (Position == 1) {
            if (first == last) {
                first = last = null;
            } else {
                first = first.link;
                last.link = first;
            }
            return;
        }
        int count = 1;
        Node save = first;
        Node PRED = null;
        while (save != last) {
            PRED = save;
            save = save.link;
            count++;
            if (count == Position) {
                break;
            }
        }
        if (count == Position) {
            if (save == last) {
                last = PRED;
            }
            if (PRED != null) {
                PRED.link = save.link;
            }
        } else {
            System.out.println("Position out of range");
        }
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