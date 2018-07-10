package ds.linked_list;

public class LinkedList {
	static Node head = null;
	static Node tail = null;
	static int count = 0;

	public static void main(String[] args) {

		insertElement(11);
		insertElement(12);
		insertElement(14);
		
		
		insertAtFirst(10);
		
		
		insertAtPos(5, 100);
		// print the linked list
		displayList();
	}

	public static void insertAtPos(int pos /* index + 1 */, int value) {
		if (count == 10) {
			System.out.println("List is full.");
			return;
		}
		if (pos > count + 1 || pos < 1) {
			System.out.println("Invalid position for given element");
			return;
		}
		if (pos == 1) {
			Node newNode = new Node(value, head);
			head = newNode;
			count++;
			return;
		}
		Node prev = head;
		for (int i = 1; i < pos - 1 && prev.getNext() != null; i++) {
			prev = prev.getNext();
		}

		Node newNode = new Node(value, prev.getNext());
		prev.setNext(newNode);
		count++;
	}

	public static void insertAtFirst(int i) {
		if (count == 10) {
			System.out.println("List is full");
			return;
		}
		Node newNode = new Node(i, null);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		count++;
	}

	public static void insertElement(int i) {

		if (count == 10) {
			System.out.println("Linked list in full.");
			return;
		}
		Node newNode = new Node(i, null);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		count++;
	}

	private static void displayList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.getValue() + (node.getNext() == null ? "" : " -> "));
			node = node.getNext();
		}

	}

}