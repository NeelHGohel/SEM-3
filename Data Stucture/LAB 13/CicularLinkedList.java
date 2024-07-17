public class CicularLinkedList{
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtFirstInCLL(25);
        l1.display();
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

    public void insertAtFirstInCLL(int data){
        Node n1 = new Node(data);
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        n1.info = data;

        if(first == null){
            n1.link = n1;
            first = null;
            last = null;
        }
        else{
            n1.link = first;
            last.link = n1;
            first = n1;
        }

    }
    public void display() {
        if (first == null) {
            System.out.println("Linked List is empty");
            return;
        }
        System.out.println("list is : ");
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + "=>");
            temp = temp.link;
        }

    }

}