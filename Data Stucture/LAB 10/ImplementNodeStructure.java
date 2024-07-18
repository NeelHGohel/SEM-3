import java.util.Scanner;

public class ImplementNodeStructure {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

    
        Node node = new Node(5);
        node.display();

    }
}
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }

        public Node(int info, Node link) {
            this.info = info;
            this.link = link;
        }

        public void display() {
            System.out.println("Data = " + this.info);
        }
    }

