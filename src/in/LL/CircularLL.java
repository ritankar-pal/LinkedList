package in.LL;

public class CircularLL {
	
	private Node head;
	private Node tail;
	
	
	
	public CircularLL() {
		this.head = null;
		this.tail = null;
	}

	
	public void insert(int val) {
		Node node = new Node(val);
		
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		
		tail.next = node;
		node.next = head; 
		tail = node;
	}
	
	
	public void deleteNode(int val) {
		Node node = head; 
		
		if(node == null) return;
		
		if(node.value == val) {
			head = head.next;
			tail.next = head;
			return;
		}
		
		do {
			Node n = node.next;
			if(n.value == val) {
				node.next = n.next;
				break;
			}
		}
		while(node != head);
	}
	
	
	public void display() {
		Node node = head;
		
		if(head != null) {
			do {
				System.out.print(node.value + " -> ");
				node = node.next;
			}while(node != head);
			
			System.out.print("head");
		}
	}


	private class Node{
		
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		} 
	}
}		
