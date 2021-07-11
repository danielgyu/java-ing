import java.util.LinkedList;

public class LinkedList {
	public static int iterativeLength(Node head) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static int recursiveLength(Node head) {
		if (head == null) {
			return 0;
		} else {
			return 1 + recursiveLength(head.next);
		}
	}

	public static void main(String argv[]) {
		LinkedList llist = new LinkedList();
		llist.push(1);
		llist.push(1);
		llist.push(3);
		llist.push(3);

		System.out.println("iterative count: " + iterativeLength(llist.head));
		System.out.println("recursive count: " + iterativeLength(llist.head));
	}
}
