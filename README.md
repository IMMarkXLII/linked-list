# linked-list

code for insertion

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
