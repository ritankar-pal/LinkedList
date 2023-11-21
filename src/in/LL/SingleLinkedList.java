package in.LL;

public class SingleLinkedList {
	
	private Node head; 
	private Node tail;
	
	private int size; 
	
	public SingleLinkedList() {
		this.size = 0;
	}
	
	
	public Node get(int index) {
		
		Node node = head; 
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		
		return node;
	}
	
	
	public Node find(int value) {
		Node temp = head;
		
		while(temp != null) {
			
			if(temp.value == value) {
				return temp;
			}
			
			temp = temp.next;
		}
		
		return null;
	}
	
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		
		//making head point to the newly added node::
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		size++;
	}
	
	
	public void insert(int val, int index) {
		if(index == 0) {
			insertFirst(val);
		}
		else if(index == size) {
			insertLast(val);
		}
		else {
			Node temp = head; 
			for(int i = 1; i < index; i++) {
				temp = temp.next;
			}
			
			Node node = new Node(val, temp.next);
			temp.next = node;
			size++;
		}
	}
	
	
	public void insertLast(int val) {
		if(tail == null) {
			insertFirst(val);
		}
		else {
			Node node = new Node(val);
			tail.next = node; 
			tail = node;
			size++;
		}
	}
	
	
	public int deleteFirst() {
		int value = head.value;
		head = head.next;
		if(head.next == null) {
			tail = null;
		}
		size--;
		return value;
	}
	
	
	public int deleteLast() {
		if(size <= 1) {
			return deleteFirst();
		}
		
		Node secondLast = get(size-2);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;		
		
		size--;
		return val;
	}
	
	
	public int delete(int index) {
		if(index == 0) {
			return deleteFirst();
		}
		
		if(index == size-1) {
			return deleteLast();
		}
		
		Node prev = get(index-1);
		
		int val = prev.next.value;
		
		prev.next = prev.next.next;
		
		size--;
		return val;
	
	}
	
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.print("NULL");
	}
	
	
	private class Node{
		
		private int value; 
		private Node next;
		
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
	}
	
}
