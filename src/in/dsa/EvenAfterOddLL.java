package in.dsa;


//Using Recursion:
public class EvenAfterOddLL {

	public static Node<Integer> evenAfterOdd(Node<Integer> head){

		if(head.next == null) return head;

		Node<Integer> node = evenAfterOdd(head.next);

		if(head.data % 2 != 0 && node.data % 2 == 0) {
			return head;
		}

		else if(head.data % 2 == 0 && node.data % 2 != 0) {

			Node<Integer> temp = node;

			while(temp != null) {

				if(temp.next != null) {
					if(temp.next.data % 2 == 0) {
						head.next = temp.next;
						temp.next = head;
						return node;
					}
					temp = temp.next;
				}
				else {
					temp.next = head; 
					head.next = null;
					temp = temp.next;
					return node;
				}

			}

		}
		else if(head.data % 2 != 0 && node.data % 2 != 0) {
			head.next = node;
			return head;
		}
		
		head.next = node;
		return head;
	}
}
