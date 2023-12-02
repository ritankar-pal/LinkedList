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
	
	public int lengthOfCycle(Node<Integer> head) {
		
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		
		int count = 0;
		
		while(fast != null && fast.next != null) {
			
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				
				do {
					slow = slow.next;
					count++;
				}
				while(slow != fast);
			}
		}
		
		return count;
	}
	
	public Node<Integer> cycleStart(Node<Integer> head){
		
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		
		int length = 0;
		
		//Finding the length of the cycle::
		while(fast != null && fast.next != null) {
			
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				
				do {
					slow = slow.next;
					length++;
				}
				while(slow != fast);
			}
		}
		
		if(length == 0) return null;
		
		Node<Integer> s = head;
		Node<Integer> f = head;
		
		//Moving s length times::
		while(length > 0) {
			s = s.next;
			length--;
		}
		
		//Moving f and s until they meet:
		while(f != s) {
			f = f.next;
			s = s.next;
		}
		
		//returning either s or f::
		return s;
		
	}
	
}
