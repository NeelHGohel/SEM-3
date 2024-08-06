import java.util.Scanner;

public class QueueWithSLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // LinkedList l1 = new LinkedList();
        Node n = new Node(0);
        boolean flag = true;
        while (flag) {
            System.out.println("\n" + "Enter" + "\n"
                    + "1 for Enqueue Using Linked List" + "\n"
                    + "2 for dequeue Using Linked List" + "\n"
                    + "3 for diplay Like Linked List" + "\n"
                    + "4 for stop");

            int temp = sc.nextInt();

            switch (temp) {
                case 1:
                    System.out.println("Enter an element : ");
                    int y = sc.nextInt();
                    n.EnqueueWithLL(y);
                    n.Display();
                    break;
                case 2:
                    n.dequeueWithLL();
                    n.Display();
                    break;
                case 3:
                    n.Display();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choise");
            }
        }
    }
}
class Node {
    Node front;
    Node rear;
    Node link;
    int info;

    public Node(int data) {
        this.info = data;
        this.link = null;
        this.front = null;
        this.rear = null;
    }


    public void EnqueueWithLL(int y) {
        Node n1 = new Node(y);
        if (front == null) {
            front = rear = n1;
            return;
        }
        rear.link = n1;
        rear = n1;
    }

    public int dequeueWithLL(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int y = front.info;

        if(front.link == null){
            front = rear = null;
        }
        else{
            front = front.link;
        }
        return y;
    }
    public void Display(){
        if(front == null){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;
        System.out.println();
        while(temp != rear){
            System.out.print(temp.info + " -> ");
            temp = temp.link;
        }
        System.out.println(temp.info);
        System.out.println();
    }
}

