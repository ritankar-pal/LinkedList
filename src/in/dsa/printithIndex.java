package in.dsa;

public class printithIndex {

	public static void printIthNode(Node<Integer> head, int index){
		Node<Integer> temp = head;
		int count = 0;

		while(temp != null){
			if(count == index){
				System.out.println(temp.data);
				return;
			}
			count++;
			temp = temp.next;
		}

	}


	public class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}
	
}
