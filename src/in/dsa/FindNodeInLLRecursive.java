package in.dsa;

public class FindNodeInLLRecursive {
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


	public static int findNodeRec(Node<Integer> head, int n, int index){
		if(head == null) return -1;

		if(head.data == n) return index;

		int res = findNodeRec(head.next, n, index+1);

		return res;

	}
	public static int findNodeRec(Node<Integer> head, int n) {
		//Your code goes here
		if(head == null) return -1;

		return findNodeRec(head, n, 0);

	}

}

