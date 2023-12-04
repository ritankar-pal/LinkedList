package in.dsa;


public class AddTwoNosLL {
	
	public Node addTwoNos(Node num1, Node num2) {
		
		Node dummyHead = new Node(-1);
		
		Node curr = dummyHead;
		Node temp1 = num1;
		Node temp2 = num2;
		
		int carry = 0;
		
		while(temp1 != null || temp2 != null) {
			
			int sum = carry;
			
			if(temp1 != null) sum = sum + temp1.data;
			if(temp2 != null) sum = sum + temp2.data;
			
			Node newNode = new Node(sum % 10);
			carry = sum / 10;
				
			curr.next = newNode; 
			curr = curr.next;
			
			if(temp1 != null) temp1 = temp1.next;
			if(temp2 != null) temp2 = temp2.next;
		}
		
		if(carry > 0) {
			Node node = new Node(carry);
			curr.next = node;
		}
		
		
		return dummyHead.next; //new head of the node.
	}
	
	
	
	private class Node{
		int data;
		Node next;
		
		
		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
		
	}

}
