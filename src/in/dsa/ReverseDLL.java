package in.dsa;

public class ReverseDLL {
	
	
	public Node reverseDLL(Node head) {
		
		if(head == null || head.next == null) return head;
		
		Node curr = head; 
		Node last = null;
		
		while(curr != null) {
			last = curr.prev;
			
			curr.prev = curr.next;
			curr.next = last;
			
			curr = curr.prev;
		}
		
		return last.prev;
	}
	
	
	
	
	private class Node{
		int data;
		Node next;
		Node prev;
		
		
		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
		
	}

}
