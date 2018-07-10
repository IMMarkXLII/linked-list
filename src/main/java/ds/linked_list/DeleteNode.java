/**
 * @author ashish.adhikari
 */
package ds.linked_list;

/**
 * @author ashish.adhikari
 *
 */
public class DeleteNode {
	public void deleteNode(int pos /* index + 1 */) {
		if (LinkedList.count == 0) {
			System.out.println("List is empty.");
			return;
		}
		if(pos < 1 || pos > LinkedList.count) {
			System.out.println("Invalid position.");
			return;
		}
		if(pos == 1) {
			Node n = LinkedList.head.getNext();
			if(n== null) {
				LinkedList.head = LinkedList.tail = null;
			}
			LinkedList.head = n;
			LinkedList.count--;
		}else {
			Node node = LinkedList.head;
			for(int i = 0; i < pos-2; i++ ) {
				node = node.getNext();
			}
			if(node.getNext() == LinkedList.tail) {
				
				LinkedList.tail = node;
				node.setNext(null);
			}else {
				node.setNext(node.getNext().getNext());
			}
			LinkedList.count--;
		}
	}

	
}
