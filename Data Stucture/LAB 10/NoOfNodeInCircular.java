public class NoOfNodeInCircular {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.CountNodesInCircular();
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

    public void CountNodesInCircular() {
        if (first == null) {
            System.out.println("Under-Flow");
            return;
        }
        Node save = first;
        int count = 0;
        while (save.link != first) {
            save = save.link;
            count++;
        }
        System.out.println("Total nodes is =" + count);
    }
}