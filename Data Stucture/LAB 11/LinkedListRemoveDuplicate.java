/**
 * This Java class defines a LinkedList data structure with methods to add
 * elements, remove duplicates,
 * and display the list.
 */
class Node {
	int info;
	Node link;

	public Node(int data) {
		this.info = data;
		this.link = null;
	}
}

public class LinkedListRemoveDuplicate {

	public static void main(String[] args) {

		LinkedListRemoveDuplicate l1 = new LinkedListRemoveDuplicate();

		l1.add(5);
		l1.add(4);
		l1.add(7);
		l1.add(8);
		l1.add(5);
		l1.add(4);

		System.out.println("Initial composition : ");
		l1.display();

		l1.removeDuplicates();

		System.out.println("After removing duplicates : ");
		l1.display();
	}

	public Node first = null;
	public Node last = null;

	public void add(int data) {
		Node newNode = new Node(data);

		if (first == null) {

			first = newNode;
			last = newNode;
		} else {

			last.link = newNode;

			last = newNode;
		}
	}

	public void removeDuplicates() {
		Node save = first;

        while (save != null) {
            Node PRED = save;

            while (PRED.link != null) {
                if (save.info == PRED.link.info) {
                    PRED.link = PRED.link.link;  // Skip the duplicate node
                } else {
                    PRED = PRED.link;
                }
            }

            save = save.link;
        }
    }

	public void display() {
		if (first == null) {
			System.out.println("Circular Linked List is empty");
			return;
		}
		Node save1 = first;
		do {
			System.out.print(save1.info + " -> ");
			save1 = save1.link;
		} while (save1 != first);

		System.out.println();
	}
}