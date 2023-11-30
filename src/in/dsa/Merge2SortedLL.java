package in.dsa;

public class Merge2SortedLL {
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


	public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
		//Your code goes here

		if(head1 == null || head2 == null){
			if(head1 == null) return head2;
			else return head1;
		} 

		Node<Integer> i = head1;
		Node<Integer> j = head2; 
		Node<Integer> p = null;

		while(i != null && j != null){

			if(i.data <= j.data){
				if(p != null) p.next = i;
				p = i; 
				i = i.next;
			}
			else{
				if(p != null) p.next = j;
				p = j; 
				j = j.next;
			}

		}
		
		if(i != null) p.next = i;
		else p.next = j;
		
		//checking the smaller value of head and returning that::
		if(head1.data <= head2.data) return head1;
		else return head2;

	}

}
