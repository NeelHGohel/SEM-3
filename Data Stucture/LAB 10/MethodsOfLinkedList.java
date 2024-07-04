public class MethodsOfLinkedList {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtFirst(5);
        
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
}