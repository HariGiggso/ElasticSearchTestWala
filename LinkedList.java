
public class LinkedList {

	Node head;
	
	static class Node {
		public Object data;
		public Node next;
		
		Node(Object data) {
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node("1");
		list.head.next = new Node("2");
		list.head.next.next = new Node("3");
		
		Node node = list.head;
		while(node != null) {
			System.out.println(node.data);
			Node current = node;
			node = current.next;
		}
		
		node = list.head;
		Node prev = null;
		Node temp = list.head;
		while(node != null) {
			temp = node.next;
			node.next = prev;
			prev = node;
			node = temp;
		}
		
		while(prev != null) {
			System.out.println(node.data);
			Node current = node;
			node = current.next;
		}
		
	}
		
}
