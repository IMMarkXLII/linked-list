# linked-list

code for insertion
```
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
		if(prev == tail)
			tail = newNode;
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
```
