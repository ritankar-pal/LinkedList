package in.LL;


public class DoublyLinkedList {

	private Node head; 
	
	public void insertFirst(int val) {
		
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}
		head = node;
	}
	
	
	public void insertLast(int val) {
		Node node = new Node(val);
		Node last = head;
		
		node.next = null; 
		
		if(head == null) {
			node.prev = null;
			head = node;
			return;
		}
		
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = node;
		node.prev = last;
	}
	
	
	public Node find(int value) {
		Node temp = head;
		
		while(temp != null) {
			
			if(temp.val == value) {
				return temp;
			}
			
			temp = temp.next;
		}
		
		return null;
	}
	
	
	public void insert(int after, int val) {
		Node p = find(after);
		if(p == null) {
			System.out.println("Node Doesn't Exist");
			return;
		}
		
		Node node = new Node(val);
		
		node.next = p.next;
		p.next = node;
		node.prev = p;
		if(node.next != null) {
			node.next.prev = node;
		}
		
	}
	
	public void display() {
		Node temp = head;
		Node tail = null;
		
		//printing Forward::
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			tail = temp;
			temp = temp.next;
		}
		System.out.println("NULL");
		
		//Printing Backward::
		while(tail != null) {
			System.out.print(tail.val + " -> ");
			tail = tail.prev;
		}
		System.out.print("NULL");
	}
	
	
	
	
	private class Node{
		
		private int val; 
		private Node next; 
		private Node prev;
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
	}
	
}
