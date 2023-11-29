package in.dsa;

public class ReverseNodeRecursively {
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

	public static Node<Integer> reverseRec(Node<Integer> head) {
		//Your code goes here

        if(head == null) return head;

        if(head.next == null){
            return head;
        }

        Node<Integer> node =  reverseRec(head.next);
        head.next.next = head; 
        head.next = null;

        return node;

	}
}
