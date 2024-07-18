import java.util.Scanner;

public class CicularLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x , temp;
        LinkedList cll = new LinkedList();
        boolean Flag = true;
        while (Flag) {
            System.out.println("Enter 1 for insert at first" + "\n"+
            "2 for insert at last"+ "\n" +
            "3 for inset into Ordered Position" + "\n"+
            "4 Delete a node at position" + "\n"+
            "5 for display"+ "\n" +
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
    public Node last = null;

    public void insertAtFirstInCLL(int data) {
        Node n1 = new Node(data);
        n1.info = data;
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
        n1.info = data;
        if (first == null) {
            first = n1;
            last = n1;
            last.link = first;
        } 
        else {
            n1.link = first;
            last.link = n1;
            last = n1;
        }
    }
    public void insertInOrderInCLL(int data) {
        Node n1 = new Node(data);
        n1.info = data;

        if (first == null) {
            first = n1;
            last = n1;
        }
        if(n1.info <= first.info){
            n1.link = first;
            last.link = n1;
            first = n1;
            return;
        }
        Node save = first;
        while (save != last && n1.info >= save.link.info) {
            save = save.link;
        }
        n1.link = save.link;
        save.link = n1;

        if(save == last){
            last = n1;
        }
        return;
    }

    public void deleteElementInCLL(int Position){
        if (first == null) {
            System.out.println("Linked List is empty no node to delete");
        }
        if (Position == 1) {
            if (first == last) {
                first = last = null;
            } else {
                first = first.link;
                last.link = first;
            }
        }
        int count=0;
        Node save = first.link;
        Node PRED = first;
        while (save != PRED) {
            count++;
            if (count == Position) {
                PRED.link = save.link;
                if (save == last) {
                    last = PRED;
                }
                return;
            }
            PRED = save;
            save = save.link;
        }
    }


    public void display() {
        Node temp = first;
        while (temp.link != first) {
            System.out.print(temp.info + " -> ");
            temp = temp.link;
        }
        System.out.println(temp.info);
        System.out.println();
    }

}