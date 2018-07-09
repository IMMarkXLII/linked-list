package ds.linked_list;

public class LinkedList
{	
	static Node head = null;
	static Node tail = null;
	static int count = 0;
	
	public static void main( String[] args ){
		
		insertElement(11);
		insertElement(12);
		insertElement(13);
		
		// print the linked list
		displayList();
	}	
	

	public static void insertElement(int i) {
		
		if(count == 10) {
			System.out.println("Linked list in full.");
			return;
		}
		Node newNode = new Node(i, null);
		if(head == null) {
			head = tail = newNode;
		}else {
			tail.setNext(newNode);
			tail = newNode;
		}	
		count++;
	}
	
	private static void displayList() {
		Node node = head;
		while(node != null) {
			System.out.print(node.getValue() + (node.getNext()==null ? "" : " -> " ));
			node = node.getNext();
		}
		
	}
	
	
	
	
}