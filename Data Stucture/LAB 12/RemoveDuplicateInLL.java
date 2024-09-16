import java.util.Scanner;

public class RemoveDuplicateInLL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        System.out.println("Enter elements of linked list:");
        System.out.println("Enter -1 to stop");

        int element;

        while(true){
            element = sc.nextInt();
            if(element == -1) break;
            ll.insertAtLast(element);
        }

        System.out.println();
        System.out.println("Original LinkedList");
        ll.display();

        RemoveDuplicate rd = new RemoveDuplicate();
        rd.removeDuplicate(ll);
        
        System.out.println();
        System.out.println("After deleting duplicates");
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

class RemoveDuplicate {
    public void removeDuplicate(LinkedList ll) {
        LinkedList.Node prev = ll.first;
        LinkedList.Node temp = prev.link;

        while (temp != null) {
            LinkedList.Node save = temp;
            while (save != null && prev.info == save.info) {
                save = save.link;
            }
            prev.link = save;
            prev = save;
            if (save == null) break;
            temp = save;
        }
    }
}