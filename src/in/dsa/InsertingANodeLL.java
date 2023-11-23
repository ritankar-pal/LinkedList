package in.dsa;

/*
Following is the Node class already written for the Linked List
 */

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}

public class InsertingANodeLL {

	public static Node<Integer> insertFirst(Node<Integer> head, int pos, int data){
		Node<Integer> node = new Node<Integer>(data);
		node.next = head;
		head = node;
		return head;
	}

	public static Node<Integer> insertLast(Node<Integer> head, Node<Integer> last, int pos, int data){
		Node<Integer> node = new Node<Integer>(data);
		last.next = node;
		last = node;
		return head;
	}

	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
		Node<Integer> curr = head;
		Node<Integer> last = null;

		//length of LL::
		int length = 0;
		while(curr != null){
			length++;
			if(curr.next == null) last = curr;
			curr = curr.next;
		}
		//Returning the curr pointer to the head::
		curr = head;


		if(pos > length) return head;

		if(pos == 0){
			return insertFirst(head, pos, data);
		}

		if(pos == length){
			return insertLast(head, last, pos, data);
		}

		Node<Integer> node = new Node<Integer>(data);
		int i = 1;
		while(i < pos){
			curr= curr.next;
			i++;
		}
		node.next = curr.next;
		curr.next = node;

		return head;
	}
}