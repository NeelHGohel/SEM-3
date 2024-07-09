import java.util.Scanner;

public class MethodsOfLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        System.out.println("Enter ");
        System.out.println("1 for insert at first \n" + "2 for insert at last \n" + "3 for insert in order");
        int temp = sc.nextInt();
        switch (temp) {
            case 1:
                System.out.println("Enter element to insert at first");
                int x = sc.nextInt();
                l1.insertAtFirst(x);
                break;
        
            case 2:
                System.out.println("Enter element to insert at last");
                int x1 = sc.nextInt();
                l1.insertAtLast(x1);
                break;
            case 3:
                System.out.println("Enter element to insert in order");
                int o = sc.nextInt();
                l1.insertInOrder(o);
        }
        
    }
}
class LinkedList{
    class Node{
        int info;
        Node link;

        Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    public Node first = null;

    public void insertAtFirst(int data){
        Node n1 = new Node(data);

        if(first == null){
            first = n1;
            return;
        }
        else{
            n1.link = first;
            first = n1;
        }
    }
    public void insertAtLast(int data){
        Node n1 = new Node(data);

        if(first==null){
            first = n1;
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = n1;
    }
    public void insertInOrder(int data){
        Node n1 = new Node(data);

        if(first == null){
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
    public void deleteElement(int data){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter elemnet to delete");
        int d = sc1.nextInt();

        if(first == null){
            System.out.println("Under-Flow");
            return;
        }
        Node save = first;

        while (save.info != d && save != null ) {
            Node pred = save;
            save = save.link;
        }
        if(save.info != d){
            System.out.println("Node Not Found");
            return;
        }
        if(first.info == d){
            first = first.link;
        }
        else{
            
        }
    }
}