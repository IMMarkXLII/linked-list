package ds.linked_list;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Node {
	private int value;
	private Node next;
}
