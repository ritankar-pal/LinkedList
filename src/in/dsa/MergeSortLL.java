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

public class MergeSortLL {

    public static Node<Integer> midOfLL(Node<Integer> head){

        if(head == null || head.next == null) return head;

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while(fast.next != null){

            if(fast.next.next == null) return slow;

            slow = slow.next;
            fast = fast.next.next; 
        }

        return slow;
    }

    public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2){
        
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

        if(head1.data <= head2.data) return head1;
        else return head2;
    }

	public static Node<Integer> mergeSort(Node<Integer> head) {
		//Your code goes here

        //base case::
        if(head == null || head.next == null) return head;

        //calculate the mid of LL::
        Node<Integer> midNode = midOfLL(head);

        Node<Integer> part1Head = head; 
        Node<Integer> part2Head = midNode.next;

        //Breaking the node:: 
        midNode.next = null;

        Node<Integer> head1 = mergeSort(part1Head);
        Node<Integer> head2 = mergeSort(part2Head);

        Node<Integer> result = mergeTwoSortedLL(head1, head2);
        return result;
	}

}
