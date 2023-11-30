package in.dsa;

public class FindMiddleOfLL {
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

	public static Node<Integer> midPoint(Node<Integer> head) {
		//Your code goes here

		if(head == null || head.next == null) return head; 

		//slow will jump node by node::
		Node<Integer> slow = head;     

		//fast will jump 2 nodes at once::   
		Node<Integer> fast = head;        

		while(fast.next != null){

			//if the node is even in length::
			if(fast.next.next == null) return slow;

			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;

	}

}
