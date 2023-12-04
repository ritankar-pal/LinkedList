package in.dsa;

public class OddEvenIndicesLL {
	
	public Node<Integer> oddEvenList(Node<Integer> head) {

        if(head == null || head.next == null) return head;

        Node<Integer> even = head; 
        Node<Integer> odd = head.next;
        Node<Integer> temp = head.next;

        while(odd != null && odd.next != null){
            even.next = even.next.next; 
            odd.next = odd.next.next;

            even = even.next;
            odd = odd.next;
        }   

        even.next = temp;

        return head;

    }
}
