
public class Try {

	Node head;
	
	static class Node {
		Node next;
		
		String data;
		
		Node(String data) {
			this.data = data;
		}
		
	}
	
	public static void main(String[] args) {
		Try list = new Try();
		list.head = new Node("1");
		list.head.next = new Node("2");
		list.head.next.next = new Node("3");
		
		Node head = list.head;
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}
	
}
