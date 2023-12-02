package in.dsa;

public class CyclicLL {
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
	
	public boolean hasCycle(Node<Integer> head) {
		
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		
		while(fast != null && fast.next != null) {
			
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				return true;
			}
		}
		
		return false;
		
	}
	
}
