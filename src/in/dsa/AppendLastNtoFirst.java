package in.dsa;

/*
Following is the Node class already written for the Linked List
*/



public class AppendLastNtoFirst {

	public static Node<Integer> getNode(Node<Integer> head, int index){
		Node<Integer> curr = head;
		for(int i = 0; i < index; i++){
			curr = curr.next;
		}
		return curr;
	}

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here

		if(n == 0){
			return head;
		}

		Node<Integer> curr = head;
		Node<Integer> last = null;

		int length = 0; 
		while(curr != null){
			length++;
			if(curr.next == null) last = curr;
			curr = curr.next;
		}
		curr = head;

		//getting the index of the new node::
		int index = length - n;

		if(index < 0){
			return null;
		}

		Node<Integer> node = getNode(head, index);

		//getting the previous node::
		Node<Integer> prev = getNode(head, index-1);

		last.next = head;
		head = node;
		prev.next = null;

		return head;

	}

}
