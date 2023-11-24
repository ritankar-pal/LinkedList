package in.dsa;

/*

Following is the Node class already written for the Linked List

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
    	this.data = data;
	}
}

 */

public class PalindromeLL {

	public static Node<Integer> get(Node<Integer> head, int index){
		Node<Integer> curr = head;
		for(int i = 0; i < index; i++){
			curr = curr.next; 
		}
		return curr;
	}


	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		if(head == null || head.next == null) return true; 

		Node<Integer> curr = head;
		int length = 0;
		while(curr != null){
			length++;
			curr = curr.next;
		}

		for(int i = 0; i < length/2; i++){
			Node<Integer> n1 = get(head, i);
			Node<Integer> n2 = get(head, length-i-1);

			if(!(n1.data.equals(n2.data))) return false;
		}

		return true;

	}

}