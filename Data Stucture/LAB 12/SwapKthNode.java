import java.util.Scanner;

public class SwapKthNode {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter element into the linkedList enter -1 to stop");
        int x;
        while(true){
            x = sc.nextInt();
            if(x==-1){
                break;
            }
            else {
                l1.insertAtLast(x);
            }
        }
        System.out.println("Original Linked List:");
        l1.printList();

        System.out.println("Enter kth Node");
        int k = sc.nextInt();

        l1.SwapKthNode(k);

        System.out.println("Swapped Linked List:");
        l1.printList();
    }
}
class LinkedList {

    class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtLast(int info) {
        Node n1 = new Node(info);

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
    public void SortLinkedList(){
        Node save = first;
        if(first == null){
            System.out.println("Only one element");
            return;
        }
        while(save.link != null){
            if(save.info > save.link.info){
                int temp = save.info;
                save.info = save.link.info;
                save.link.info = temp;
            }
            else{
            save = save.link;
            }
        }
    }

    public void SwapKthNode(int k) {
        if (k <= 0) {
            System.out.println("Invalid value of k. It must be positive.");
            return;
        }
    
        // Step 1: Find the length of the linked list
        Node current = first;
        int length = 0;
        while (current != null) {
            length++;
            current = current.link;
        }
    
        if (k > length) {
            System.out.println("k is larger than the length of the list.");
            return;
        }
    
        // Edge case: If k is in the middle and same from both ends
        if (2 * k - 1 == length) {
            System.out.println("The kth node from start and end are the same. No swap needed.");
            return;
        }
    
        // Step 2: Find the kth node from the beginning and the kth node from the end
        Node firstK = null, lastK = null;
        Node prevFirstK = null, prevLastK = null;
    
        current = first;
        int count = 1;
        while (current != null) {
            if (count == k) {
                firstK = current;
                if (firstK != first) {
                    prevFirstK = first;
                    while (prevFirstK.link != firstK) {
                        prevFirstK = prevFirstK.link;
                    }
                }
            }
            if (count == length - k + 1) {
                lastK = current;
                if (lastK != first) {
                    prevLastK = first;
                    while (prevLastK.link != lastK) {
                        prevLastK = prevLastK.link;
                    }
                }
            }
            count++;
            current = current.link;
        }
    
        // Edge cases: If either of the nodes is null, handle it
        if (firstK == null || lastK == null) {
            System.out.println("One of the kth nodes is null.");
            return;
        }
    
        // Swap the nodes
        if (prevFirstK != null) {
            prevFirstK.link = lastK;
        } else {
            first = lastK;
        }
    
        if (prevLastK != null) {
            prevLastK.link = firstK;
        } else {
            first = firstK;
        }
    
        // Swap the links of firstK and lastK
        Node temp = lastK.link;
        lastK.link = firstK.link;
        firstK.link = temp;
    }
    
    

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}
