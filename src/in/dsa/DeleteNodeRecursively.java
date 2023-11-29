package in.dsa;

public class DeleteNodeRecursively {

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

	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
		//Your code goes here
		if(head == null) return head;

		if(pos == 0){
			return head.next;
		}

		Node<Integer> node = deleteNodeRec(head.next, pos-1);
		head.next = node;

		return head;
	}

}

